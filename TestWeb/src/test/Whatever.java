package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Whatever
 */
@WebServlet("/Whatever")
public class Whatever extends HttpServlet {
	private static final long serialVersionUID = 1L;
     @EJB TestSessionBeanRemote testSession;
     
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Whatever() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String username=request.getParameter("user");
    	
    	boolean exists= testSession.userNameExists(username);
    	PrintWriter out= response.getWriter();
    	if(exists){
    		out.println(username+ "exists");
    		
    	}
    	else{
    		out.println(username+ " do not exist");
    		
    	}
    	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
