package fr.dawudesign.bookapi.services;

import fr.dawudesign.bookapi.entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    public List<Book> getAllBooks();

    Book getBookById(Long id);

    public Book addBook(Book book);

    public Book updateBook(Long id, Book book);

    public void deleteBook(Long id);
}
