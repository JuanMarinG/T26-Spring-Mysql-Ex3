// Generated with g9.

package com.juan.ex3.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="venta")
public class Venta implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    @Column(name="id_prod")
    private int idProd;
    @Column(name="id_cajero")
    private int idCajero;
    @Column(name="id_maquina")
    private int idMaquina;
    @Column(name="FOREIGN1")
    private String foreign1;
    @Column(name="FOREIGN2")
    private String foreign2;
    @Column(name="FOREIGN3")
    private String foreign3;

    /** Default constructor. */
    public Venta() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for idProd.
     *
     * @return the current value of idProd
     */
    public int getIdProd() {
        return idProd;
    }

    /**
     * Setter method for idProd.
     *
     * @param aIdProd the new value for idProd
     */
    public void setIdProd(int aIdProd) {
        idProd = aIdProd;
    }

    /**
     * Access method for idCajero.
     *
     * @return the current value of idCajero
     */
    public int getIdCajero() {
        return idCajero;
    }

    /**
     * Setter method for idCajero.
     *
     * @param aIdCajero the new value for idCajero
     */
    public void setIdCajero(int aIdCajero) {
        idCajero = aIdCajero;
    }

    /**
     * Access method for idMaquina.
     *
     * @return the current value of idMaquina
     */
    public int getIdMaquina() {
        return idMaquina;
    }

    /**
     * Setter method for idMaquina.
     *
     * @param aIdMaquina the new value for idMaquina
     */
    public void setIdMaquina(int aIdMaquina) {
        idMaquina = aIdMaquina;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign1() {
        return foreign1;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign1(String aForeign1) {
        foreign1 = aForeign1;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign2() {
        return foreign2;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign2(String aForeign2) {
        foreign2 = aForeign2;
    }

    /**
     * Access method for foreign.
     *
     * @return the current value of foreign
     */
    public String getForeign3() {
        return foreign3;
    }

    /**
     * Setter method for foreign.
     *
     * @param aForeign the new value for foreign
     */
    public void setForeign3(String aForeign3) {
        foreign3 = aForeign3;
    }

    /**
     * Compares the key for this instance with another Venta.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Venta and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Venta)) {
            return false;
        }
        Venta that = (Venta) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Venta.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Venta)) return false;
        return this.equalKeys(other) && ((Venta)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Venta |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
