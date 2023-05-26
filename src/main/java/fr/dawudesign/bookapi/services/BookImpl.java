package fr.dawudesign.bookapi.services;

import fr.dawudesign.bookapi.controllers.exceptions.ParametrizeMessageException;
import fr.dawudesign.bookapi.entities.Book;
import fr.dawudesign.bookapi.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookImpl implements BookService {

    private final BookRepository bookRepository;
    @Override
    public List<Book> getAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElseThrow(() -> new ParametrizeMessageException(
                HttpStatus.NOT_FOUND,
                "Book.entity.not.found ",
                "Book with id %s not found",
                id
        ));
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id, Book book) {
        if(!bookRepository.existsById(id)) {
            throw new ParametrizeMessageException(
                    HttpStatus.NOT_FOUND,
                    "Book.entity.not.found ",
                    "Book with id %s not found",
                    id
            );
        }
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findByTitleContaining(String title) {
        return bookRepository.findByTitleContaining(title);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
