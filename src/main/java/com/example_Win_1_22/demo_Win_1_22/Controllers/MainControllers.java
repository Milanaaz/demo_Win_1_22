package com.example_Win_1_22.demo_Win_1_22.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainControllers {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "hello everyone!!!!!!");
        return "index";
    }

    @GetMapping("/news")
    public String news(Model model) {
        return "news";
    }
    @GetMapping("/podcasts")
    public String podcasts(Model model) {
        return "podcasts";
    }
    @GetMapping("/compilations")
    public String compilations(Model model) {
        return "compilations";
    }
}