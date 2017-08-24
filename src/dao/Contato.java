/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author laoslcs
 */
@Entity
@Table(name = "contato", catalog = "agenda2017", schema = "")
@NamedQueries({
    @NamedQuery(name = "Contato.findAll", query = "SELECT c FROM Contato c")
    , @NamedQuery(name = "Contato.findById", query = "SELECT c FROM Contato c WHERE c.id = :id")
    , @NamedQuery(name = "Contato.findByNome", query = "SELECT c FROM Contato c WHERE c.nome = :nome")
    , @NamedQuery(name = "Contato.findByDdd", query = "SELECT c FROM Contato c WHERE c.ddd = :ddd")
    , @NamedQuery(name = "Contato.findByTel", query = "SELECT c FROM Contato c WHERE c.tel = :tel")
    , @NamedQuery(name = "Contato.findByCel", query = "SELECT c FROM Contato c WHERE c.cel = :cel")
    , @NamedQuery(name = "Contato.findByWhastSapp", query = "SELECT c FROM Contato c WHERE c.whastSapp = :whastSapp")
    , @NamedQuery(name = "Contato.findBySkype", query = "SELECT c FROM Contato c WHERE c.skype = :skype")
    , @NamedQuery(name = "Contato.findByInformacoesAdd", query = "SELECT c FROM Contato c WHERE c.informacoesAdd = :informacoesAdd")
    , @NamedQuery(name = "Contato.findByEmail", query = "SELECT c FROM Contato c WHERE c.email = :email")})
public class Contato implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "DDD")
    private Integer ddd;
    @Column(name = "tel")
    private String tel;
    @Column(name = "cel")
    private String cel;
    @Column(name = "WhastSapp")
    private String whastSapp;
    @Column(name = "skype")
    private String skype;
    @Column(name = "informacoesAdd")
    private String informacoesAdd;
    @Column(name = "email")
    private String email;

    public Contato() {
    }

    public Contato(Integer id) {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        Integer oldDdd = this.ddd;
        this.ddd = ddd;
        changeSupport.firePropertyChange("ddd", oldDdd, ddd);
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        String oldTel = this.tel;
        this.tel = tel;
        changeSupport.firePropertyChange("tel", oldTel, tel);
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        String oldCel = this.cel;
        this.cel = cel;
        changeSupport.firePropertyChange("cel", oldCel, cel);
    }

    public String getWhastSapp() {
        return whastSapp;
    }

    public void setWhastSapp(String whastSapp) {
        String oldWhastSapp = this.whastSapp;
        this.whastSapp = whastSapp;
        changeSupport.firePropertyChange("whastSapp", oldWhastSapp, whastSapp);
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        String oldSkype = this.skype;
        this.skype = skype;
        changeSupport.firePropertyChange("skype", oldSkype, skype);
    }

    public String getInformacoesAdd() {
        return informacoesAdd;
    }

    public void setInformacoesAdd(String informacoesAdd) {
        String oldInformacoesAdd = this.informacoesAdd;
        this.informacoesAdd = informacoesAdd;
        changeSupport.firePropertyChange("informacoesAdd", oldInformacoesAdd, informacoesAdd);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
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
        if (!(object instanceof Contato)) {
            return false;
        }
        Contato other = (Contato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "form.Contato[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
