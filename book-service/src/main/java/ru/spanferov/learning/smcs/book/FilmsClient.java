package ru.spanferov.learning.smcs.book;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("film-service")
public interface FilmsClient {

    @RequestMapping(method = RequestMethod.GET)
    List<Film> list(@RequestParam(value = "ids") List<Long> ids);

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Film get(@PathVariable("id") Integer id);

}
