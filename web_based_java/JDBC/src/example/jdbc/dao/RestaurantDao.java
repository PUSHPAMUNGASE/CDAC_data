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
			e.printStackTrace();
		}
		return foundRestaurant;
			
	}

	@Override
	public void create(Restaurant newRestaurant) {
	//This method accepts
	//a "Reastaurant" object:newRestaurant and  stores it as a record in the DB table
		String sqlQuery="insert into restaurant_master values(?,?,?,?)";
		try(
				Connection conn=JdbcUtils.getConnection();
					PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
					){
			
		//Extracting the values from Restaurant object:newRestaurant using getter method
			int restaurantId = newRestaurant.getRestaurantId();
			String restaurantName=newRestaurant.getName();
			int branchCount = newRestaurant.getBranchCount();
			String restaurantCuisine = newRestaurant.getCuisine();
			//Substituing the values in place of '?' using PreparedStatement
			pstmt.setInt(1,restaurantId);
			pstmt.setString(2, restaurantName);
			pstmt.setString(3, restaurantCuisine);
			pstmt.setInt(4, branchCount);
			 int updateCount=pstmt.executeUpdate();
			 System.out.println(updateCount+" record inserted.");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void update(Restaurant modifiedRestaurant) {
	//this method receives the modified state of the Restaurant
		//object:modifiedRestaurant and reflects that state into DB
		String sqlQuery="update restaurant_master set rest_name=?,rest_cuisine=?,rest_branch_count=? where rest_id=?";
		try(
				Connection conn=JdbcUtils.getConnection();
					PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
					){
			//capturing the modified state of Restaurant object.modified
			
			int restaurantId = modifiedRestaurant.getRestaurantId();
			String restaurantName=modifiedRestaurant.getName();
			int branchCount = modifiedRestaurant.getBranchCount();
			String restaurantCuisine = modifiedRestaurant.getCuisine();
			
			pstmt.setInt(4,restaurantId);
			pstmt.setString(1, restaurantName);
			pstmt.setString(2, restaurantCuisine);
			pstmt.setInt(3, branchCount);
			 int updateCount=pstmt.executeUpdate();
			 System.out.println(updateCount+" record updated.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		}

	@Override
	public void delete(Integer id) {
		String sqlQuery="delete from restaurant_master where rest_id=?";
		try(
				Connection conn=JdbcUtils.getConnection();
					PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
					){
			//capturing the modified state of Restaurant object.modified
			
		
			
			pstmt.setInt(1,id);
		
			 int deleteCount=pstmt.executeUpdate();
			 System.out.println( deleteCount+" record deleted.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	

	
	}


