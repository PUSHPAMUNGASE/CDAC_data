package example.jdbc.utils;

public class Restaurant {
private int restaurantId;
private String name;
private String cuisine;
private int branchCount;
public Restaurant(int restaurantId, String name, String cuisine, int branchCount) {
	super();
	this.restaurantId = restaurantId;
	this.name = name;
	this.cuisine = cuisine;
	this.branchCount = branchCount;
}
@Override
public String toString() {
	return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", cuisine=" + cuisine + ", branchCount="
			+ branchCount + "]";
}



}
