package example.jdbc;

import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurantDao;
import example.jdbc.utils.Restaurant;

public class DeleteUsingDaoExample {

	public static void main(String[] args) {
		  DaoInterface<Restaurant, Integer> daoRef=new RestaurantDao();
		  daoRef.delete(101);

	}

}
