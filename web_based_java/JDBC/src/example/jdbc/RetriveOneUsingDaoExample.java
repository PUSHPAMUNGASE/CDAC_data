package example.jdbc;

import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurantDao;
import example.jdbc.utils.Restaurant;

public class RetriveOneUsingDaoExample {

	public static void main(String[] args) {
		DaoInterface<Restaurant, Integer> daoRef=new RestaurantDao();
		Restaurant restaurantObj=daoRef.retrieveOne(103);
		if(restaurantObj!=null) {
			System.out.println(restaurantObj);
		}else {
			System.out.println("Restaurant with given ID does not exist");
		}
	

	}

}
