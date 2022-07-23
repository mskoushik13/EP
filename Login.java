package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbccc.Jdbc;

public class Login extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		Jdbc exe2=new Jdbc();
	      String name=req.getParameter("name");
	      String password=req.getParameter("password");
	      boolean y =exe2.check1(name,password);
//	      if (z) {
//	    	  System.out.println("hello !");
//	      
//	  }
}

}
