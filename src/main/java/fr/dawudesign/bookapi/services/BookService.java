package fr.dawudesign.bookapi.services;

import fr.dawudesign.bookapi.entities.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book getBookById(Long id);

     Book addBook(Book book);

     Book updateBook(Long id, Book book);

     List<Book> findByTitleContaining(String title);

   void deleteBook(Long id);
}
