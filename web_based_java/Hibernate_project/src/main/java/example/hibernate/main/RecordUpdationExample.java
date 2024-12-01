package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.utils.HibernateConfig;

public class RecordUpdationExample {
	
	public static void main(String[] args) {
		
	
	try(
			
			
			SessionFactory factory = HibernateConfig.getSessionFactory();
			Session session=factory.openSession();
	    ){
		//Loading an entity of type:Actor against on ID:A03
		Actor foundActor=session.find(Actor.class, "A03");
		Transaction tx=session.beginTransaction();
		foundActor.setFirstName("Ranbir");
		foundActor.setLastName("Kapoor");
		tx.commit();
	}catch(Exception ex) {
		
		ex.printStackTrace();
	}
	
}
	
}
