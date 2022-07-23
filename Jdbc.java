package jdbccc;

import java.sql.*;

public class Jdbc{
  public boolean check(String username,String email,String mobile_number,String pwd,String confirm_password) {
       try {
             String sql="insert into purchase values(?,?,?,?,?)";
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/klu","root","Mskoushik@13");PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,username);
            pst.setString(2,email);
            pst.setString(3,mobile_number);
            pst.setString(4,pwd);
            pst.setString(5,confirm_password);
            pst.executeUpdate();
            con.close(); 	
             return true;
           
          }
       
          catch(Exception e) {
            e.printStackTrace();
          }
    return false;
  }
  public boolean check1(String name,String password) {
      try {
            //String sql="select * from purchase where username=? and password=?";
    	    String sql ="insert into logindata values(?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/klu","root","Mskoushik@13");PreparedStatement pst=con.prepareStatement(sql);
           pst.setString(1,name);
           pst.setString(2,password);
           pst.executeUpdate();
            return true;
         }
      
         catch(Exception e) {
           e.printStackTrace();
         }
   return false;
 }
  public boolean check2(String item) {
     try {
         String sql="insert into dp values(?)";
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/klu","root","Mskoushik@13");PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1,item);
        ResultSet rs=pst.executeQuery();
        if (rs.next()) {
        con.close();
         return true;
        }
       
      }
   
      catch(Exception e) {
        e.printStackTrace();
      }
return false;
}

  
}