package book_library.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import book_library.entity.Book;

public class BookStore {

	private static Map<Integer,Book>allBooks;
	static {
		allBooks=new HashMap<>();
		Book b1=new Book(101,"Java Complete Reference","Patrick Naughton",875.45f);
		Book b2=new Book(102,"Let us c","Patrick Naughton",67.67f);
		Book b3=new Book(103,"Let us c++","Yashwant k",645.23f);
		allBooks.put(b1.getBookId(), b1);
		allBooks.put(b2.getBookId(), b2);
		allBooks.put(b3.getBookId(), b3);
	}

	public static Collection<Book>getAllBooks(){
		Collection<Book>allAvailableBooks=allBooks.values();
		return allAvailableBooks;
	}

	//A method to return one book against its ID
	public static Book getOneBook(int bookId) {
		Book foundBook=allBooks.get(bookId);
		return foundBook;
	}
	
	//A method to add a new book
	public static void createNewBook(Book newBook) {
		allBooks.put(newBook.getBookId(), newBook);
		
		
	}
}
