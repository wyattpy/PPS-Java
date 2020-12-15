package clases;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "contratos", schema = "public", catalog = "dfk5mta8dkdtbl")
public class ContratosEntity {
    private long idContrato;
    private long totalContrato;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    private String estado;
    private String tipoContrato;

    @Id
    @Column(name = "id_contrato")
    public long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(long idContrato) {
        this.idContrato = idContrato;
    }

    @Basic
    @Column(name = "total_contrato")
    public long getTotalContrato() {
        return totalContrato;
    }

    public void setTotalContrato(long totalContrato) {
        this.totalContrato = totalContrato;
    }

    @Basic
    @Column(name = "fecha_inicio")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "fecha_fin")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "tipo_contrato")
    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContratosEntity that = (ContratosEntity) o;

        if (idContrato != that.idContrato) return false;
        if (totalContrato != that.totalContrato) return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (tipoContrato != null ? !tipoContrato.equals(that.tipoContrato) : that.tipoContrato != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idContrato ^ (idContrato >>> 32));
        result = 31 * result + (int) (totalContrato ^ (totalContrato >>> 32));
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (tipoContrato != null ? tipoContrato.hashCode() : 0);
        return result;
    }
}
