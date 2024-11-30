package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Movie;
import example.hibernate.utils.hibernateUtils;


public class RecordInsertionExample2 {

	public static void main(String[] args) {
	//this program 
           try(
				SessionFactory factory = hibernateUtils.getSessionFactory();
				Session session=factory.openSession();
				
				){
			 Movie MovieObj= new Movie("M03","Dangal","Inspi",2015);
			 Transaction tx=session.beginTransaction();
			 session.persist(MovieObj);
			 tx.commit();
			 System.out.println("Record inserted!!");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
