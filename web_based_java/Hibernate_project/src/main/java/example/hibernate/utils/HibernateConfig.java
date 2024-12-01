package example.hibernate.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Film;
import example.hibernate.entity.Song;
import example.hibernate.main.Actor;

public class HibernateConfig {
	
	public static SessionFactory getSessionFactory() {
		
		Properties  configProperties= new Properties();
		configProperties.put("hibernate.connection.url","jdbc:mysql://localhost:3306/bollywood");
		configProperties.put("hibernate.connection.username","root");
		configProperties.put("hibernate.connection.password","password");
		configProperties.put("hibernate.show_sql","true");
		configProperties.put("hibernate.hbm2ddl.auto","update");
		Configuration conf=new Configuration();
		conf.setProperties(configProperties);
		
		conf.addAnnotatedClass(Actor.class);
		conf.addAnnotatedClass(Film.class);
		conf.addAnnotatedClass(Song.class);
		
		
		SessionFactory factory=conf.buildSessionFactory();
		return factory;
		
	}

}