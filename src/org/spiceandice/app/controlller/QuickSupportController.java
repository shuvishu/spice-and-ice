package org.spiceandice.app.controlller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.spiceandice.app.dbservice.DBServiceUtilMySql;
import org.spiceandice.app.model.QuickSupport;

/**
 * Servlet implementation class QuickSupportController
 */
@WebServlet("/QuickSupportController")
public class QuickSupportController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuickSupportController() {
    	
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = new DBServiceUtilMySql().retrieveAllData();
		 response.setContentType("text/plain");
		    PrintWriter out=response.getWriter();
		    out.print(data);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String bookingId = request.getParameter("tourID");
		String status = request.getParameter("tourStatus");
		String comments = request.getParameter("comments");
		QuickSupport data = new QuickSupport(name, email, bookingId, status, comments);
		Boolean saveFlag = new DBServiceUtilMySql().saveObject(data);
		if(saveFlag) {
			PrintWriter out=response.getWriter();
		    out.print("<script type='text/javascript'>alert('data has been saves succesfully');</script>");
		    request.getRequestDispatcher("contact.htm").include(request, response);
			
			}
	}

}
