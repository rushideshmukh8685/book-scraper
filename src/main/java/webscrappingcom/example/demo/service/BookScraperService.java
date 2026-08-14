package webscrappingcom.example.demo.service;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class BookScraperService {

    private static final String URL = "https://books.toscrape.com/";

    public void scrapeBooks() throws IOException {

        Document document = Jsoup.connect(URL)
                .userAgent("Mozilla/5.0")
                .get();

        Elements books = document.select("article.product_pod");

        for (Element book : books) {

            // Book title
            String title = book.select("h3 a").attr("title");

            // Book price
            String price = book.select(".price_color").text();

            // Book rating
            String rating = book.select(".star-rating").attr("class");
            rating = rating.replace("star-rating", "").trim();

            // Stock availability
            String availability = book.select(".availability").text().trim();

            System.out.println("Title: " + title);
            System.out.println("Price: " + price);
            System.out.println("Rating: " + rating);
            System.out.println("Availability: " + availability);
            System.out.println("-------------------------");
        }
    }
}
