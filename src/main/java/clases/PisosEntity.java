package clases;

import javax.persistence.*;

@Entity
@Table(name = "pisos", schema = "public", catalog = "dfk5mta8dkdtbl")
public class PisosEntity {
    private short nroPiso;
    private long lugaresDisponibles;
    private boolean lleno;
    public PisosEntity(){

    }
    public PisosEntity(short nroPiso, long lugaresDisponibles, boolean lleno){
        this.nroPiso = nroPiso;
        this.lugaresDisponibles = lugaresDisponibles;
        this.lleno = lleno;
    }

    @Id
    @Column(name = "nro_piso")
    public short getNroPiso() {
        return nroPiso;
    }

    public void setNroPiso(short nroPiso) {
        this.nroPiso = nroPiso;
    }

    @Basic
    @Column(name = "lugares_disponibles")
    public long getLugaresDisponibles() {
        return lugaresDisponibles;
    }

    public void setLugaresDisponibles(long lugaresDisponibles) {
        this.lugaresDisponibles = lugaresDisponibles;
    }

    @Basic
    @Column(name = "lleno")
    public boolean isLleno() {
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PisosEntity that = (PisosEntity) o;

        if (nroPiso != that.nroPiso) return false;
        if (lugaresDisponibles != that.lugaresDisponibles) return false;
        if (lleno != that.lleno) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) nroPiso;
        result = 31 * result + (int) (lugaresDisponibles ^ (lugaresDisponibles >>> 32));
        result = 31 * result + (lleno ? 1 : 0);
        return result;
    }
}
