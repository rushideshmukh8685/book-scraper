package webscrappingcom.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndependanceDayController {
    @GetMapping("/india")
    public String wish(){
        return "Jai Hind";
    }

}
