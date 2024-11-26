package example.jdbc;

import java.util.Collection;

import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurantDao;
import example.jdbc.utils.Restaurant;

public class RetriveAllUsingDaoExample {

	public static void main(String[] args) {
       DaoInterface<Restaurant, Integer> daoRef=new RestaurantDao();
       Collection<Restaurant> allAvailableRestaurants=daoRef.retriveAll();
       for(Restaurant currentRestaurant:allAvailableRestaurants)
    	   System.out.println(currentRestaurant);
System.out.println("====================below from toString and forEach==================");
allAvailableRestaurants.stream().forEach(rst->System.out.println(rst));
	}

}
