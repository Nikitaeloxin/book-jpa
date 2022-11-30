package telran.java2022.book.dao;

import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

import telran.java2022.book.model.Author;
import telran.java2022.book.model.Book;
import telran.java2022.book.model.Publisher;

public interface BookRepository extends CrudRepository<Book, String> {
	Stream<Book> findByAuthors(Author author);
	Stream<Book> findByPublisher(Publisher publisher);
	void deleteByAuthors(Author author);

}
