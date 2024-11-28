package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.pojo.Restaurant;

/**
 * Servlet implementation class RestaurantDisplayServlet
 */
@WebServlet("/display")
public class RestaurantDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Restaurant restaurant = (Restaurant) request.getAttribute("searchedRestaurant");
		
		out.print("<h1>Restaurant Details: </h1>");
		out.print("<h2>Name:"+ restaurant.getName()+" </h2>");
		out.print("<h2>Cuisine:"+ restaurant.getCuisin()+" </h2>");
		out.print("<h2>Branch Count:"+ restaurant.getBranchCount()+" </h2>");
	}

}
