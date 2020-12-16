package clases;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public int actualizarContraUser(String cedula, String password) {
        int i;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "UPDATE public.usuarios SET password ='" + password + "' WHERE ci ='" + cedula + "'";
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



    //----SCRIPTS PARA CLIENTE

    public String validarCli(String cedula, String pass) {
        String nombre = null;
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
            return "";
        }
    }

    public String obtenerTipoCuenta(String cedula) {
        String cuenta = null;
        Date fecha = null;
        Long fch = System.currentTimeMillis();
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        String fechaHoy = df.format(fch);
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT tipo_contrato FROM public.contrato where id_cliente='" + cedula + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            cuenta = rs.getString(1);
            if(cuenta.equals(null)){
                return "Free";
            }
            return cuenta;
        } catch (SQLException | ClassNotFoundException e) {
            return "";
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

    //-------Contrato---------------

    public int altaContrato(Integer id_cliente, Integer total_contrato, Date fecha_inicio, Date fecha_fin,String descripcion, String estado, String tipo_contrato){
        int i;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "INSERT into public.contratos(id_cliente, total_contrato, fecha_inicio, fecha_fin, descripcion, estado, tipo_contrato) VALUES('" + id_cliente + "','" + total_contrato + "','"+ fecha_inicio + "','"+ fecha_fin + "','"+ descripcion + "','"+ estado + "','"+ tipo_contrato + "')";
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

    public int bajaContrato(Integer id_contrato) {
        try {
            int i;
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "DELETE from public.contratos where id_contrato = '" + id_contrato + "'";
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

            sql= "UPDATE public.contratos SET total_contrato=?, fecha_inicio=?, fecha_fin=?, descripcion=?, estado=?, tipo_contrato=? WHERE id_contrato = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1,totalContrato);
            pst.setDate(2, java.sql.Date.valueOf(fechaInicio));
            pst.setDate(3, java.sql.Date.valueOf(fechaFin));
            pst.setString(4, descripcion);
            pst.setString(5,estado);
            pst.setString(6,tipoContrato);
            pst.setInt(7,Integer.parseInt(idContrato));
            i = pst.executeUpdate();
            if(i!=0){
                con.close();
                rs.close();
                return i;
            }
            con.close();
            rs.close();
            return i;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }

    }
    public String obtenerIdCliente (String id_contrato) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT id_cliente FROM public.contratos where id_contrato ='" + id_contrato + "'";
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
    public String obtenerTotalContrato(String id_contrato) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT total_contrato FROM public.contratos where id_contrato ='" + id_contrato + "'";
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
    public String obtenerFechaInicio(String id_contrato) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT fecha_inicio FROM public.contratos where id_contrato ='" + id_contrato + "'";
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
    public String obtenerFechaFin(String id_contrato) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT fecha_fin FROM public.contratos where id_contrato ='" + id_contrato + "'";
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
    public String obtenerDescripcion(String id_contrato) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT descripcion FROM public.contratos where id_contrato ='" + id_contrato + "'";
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
    public String obtenerEstadoContrato (String id_contrato) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT estado FROM public.contratos where id_contrato ='" + id_contrato + "'";
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
    public String obtenerTipoContrato(String id_contrato) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT tipo_contrato FROM public.contratos where id_contrato ='" + id_contrato + "'";
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
    public int actualizarDatosParking(String nroPiso, String lugaresDisponibles, String lleno)
    {
        int i;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql= "UPDATE public.pisos SET lugares_disponibles=?, lleno=? WHERE nro_piso = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt(lugaresDisponibles));
            pst.setBoolean(2,Boolean.getBoolean(lleno));
            pst.setInt(3,Integer.parseInt(nroPiso));
            i = pst.executeUpdate();
            if(i != 0){
                con.close();
                rs.close();
                return i;
            }
            con.close();
            rs.close();
            return i;
        } catch (SQLException | ClassNotFoundException e) {
            return 0;
        }

    }
    public PisosEntity obtenerPiso1(){
        PisosEntity piso = new PisosEntity();
        piso.setNroPiso((short) 1);
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT lugares_disponibles, lleno FROM public.pisos where nro_piso='" + 1 + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                piso.setLugaresDisponibles((short) Integer.parseInt(rs.getString(1)));
                piso.setLleno(rs.getBoolean(2));
            }
            con.close();
            rs.close();
            return piso ;
        } catch (SQLException | ClassNotFoundException e) {
            return null;
        }
    }
    public PisosEntity obtenerPiso2(){
        PisosEntity piso = new PisosEntity();
        piso.setNroPiso((short) 2);
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT lugares_disponibles, lleno FROM public.pisos where nro_piso='" + 2 + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                piso.setLugaresDisponibles((short) Integer.parseInt(rs.getString(1)));
                piso.setLleno(rs.getBoolean(2));
            }
            con.close();
            rs.close();
            return piso ;
        } catch (SQLException | ClassNotFoundException e) {
            return null;
        }
    }
    public PisosEntity obtenerPiso3(){
        PisosEntity piso = new PisosEntity();
        piso.setNroPiso((short) 3);
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT lugares_disponibles, lleno FROM public.pisos where nro_piso='" + 3 + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                piso.setLugaresDisponibles((short) Integer.parseInt(rs.getString(1)));
                piso.setLleno(rs.getBoolean(2));
            }
            con.close();
            rs.close();
            return piso ;
        } catch (SQLException | ClassNotFoundException e) {
            return null;
        }
    }

    public String obtenerLugaresDisponibles(String nroPiso) {
        String dato = null;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT lugares_disponibles FROM public.pisos where nro_piso='" + nroPiso + "'";
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

    public String obtenerLleno(String nroPiso) {
        String dato = null;;
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            sql = "SELECT lleno FROM public.pisos where nro_piso='" + nroPiso + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                nroPiso  = rs.getString(1);
            }
            con.close();
            rs.close();
            return dato ;
        } catch (SQLException | ClassNotFoundException e) {
            return "";
        }
    }



}







