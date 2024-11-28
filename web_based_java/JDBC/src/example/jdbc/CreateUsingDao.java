package example.jdbc;

import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurantDao;
import example.jdbc.utils.Restaurant;

public class CreateUsingDao {

	public static void main(String[] args) {
		DaoInterface<Restaurant, Integer> daoRef=new RestaurantDao();
		Restaurant rst=new Restaurant(106, "Mainland China", "Chinese", 5);
		daoRef.create(rst);

	}

}
