package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public class LazyStudent {
    private final SearchService service;
    private final String nameOfTheTextBook;

    LazyStudent(SearchService service, String nameOfTheTextBook) {
        this.service = service;
        this.nameOfTheTextBook = nameOfTheTextBook;
    }

    public List<Integer> findTheAnswer(String examQuestion) {
        System.out.println(examQuestion);
        return service.find(nameOfTheTextBook, examQuestion);
    }
}
