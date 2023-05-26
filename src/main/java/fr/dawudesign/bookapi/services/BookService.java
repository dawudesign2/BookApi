package fr.dawudesign.bookapi.services;

import fr.dawudesign.bookapi.entities.Book;


public interface BookService {

    Iterable<Book> getAllBooks();

    Book getBookById(Long id);

     Book addBook(Book book);

     Book updateBook(Long id, Book book);

     Iterable<Book> findByTitleContaining(String title);

   void deleteBook(Long id);
}
