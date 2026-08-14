package webscrappingcom.example.demo.controller;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import webscrappingcom.example.demo.service.BookScraperService;

import java.io.IOException;

@RestController
public class BookController {

    private final BookScraperService bookScraperService;

    public BookController(BookScraperService bookScraperService) {
        this.bookScraperService = bookScraperService;
    }

    @GetMapping("/scrape")
    public String scrape() throws IOException {

        bookScraperService.scrapeBooks();

        return "Scraping completed!";
    }
}