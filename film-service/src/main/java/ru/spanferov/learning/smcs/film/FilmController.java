package ru.spanferov.learning.smcs.film;

import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FilmController implements CommandLineRunner {


    private static List<Film> films = new ArrayList<Film>();

    public void run(String... strings) throws Exception {
        films.add(new Film(1L, "Назад в будущее", "Роберт Земекис", 1985));
        films.add(new Film(2L, "Зеленая миля", "Зеленая миля", 1999));
        films.add(new Film(3L, "2001 год: Космическая одиссея", "Стэнли Кубрик", 1968));
        films.add(new Film(4L, "Война и мир", "Бондарчук, Сергей Фёдорович", 1965));
        films.add(new Film(5L, "Война и мир", "Том Харпер", 2016));
        films.add(new Film(6L, "Тихий Дон", "Сергей Герасимов", 1957));
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Film> list(@RequestParam(value = "ids", required = false) List<Long> ids) {
        if (ids != null && !ids.isEmpty()) {
            return films.stream().filter(f -> ids.contains(f.getId())).collect(Collectors.toList());
        } else {
            return films;
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Film get(@PathVariable Integer id) {
        return films.get(id);
    }

}
