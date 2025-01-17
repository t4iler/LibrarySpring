package library.repository;

import library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTranscript(String tra);
    List<Book> findAllByExistAndAgeAccessGreaterThan(Boolean b, Integer integer);
    List<Book> findAllByExistAndAgeAccessLessThan(Boolean b, Integer integer);
}