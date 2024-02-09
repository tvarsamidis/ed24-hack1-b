package gr.codehub.hackathon.service;

import gr.codehub.hackathon.model.Book;
import gr.codehub.hackathon.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl extends BaseServiceImpl<Book> implements BookService {
    private final BookRepository bookRepository;

    @Override
    public JpaRepository<Book, Long> getRepository() {
        return bookRepository;
    }
}
