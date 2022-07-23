package servlets;
import jdbccc.Jdbc;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServ extends HttpServlet {
  private static final long serialVersionUID = 1L;
  @SuppressWarnings("unused")
  public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
    Jdbc exe1=new Jdbc();
      String username=req.getParameter("username");
      String email=req.getParameter("email");
      String mobile_number=req.getParameter("mobile_number");
      String pwd=req.getParameter("pwd");
      String confirm_password=req.getParameter("confirm_password");
      PrintWriter out=res.getWriter();
	boolean z=exe1.check(username,email,mobile_number,pwd,confirm_password);
  }
}
