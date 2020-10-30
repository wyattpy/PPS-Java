package clases;


import java.sql.*;

public class acceso {
    database db = new database();
    String sql = "";
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public acceso(){

    }

    public int validar(String user, String pass) {
        int nivel = 0;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT rol FROM public.usuarios where usuario='" + user + "' and password ='" + pass + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                nivel = rs.getInt(1);
            }
            con.close();
            rs.close();
            return nivel;
        } catch (SQLException | ClassNotFoundException e) {
            return nivel;
        }
    }
}
