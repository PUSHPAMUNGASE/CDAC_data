package example.jdbc.dao;

import java.util.Collection;

public interface DaoInterface<T,K>{
//A method to retrieve  all records
	Collection<T>retriveAll();
	
	
	//A method to retrieve a single record based upon its identity
	T retrieveOne(K key);
	
}
