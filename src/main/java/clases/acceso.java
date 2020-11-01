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

    public int validar(String cedula, String pass) {
        int nivel = 0;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT nombre, rol FROM public.usuarios where ci='" + cedula + "' and password ='" + pass + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                nivel = rs.getInt(2);
            }
            con.close();
            rs.close();
            return nivel;
        } catch (SQLException | ClassNotFoundException e) {
            return nivel;
        }
    }

    public String obtenerNombre(String cedula, String pass){
        String nombre ="";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT nombre, rol FROM public.usuarios where ci='" + cedula + "' and password ='" + pass + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                nombre = rs.getString(1);
            }
            con.close();
            rs.close();
            return nombre;
        } catch (SQLException | ClassNotFoundException e) {
            return nombre;
        }
    }
}
