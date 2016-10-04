package ru.spanferov.learning.smcs.rent;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class RentController {

    private AtomicInteger entityCount = new AtomicInteger(Integer.MAX_VALUE);

    @RequestMapping(value = "/rent", method = RequestMethod.GET)
    public RentDTO rent(@RequestParam Optional<Integer> count, HttpServletRequest request) {

        URI feeUri= UriComponentsBuilder.fromUriString("http://localhost:8081")
                .path("/fee")
                .queryParam("count", count.orElse(0))
                .build()
                .toUri();

        URI finkUri= UriComponentsBuilder.fromUriString("http://localhost:8082")
                .path("/fink")
                .build()
                .toUri();


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<FeeDTO> fee = restTemplate.getForEntity(feeUri, FeeDTO.class);

        FinkDTO finkDTO = new FinkDTO(request.getRemoteAddr(), count.orElse(0), fee.getBody().getFee());
        ResponseEntity<HttpStatus> fink = restTemplate.postForEntity(finkUri, finkDTO, HttpStatus.class);

        return new RentDTO(entityCount.addAndGet( -1 * count.orElse(0) ), fee.getBody().getFee());
    }

}
