package gr.codehub.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HackathonApplication {
    public static void main(String[] args) {
        SpringApplication.run(HackathonApplication.class);
    }
}









// Base classes:
// BaseService, BaseServiceImpl
// Services for:
// Author (AuthorService from BaseService, AuthorServiceImpl from BaseServiceImpl)
// The same for BlogPost and Book
// AuthorService: void assign(Author author, Content content, BigDecimal cost)












