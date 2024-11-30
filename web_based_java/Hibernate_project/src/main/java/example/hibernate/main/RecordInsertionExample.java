package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Movie;



public class RecordInsertionExample {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf=conf.configure();
		
		SessionFactory factory= conf.buildSessionFactory();
		//Obtain a session using session factory
		Session currentSession=factory.openSession();
		
		//Create an entity class object
		Movie movieObject=new Movie("M02","Singham Again","Action",2018);
		
		//Obtain a transaction and start the same
		Transaction tx=currentSession.beginTransaction();
		//store the entity class object into Movie
		currentSession.persist(movieObject);
		
		//Commit the tasnsaction
		tx.commit();
		//close the session
		currentSession.close();
		//close the sessionFactory
		factory.close();
		System.out.println("Record added!!");

	}

}
