package example.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.dao.DaoInterface;
import example.dao.RestaurantDao;
import example.pojo.Restaurant;

/**
 * Servlet implementation class RestaurantSearchServlet
 */
@WebServlet("/search")
public class RestaurantSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int restId = Integer.parseInt((request.getParameter("restId")));
		DaoInterface<Restaurant, Integer> dao = new RestaurantDao();
		Restaurant restaurant = dao.retrieveOne(restId);
		if(restaurant != null) {
			System.out.println(restaurant);
			RequestDispatcher dispatcher = request.getRequestDispatcher("display");
			request.setAttribute("searchedRestaurant", restaurant);
			dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher=request.getRequestDispatcher("search_restaurant.html");
			out.print("<h1>Restaurant Not found !! Try again</h1>");
			dispatcher.include(request, response);
		}
	}

}
