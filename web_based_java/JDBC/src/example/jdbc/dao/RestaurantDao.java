package example.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import example.jdbc.utils.JdbcUtils;
import example.jdbc.utils.Restaurant;

public class RestaurantDao implements DaoInterface<Restaurant, Integer> {

	@Override
	public Collection<Restaurant> retriveAll() {
		// This methods connects to DB, fetches all the records, convert them into java
		// Object of
		// Restaurant class, puts those objects into some collection and returns the
		// Collection.
		Collection<Restaurant> allRestaurants = new ArrayList<Restaurant>();
		String sqlQuery = "select * from restaurant_master";

		try (Connection conn = JdbcUtils.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);

		) {
			while (rs.next()) {
				int restaurantId = rs.getInt(1);
				String restaurantName = rs.getString(2);
				int branchCount = rs.getInt(4);
				String restaurantCuisine = rs.getString(3);
				//Building java object(Reataurant)based upon values
				Restaurant rst = new Restaurant(restaurantId, restaurantName, restaurantCuisine, branchCount);
				//Adding this data into the arraylist
				allRestaurants.add(rst);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return allRestaurants;
	}

	@Override
	public Restaurant retrieveOne(Integer id) {
		Restaurant foundRestaurant=null;
		String sqlQuery="select * from restaurant_master where rest_id=?";
	 
		
		try(
			Connection conn=JdbcUtils.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
				){
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int restaurantId = rs.getInt(1);
				String restaurantName = rs.getString(2);
				int branchCount = rs.getInt(4);
				String restaurantCuisine = rs.getString(3);
				//Building java object(Reataurant)based upon values
				foundRestaurant = new Restaurant(restaurantId, restaurantName, restaurantCuisine, branchCount);
			}
			
		}catch(Exception e) {
			
		}
		return foundRestaurant;
			
	}

}
