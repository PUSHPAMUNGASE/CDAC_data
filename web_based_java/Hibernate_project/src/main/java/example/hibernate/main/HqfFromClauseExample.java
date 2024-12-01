package example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.utils.HibernateConfig;

public class HqfFromClauseExample {

	public static void main(String[] args) {

		try(
				SessionFactory factory= HibernateConfig.getSessionFactory();
				Session session=factory.openSession();
				
				
		){
			
			String hqlQuery="from Actor act";
			Query<Actor> queryRef=
			session.createQuery(hqlQuery,Actor.class);
			List<Actor>allActors=queryRef.list();
			for(Actor currentActor:allActors)
				System.out.println(currentActor);
			System.out.println("========================================");
			allActors.stream().
			forEach(currentActor -> System.out.println(currentActor.getFirstName()));
			
			
		}catch(Exception ex) {
					ex.printStackTrace();
	   }
	}

}
