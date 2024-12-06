package book_library.repository;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import book_library.entity.Book;
import book_library.store.BookStore;
@Repository  //managed by Spring
public class BookRepository {
public Collection<Book> getAllBooks(){
	Collection<Book> allAvailableBooks=BookStore.getAllBooks();
	return allAvailableBooks;
	
}
}