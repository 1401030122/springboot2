package com.atguigu.admin.boom2.entity;

import java.io.Serializable;

/**
 * 
 * @TableName boom2
 */
public class Boom2 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String number;

    /**
     * 
     */
    private Integer boomTime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getNumber() {
        return number;
    }

    /**
     * 
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 
     */
    public Integer getBoomTime() {
        return boomTime;
    }

    /**
     * 
     */
    public void setBoomTime(Integer boomTime) {
        this.boomTime = boomTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Boom2 other = (Boom2) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getBoomTime() == null ? other.getBoomTime() == null : this.getBoomTime().equals(other.getBoomTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getBoomTime() == null) ? 0 : getBoomTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", number=").append(number);
        sb.append(", boomTime=").append(boomTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}