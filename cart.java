package servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbccc.Jdbc;
public class cart extends HttpServlet{
	  private static final long serialVersionUID = 1L;
	  @SuppressWarnings("unused")
	  public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	    Jdbc exe1=new Jdbc();
	      String item=req.getParameter("item");
	      PrintWriter out=res.getWriter();
		boolean z=exe1.check2(item);
		if(z) {
			out.println("selected");
		}
	  }

}
