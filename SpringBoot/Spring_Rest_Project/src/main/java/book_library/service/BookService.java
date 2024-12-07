package book_library.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_library.entity.Book;
import book_library.repository.BookRepository;
@Service //Marks this class as a Service and it is managed by Spring
public class BookService {
	@Autowired
	private BookRepository bookRepositoryReference;
	
public Collection<Book>getAllBooks(){
	Collection<Book>allAvailableBooks=bookRepositoryReference.getAllBooks();
	return allAvailableBooks;
	
}

public Book getOneBook(int bookId) {
Book foundBook=	bookRepositoryReference.getOneBook(bookId);
return foundBook;
}

public void createNewBook(Book newBook) {
	bookRepositoryReference.createNewBook(newBook);
	
}

}
