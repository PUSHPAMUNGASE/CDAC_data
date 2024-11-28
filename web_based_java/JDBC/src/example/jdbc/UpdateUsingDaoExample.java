package example.jdbc;

import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurantDao;
import example.jdbc.utils.Restaurant;

public class UpdateUsingDaoExample {

	public static void main(String[] args) {
		DaoInterface<Restaurant, Integer> daoRef=new RestaurantDao();
		//obtaining a Reataurant on which update is to be performed
		Restaurant rst = daoRef.retrieveOne(104);
		//Restaurant rst =daoRef.retriveAll();
		
		//Changing the name and branch count using setters
		rst.setName("New Little Italy");
		rst.setBranchCount(20);
		//reflecting this changed state back to DB
		daoRef.update(rst);

	}

}
