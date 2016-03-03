/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proynavegacion;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author HUGO DIAZ
 */
@Entity
@Table(name = "HABITACION", catalog = "", schema = "BDDEMO")
@NamedQueries({
    @NamedQuery(name = "Habitacion.findAll", query = "SELECT h FROM Habitacion h"),
    @NamedQuery(name = "Habitacion.findByIdhabitacion", query = "SELECT h FROM Habitacion h WHERE h.idhabitacion = :idhabitacion"),
    @NamedQuery(name = "Habitacion.findByIdestado", query = "SELECT h FROM Habitacion h WHERE h.idestado = :idestado"),
    @NamedQuery(name = "Habitacion.findByIdvalor", query = "SELECT h FROM Habitacion h WHERE h.idvalor = :idvalor")})
public class Habitacion implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDHABITACION")
    private String idhabitacion;
    @Basic(optional = false)
    @Column(name = "IDESTADO")
    private String idestado;
    @Basic(optional = false)
    @Column(name = "IDVALOR")
    private long idvalor;

    public Habitacion() {
    }

    public Habitacion(String idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public Habitacion(String idhabitacion, String idestado, long idvalor) {
        this.idhabitacion = idhabitacion;
        this.idestado = idestado;
        this.idvalor = idvalor;
    }

    public String getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(String idhabitacion) {
        String oldIdhabitacion = this.idhabitacion;
        this.idhabitacion = idhabitacion;
        changeSupport.firePropertyChange("idhabitacion", oldIdhabitacion, idhabitacion);
    }

    public String getIdestado() {
        return idestado;
    }

    public void setIdestado(String idestado) {
        String oldIdestado = this.idestado;
        this.idestado = idestado;
        changeSupport.firePropertyChange("idestado", oldIdestado, idestado);
    }

    public long getIdvalor() {
        return idvalor;
    }

    public void setIdvalor(long idvalor) {
        long oldIdvalor = this.idvalor;
        this.idvalor = idvalor;
        changeSupport.firePropertyChange("idvalor", oldIdvalor, idvalor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhabitacion != null ? idhabitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitacion)) {
            return false;
        }
        Habitacion other = (Habitacion) object;
        if ((this.idhabitacion == null && other.idhabitacion != null) || (this.idhabitacion != null && !this.idhabitacion.equals(other.idhabitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proynavegacion.Habitacion[ idhabitacion=" + idhabitacion + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
