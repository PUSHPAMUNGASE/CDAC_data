package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.utils.HibernateConfig;

public class RecordRetrivalExample {

	public static void main(String[] args) {
		
		try(
				
				
				SessionFactory factory = HibernateConfig.getSessionFactory();
				Session session=factory.openSession();
		    ){
			//Loading an entity of type:Actor against on ID:A03
			Actor foundActor=session.find(Actor.class, "A04");
			if(foundActor!=null) {
			System.out.println("Found Actor :" + foundActor);
			
			System.out.println("First Name:" + foundActor.getFirstName());
			}else {
				System.out.println("Actor with given Id does not exist");
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
