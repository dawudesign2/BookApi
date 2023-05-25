package fr.dawudesign.bookapi.repositories;

import fr.dawudesign.bookapi.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
     List<Book> findByTitleContaining(String title);
}
