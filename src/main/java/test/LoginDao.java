package test;

import java.sql.*;

public class LoginDao {
    public static boolean validate(String name,String pass){
        boolean status=false;
        try{
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection(
                    "ec2-23-20-70-32.compute-1.amazonaws.com","sgtxpfhzquxnoq","8f88fdcf053384491c02727cf5f8464bc939a7663ac934e6e10f03c44963808b");

            PreparedStatement ps=con.prepareStatement(
                    "select * from usuarios where usuario=? and password=?");
            ps.setString(1,name);
            ps.setString(2,pass);

            ResultSet rs=ps.executeQuery();
            status=rs.next();

        }catch(Exception e){System.out.println(e);}
        return status;
    }
}