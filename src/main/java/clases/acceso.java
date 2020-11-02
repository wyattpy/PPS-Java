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

    public boolean cedulaRepetida(String cedula){
        String ci ="";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT cedula FROM public.clientes where ci='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                ci = rs.getString(1);
            }
            con.close();
            rs.close();
            return true;
        } catch (SQLException | ClassNotFoundException e) {
            return false;
        }
    }

    public int altaCliente(String cedula, String password, String nombre, String apellido,String telefono, String direccion, String correo){
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "INSERT into public.cliente(cedula, pass, nombre, apellido, telefono, direccion, correo) VALUES('" + cedula + "','" + password + "','"+ nombre + "','"+ apellido + "','"+ telefono + "','"+ direccion + "','"+ correo + "')";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            con.close();
            rs.close();
            return 1;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }
    }

    public int bajaCliente(String cedula){
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "DELETE FROM public.cliente where cedula='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            con.close();
            rs.close();
            return 1;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }
    }

    public String obtenerApellido(String cedula){
        String apellido ="";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT apellido FROM public.cliente where ci='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                apellido = rs.getString(1);
            }
            con.close();
            rs.close();
            return apellido;
        } catch (SQLException | ClassNotFoundException e) {
            return apellido;
        }
    }

    public String obtenerTelefono(String cedula){
        String telefono ="";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT telefono FROM public.cliente where ci='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                telefono = rs.getString(1);
            }
            con.close();
            rs.close();
            return telefono;
        } catch (SQLException | ClassNotFoundException e) {
            return telefono;
        }
    }

    public String obtenerDireccion(String cedula){
        String nombre ="";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT direccion FROM public.usuarios where ci='" + cedula + "'";
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

    public String obtenerCorreo(String cedula){
        String nombre ="";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT correo FROM public.usuarios where ci='" + cedula + "'";
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

    public String obtenerNombre(String cedula){
        String nombre ="";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT nombre FROM public.usuarios where ci='" + cedula + "'";
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

    public String obtenerContrasena(String cedula){
        String nombre ="";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT pass FROM public.usuarios where ci='" + cedula + "'";
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

    public int actualizarDatos(String password, String nombre, String apellido,String telefono, String direccion, String correo){
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "UPDATE into public.cliente SET( pass, nombre, apellido, telefono, direccion, correo) VALUES('"  + password + "','"+ nombre + "','"+ apellido + "','"+ telefono + "','"+ direccion + "','"+ correo + "')";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            con.close();
            rs.close();
            return 1;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }

    }

}
