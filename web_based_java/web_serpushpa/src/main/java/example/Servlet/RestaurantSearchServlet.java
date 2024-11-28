//package example.Servlet;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import example.beans.Restaurant;
//import example.dao.DaoInterface;
//import example.dao.RestaurantDao;
//
///**
// * Servlet implementation class RestaurantSearchServlet
// */
//@WebServlet("/search")
//public class RestaurantSearchServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
////		response.getWriter().append("Served at: ").append(request.getContextPath());
//		
//		response.setContentType("text/html");
//		PrintWriter out =response.getWriter();
//		String id=request.getParameter("r_id");
//		int restaurantId=Integer.parseInt(id);
//		
//		
//		DaoInterface<Restaurant, Integer> daoRef=new RestaurantDao();
//		Restaurant foundRestaurant= daoRef.retrieveOne(restaurantId);
//		
//		
//		if(foundRestaurant==null) {
//			
//			
//			RequestDispatcher dispatcher = request.getRequestDispatcher("Search-restaurant.html");
//			out.println("<h2>Restaurant with given Id not found☹️.Please try again later</h2>");
//			dispatcher.include(request, response);
//		}else
//		{
//			
//		
//		System.out.println(foundRestaurant);
//		}
//		
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
