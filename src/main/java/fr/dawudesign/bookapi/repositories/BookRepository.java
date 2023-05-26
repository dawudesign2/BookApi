package fr.dawudesign.bookapi.repositories;

import fr.dawudesign.bookapi.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
     Iterable<Book> findByTitleContaining(String title);
}
