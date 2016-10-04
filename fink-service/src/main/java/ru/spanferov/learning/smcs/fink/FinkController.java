package ru.spanferov.learning.smcs.fink;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FinkController {

    @RequestMapping(value = "/fink", method = RequestMethod.POST)
    public ResponseEntity rent(@RequestBody FinkDTO finkDTO) {
        System.out.println(finkDTO.toString());
        return new ResponseEntity(HttpStatus.OK);
    }

}
