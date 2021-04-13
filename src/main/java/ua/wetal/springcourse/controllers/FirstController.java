package ua.wetal.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

// добавление этого маппинга дает то, что теперь ссылка
// будет не  http://localhost:8080/hello а http://localhost:8080/first/hello
// и перестанут работать ссылки перехода
@RequestMapping("/first")

public class FirstController {

    @GetMapping("/hello")
    public String helloPage() {
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}