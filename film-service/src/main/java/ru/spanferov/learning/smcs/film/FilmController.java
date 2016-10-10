package ru.spanferov.learning.smcs.film;

import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilmController implements CommandLineRunner {


    private static List<Film> films = new ArrayList<Film>();

    public void run(String... strings) throws Exception {
        films.add(new Film(1L, "Назад в будущее", "Роберт Земекис", 1985));
        films.add(new Film(1L, "Зеленая миля", "Зеленая миля", 1999));
        films.add(new Film(1L, "2001 год: Космическая одиссея", "Стэнли Кубрик", 1968));
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Film> list() {
        return films;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Film get(@PathVariable Integer id) {
        return films.get(id);
    }

}
