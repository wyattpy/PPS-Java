package clases;

public class contrato {
    private String idcontrato;
    private String total;
    private String fechainicio;
    private String fechafin;
    private String estado;
    private String tipo;
    private String observaciones;

    public contrato(){

    }

    @Override
    public String toString() {
        return "ID Contrato: "+idcontrato+" Total Gs.: "+total+" Fecha de Inicio:"+fechainicio+" Fecha de Fin: "+fechafin+" Estado: "+estado+" Tipo: "+tipo+" Observaciones: "+observaciones+"";
    }

    public String getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(String idcontrato) {
        this.idcontrato = idcontrato;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}



