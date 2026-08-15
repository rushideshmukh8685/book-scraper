package webscrappingcom.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookInfoController {

    @GetMapping("/books/info")
    public String getBookInfo() {
        return "Book information feature is working";
    }
}