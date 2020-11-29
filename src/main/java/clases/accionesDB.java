package clases;


import java.sql.*;

public class accionesDB {
    DB db = new DB();
    String sql = "";
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public accionesDB() {

    }

    public int validar(String cedula, String pass) {
        int nivel = 0;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT nombre, rol FROM public.usuarios where ci='" + cedula + "' and password ='" + pass + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                nivel = rs.getInt(2);
            }
            con.close();
            rs.close();
            return nivel;
        } catch (SQLException | ClassNotFoundException e) {
            return nivel;
        }
    }

    public String obtenerNombre(String cedula, String pass) {
        String nombre = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT nombre, rol FROM public.usuarios where ci='" + cedula + "' and password ='" + pass + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                nombre = rs.getString(1);
            }
            con.close();
            rs.close();
            return nombre;
        } catch (SQLException | ClassNotFoundException e) {
            return nombre;
        }
    }

    public int altaCliente(String cedula, String password, String nombre, String apellido,String telefono, String direccion, String correo){
        int i;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "INSERT into public.cliente(cedula, password, nombre, apellido, telefono, direccion, correo) VALUES('" + cedula + "','" + password + "','"+ nombre + "','"+ apellido + "','"+ telefono + "','"+ direccion + "','"+ correo + "')";
            pst = con.prepareStatement(sql);
            i = pst.executeUpdate();
            if(i == 1){
                con.close();
                return i;
            }
            con.close();
            return i;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }
    }

    public int bajaCliente(String cedula) {
        try {
            int i;
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "DELETE FROM public.cliente where cedula='" + cedula + "'";
            pst = con.prepareStatement(sql);
            i = pst.executeUpdate();
            if (i == 1) {
                con.close();
                return i;
            }
            con.close();
            return i;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }
    }


    public String obtenerApellido(String cedula) {
        String apellido = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT apellido FROM public.cliente where cedula='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                apellido = rs.getString(1);
            }
            con.close();
            rs.close();
            return apellido;
        } catch (SQLException | ClassNotFoundException e) {
            return apellido;
        }
    }

    public String obtenerTelefono(String cedula) {
        String telefono = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT telefono FROM public.cliente where cedula='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                telefono = rs.getString(1);
            }
            con.close();
            rs.close();
            return telefono;
        } catch (SQLException | ClassNotFoundException e) {
            return telefono;
        }
    }

    public String obtenerDireccion(String cedula) {
        String nombre = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT direccion FROM public.cliente where cedula='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                nombre = rs.getString(1);
            }
            con.close();
            rs.close();
            return nombre;
        } catch (SQLException | ClassNotFoundException e) {
            return nombre;
        }
    }

    public String obtenerCorreo(String cedula) {
        String nombre = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT correo FROM public.cliente where cedula='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                nombre = rs.getString(1);
            }
            con.close();
            rs.close();
            return nombre;
        } catch (SQLException | ClassNotFoundException e) {
            return nombre;
        }
    }

    public String obtenerNombre(String cedula) {
        String nombre = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT nombre FROM public.cliente where cedula='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                nombre = rs.getString(1);
            }
            con.close();
            rs.close();
            return nombre;
        } catch (SQLException | ClassNotFoundException e) {
            return nombre;
        }
    }

    public String obtenerContrasena(String cedula) {
        String nombre = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT password FROM public.clientes where cedula='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                nombre = rs.getString(1);
            }
            con.close();
            rs.close();
            return nombre;
        } catch (SQLException | ClassNotFoundException e) {
            return nombre;
        }
    }

    public int actualizarDatos(String password, String nombre, String apellido, String telefono, String direccion, String correo, String cedula) {
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "UPDATE public.cliente SET password ='" + password + "' , nombre ='" + nombre + "', apellido ='" + apellido + "', telefono ='" + telefono + "', direccion ='" + direccion + "', correo ='" + correo + "' WHERE cedula ='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            con.close();
            rs.close();
            return 1;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }

    }

    // -----TODO PARA VEHICULO -----



    public String obtenerMarca(String matricula) {
        String marca = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT marca FROM public.vehiculos where matricula='" + matricula+ "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                marca = rs.getString(1);
            }
            con.close();
            rs.close();
            return marca ;
        } catch (SQLException | ClassNotFoundException e) {
            return marca ;
        }
    }

    public String obtenerModelo(String matricula) {
        String marca = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT modelo FROM public.vehiculos where matricula='" + matricula+ "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                marca = rs.getString(1);
            }
            con.close();
            rs.close();
            return marca ;
        } catch (SQLException | ClassNotFoundException e) {
            return marca ;
        }
    }

    public String obtenerColor(String matricula) {
        String marca = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT color FROM public.vehiculos where matricula='" + matricula+ "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                marca  = rs.getString(1);
            }
            con.close();
            rs.close();
            return marca ;
        } catch (SQLException | ClassNotFoundException e) {
            return marca ;
        }
    }
    public String obtenerCiCliente(String matricula) {
        String marca = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT ci_cliente FROM public.vehiculos where matricula='" + matricula+ "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                marca  = rs.getString(1);
            }
            con.close();
            rs.close();
            return marca ;
        } catch (SQLException | ClassNotFoundException e) {
            return marca ;
        }
    }

    public int altaVehiculo(String matricula, String marca, String modelo, String color, String ci_cliente) {
        try {
            int i = 0;
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "INSERT into public.vehiculos(matricula,marca, modelo, color, ci_cliente) VALUES('" + matricula + "','" + marca+ "','" +modelo + "','" + color + "','" + ci_cliente +  "')";
            pst = con.prepareStatement(sql);
            i = pst.executeUpdate();
            if(i == 1){
                con.close();
                return i;
            }
            con.close();
            return i;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }
    }

    public int bajaVehiculo(String matricula) {
        try {
            int i;
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "DELETE from public.vehiculos where matricula = '" + matricula + "'";
            pst = con.prepareStatement(sql);
            i = pst.executeUpdate();
            if(i == 1){
                con.close();
                return i;
            }
            con.close();
            return i;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }
    }

    public int actualizarDatosVehiculo(String matricula, String color){
        try {
            int i;
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql= "UPDATE public.vehiculos SET color= '" + color + "' WHERE matricula = '"+ matricula +"'";
            pst = con.prepareStatement(sql);
            i = pst.executeUpdate();
            if (i == 1) {
                con.close();
                return i;
            }
            con.close();
            return i;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }

    }



}







