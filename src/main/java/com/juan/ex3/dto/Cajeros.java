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

@Entity(name="cajeros")
public class Cajeros implements Serializable {

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
    @Column(length=255)
    private String nomApels;

    /** Default constructor. */
    public Cajeros() {
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
     * Access method for nomApels.
     *
     * @return the current value of nomApels
     */
    public String getNomApels() {
        return nomApels;
    }

    /**
     * Setter method for nomApels.
     *
     * @param aNomApels the new value for nomApels
     */
    public void setNomApels(String aNomApels) {
        nomApels = aNomApels;
    }

    /**
     * Compares the key for this instance with another Cajeros.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Cajeros and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Cajeros)) {
            return false;
        }
        Cajeros that = (Cajeros) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Cajeros.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Cajeros)) return false;
        return this.equalKeys(other) && ((Cajeros)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Cajeros |");
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
