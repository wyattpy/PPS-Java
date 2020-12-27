package clases;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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

    public int cambiarContraAdmin(String pass, String user) {
        int i;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "UPDATE public.usuarios SET password ='" + pass +"' WHERE nombre ='" + user + "'";
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
            sql = "DELETE FROM public.cliente WHERE cedula='" + cedula + "'";
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
            sql = "SELECT password FROM public.cliente where cedula='" + cedula + "'";
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
        int i;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "UPDATE public.cliente SET password ='" + password + "' , nombre ='" + nombre + "', apellido ='" + apellido + "', telefono ='" + telefono + "', direccion ='" + direccion + "', correo ='" + correo + "' WHERE cedula ='" + cedula + "'";
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
            sql = "INSERT into public.vehiculos(matricula,marca, modelo, color, ci_cliente) VALUES('" + matricula + "','" + marca+ "','" +modelo + "','" + color + "','" + ci_cliente + "')";
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
            sql= "UPDATE public.vehiculos SET color= '" + color +  "' WHERE matricula = '"+ matricula +"'";
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



    //----SCRIPTS PARA CLIENTE

    public String validarCli(String cedula, String pass) {
        String nombre = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT nombre FROM public.cliente where cedula='" + cedula + "' and password ='" + pass + "'";
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
    public int actualizarContraCliente(String cedula, String password) {
        int i;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "UPDATE public.cliente SET password ='" + password + "' WHERE cedula ='" + cedula + "'";
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
    public String obtenerCedulaCli(String cedula) {
        String ceduCli = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT cedula FROM public.cliente where cedula='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                ceduCli = rs.getString(1);
            }
            con.close();
            rs.close();
            return ceduCli ;
        } catch (SQLException | ClassNotFoundException e) {
            return ceduCli;
        }
    }
    public int altaClienteCli(String cedula, String password, String password2,String nombre, String apellido,String telefono, String direccion, String correo){
        if(password.equals(password2)){
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
        else {
            return 0;
        }
    }

    public int actualizarDatosCli(String password, String telefono, String direccion, String correo, String cedula) {
        int i;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "UPDATE public.cliente SET password ='" + password + "', telefono ='" + telefono + "', direccion ='" + direccion + "', correo ='" + correo + "' WHERE cedula ='" + cedula + "'";
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

    //-------Contrato---------------

    public int altaContrato(String id_cliente, String total_contrato, String fecha_inicio, String fecha_fin, String descripcion, String estado, String tipo_contrato){
        int i;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "INSERT into public.contrato(cicliente, total, fechainicio, fechafin, estado, tipo, observaciones) VALUES('" + id_cliente + "','" + total_contrato + "','"+ fecha_inicio + "','"+ fecha_fin +"','"+ estado + "','"+ tipo_contrato + "','"+ descripcion + "')";
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
    public int altaContratoCli(String id_cliente, String total_contrato, String fecha_inicio,String descripcion, String estado, String tipo_contrato){
        int i;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "INSERT into public.contrato(cicliente, total, fechainicio, estado, tipo, observaciones) VALUES('" + id_cliente + "','" + total_contrato + "','"+ fecha_inicio + "','"+ estado + "','"+ tipo_contrato + "','"+ descripcion + "')";
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

    public int bajaContrato(String cicliente) {
        try {
            int i;
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "DELETE from public.contrato where cicliente = '" + Integer.parseInt(cicliente) + "'";
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

    public int actualizarDatosContrato(String idContrato,String totalContrato, String fechaInicio, String fechaFin, String descripcion, String estado, String tipoContrato )
    {
        int i;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());

            sql= "UPDATE public.contrato SET total='"+ totalContrato+"', fechainicio='"+fechaInicio+"', fechafin='"+fechaFin+"', estado='"+estado+"', tipo='"+tipoContrato+"', observaciones='"+descripcion+"' WHERE idcontrato = '"+idContrato+"'";
            pst = con.prepareStatement(sql);
            i = pst.executeUpdate();
            if(i==1){
                con.close();
                return i;
            }
            con.close();
            return i;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }

    }
    public String obtenerIdContrato(String cicliente) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT idContrato FROM public.contrato where cicliente ='" + cicliente + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                dato  = rs.getString(1);
            }
            con.close();
            rs.close();
            return dato ;
        } catch (SQLException | ClassNotFoundException e) {
            return "" ;
        }
    }

    public String obtenerTotalContrato(String cicliente) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT total FROM public.contrato where cicliente ='" + cicliente + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                dato  = rs.getString(1);
            }
            con.close();
            rs.close();
            return dato ;
        } catch (SQLException | ClassNotFoundException e) {
            return "" ;
        }
    }
    public String obtenerFechaInicio(String cicliente) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT fechainicio FROM public.contrato where cicliente ='" + cicliente + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                dato  = rs.getString(1);
            }
            con.close();
            rs.close();
            return dato ;
        } catch (SQLException | ClassNotFoundException e) {
            return "" ;
        }
    }
    public String obtenerFechaFin(String cicliente) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT fechafin FROM public.contrato where cicliente ='" + cicliente + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                dato  = rs.getString(1);
            }
            con.close();
            rs.close();
            return dato ;
        } catch (SQLException | ClassNotFoundException e) {
            return "" ;
        }
    }
    public String obtenerDescripcion(String cicliente) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT observaciones FROM public.contrato where cicliente ='" + cicliente + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                dato  = rs.getString(1);
            }
            con.close();
            rs.close();
            return dato ;
        } catch (SQLException | ClassNotFoundException e) {
            return "" ;
        }
    }
    public String obtenerEstadoContrato (String cicliente) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT estado FROM public.contrato where cicliente ='" + cicliente + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                dato  = rs.getString(1);
            }
            con.close();
            rs.close();
            return dato ;
        } catch (SQLException | ClassNotFoundException e) {
            return "" ;
        }
    }
    public String obtenerTipoContrato(String cicliente) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT tipo FROM public.contrato where cicliente ='" + cicliente + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                dato  = rs.getString(1);
            }
            con.close();
            rs.close();
            return dato ;
        } catch (SQLException | ClassNotFoundException e) {
            return "" ;
        }
    }




    //-------Parking---------------
    public int actualizarDatosParking(String nro_piso, String lugares_disponibles, String lleno) {
        try {
            int i;
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "UPDATE public.pisos SET lugares_disponibles ='" + lugares_disponibles + "', lleno ='" + lleno + "' WHERE nro_piso ='" + nro_piso + "'";
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

    public String obtenerLugaresDisponibles(String nro_piso) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT lugares_disponibles FROM public.pisos where nro_piso='" + nro_piso + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                dato  = rs.getString(1);
            }
            con.close();
            rs.close();
            return dato ;
        } catch (SQLException | ClassNotFoundException e) {
            return "" ;
        }
    }

    public String obtenerLleno(String nro_piso) {
        String dato = null;
        ;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT lleno FROM public.pisos where nro_piso='" + nro_piso + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                dato = rs.getString(1);
            }
            con.close();
            rs.close();
            return dato;
        } catch (SQLException | ClassNotFoundException e) {
            return "";
        }
    }

}







