package ru.spanferov.learning.smcs.fee;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Random;

@RestController
public class FeeController {

//    private final Integer rate = 3;

    @RequestMapping(value = "/fee", method = RequestMethod.GET)
    public FeeDTO rent(@RequestParam Optional<Integer> count) {
        return new FeeDTO(count.orElse(0) + new Random().nextInt(10));
    }

}
