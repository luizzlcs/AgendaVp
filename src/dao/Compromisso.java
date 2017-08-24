/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author laoslcs
 */
@Entity
@Table(name = "compromisso", catalog = "agenda2017", schema = "")
@NamedQueries({
    @NamedQuery(name = "Compromisso.findAll", query = "SELECT c FROM Compromisso c")
    , @NamedQuery(name = "Compromisso.findById", query = "SELECT c FROM Compromisso c WHERE c.id = :id")
    , @NamedQuery(name = "Compromisso.findByData", query = "SELECT c FROM Compromisso c WHERE c.data = :data")
    , @NamedQuery(name = "Compromisso.findByHora", query = "SELECT c FROM Compromisso c WHERE c.hora = :hora")
    , @NamedQuery(name = "Compromisso.findByLocalidade", query = "SELECT c FROM Compromisso c WHERE c.localidade = :localidade")
    , @NamedQuery(name = "Compromisso.findByDetalhes", query = "SELECT c FROM Compromisso c WHERE c.detalhes = :detalhes")})
public class Compromisso implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "hora")
    private String hora;
    @Column(name = "localidade")
    private String localidade;
    @Column(name = "detalhes")
    private String detalhes;

    public Compromisso() {
    }

    public Compromisso(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        Date oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        String oldHora = this.hora;
        this.hora = hora;
        changeSupport.firePropertyChange("hora", oldHora, hora);
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        String oldLocalidade = this.localidade;
        this.localidade = localidade;
        changeSupport.firePropertyChange("localidade", oldLocalidade, localidade);
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        String oldDetalhes = this.detalhes;
        this.detalhes = detalhes;
        changeSupport.firePropertyChange("detalhes", oldDetalhes, detalhes);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compromisso)) {
            return false;
        }
        Compromisso other = (Compromisso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "form.Compromisso[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
