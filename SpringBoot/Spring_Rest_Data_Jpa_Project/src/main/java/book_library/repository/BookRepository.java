package book_library.repository;



import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import book_library.entity.Book;

//@repository is not required because JpaRepository already managed component since 
//BookRepository is inherited from it , it also becomes a managed component.


public interface BookRepository extends JpaRepository<Book, Integer>{

	
}
