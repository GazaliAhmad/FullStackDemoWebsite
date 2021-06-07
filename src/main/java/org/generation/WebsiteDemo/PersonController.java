package org.generation.WebsiteDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(Model model){
        model.addAttribute("description","Website Demo");
        model.addAttribute("tech", "Java, Gradle, Spring, Thymeleaf and Bootstrap");
        model.addAttribute("table1", "List of people in a Bootstrap table");
        model.addAttribute("people", Arrays.asList(
                new Person("John", 20),
                new Person("Lisa", 24),
                new Person("Mark", 36)
        ));
        return "people";
    }
}
