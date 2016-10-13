package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "limits_type", schema = "", catalog = "brain")
public class LimitsTypeEntity {
    private int limitsTypeId;
    private String limitsTypeCode;
    private String limitsTypeName;
    private int limitsTypeStatusId;
    private Timestamp limitsTypeCts;

    @Id
    @Column(name = "limits_type_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getLimitsTypeId() {
        return limitsTypeId;
    }

    public void setLimitsTypeId(int limitsTypeId) {
        this.limitsTypeId = limitsTypeId;
    }

    @Basic
    @Column(name = "limits_type_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getLimitsTypeCode() {
        return limitsTypeCode;
    }

    public void setLimitsTypeCode(String limitsTypeCode) {
        this.limitsTypeCode = limitsTypeCode;
    }

    @Basic
    @Column(name = "limits_type_name", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getLimitsTypeName() {
        return limitsTypeName;
    }

    public void setLimitsTypeName(String limitsTypeName) {
        this.limitsTypeName = limitsTypeName;
    }

    @Basic
    @Column(name = "limits_type_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getLimitsTypeStatusId() {
        return limitsTypeStatusId;
    }

    public void setLimitsTypeStatusId(int limitsTypeStatusId) {
        this.limitsTypeStatusId = limitsTypeStatusId;
    }

    @Basic
    @Column(name = "limits_type_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getLimitsTypeCts() {
        return limitsTypeCts;
    }

    public void setLimitsTypeCts(Timestamp limitsTypeCts) {
        this.limitsTypeCts = limitsTypeCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LimitsTypeEntity that = (LimitsTypeEntity) o;

        if (limitsTypeId != that.limitsTypeId) return false;
        if (limitsTypeStatusId != that.limitsTypeStatusId) return false;
        if (limitsTypeCode != null ? !limitsTypeCode.equals(that.limitsTypeCode) : that.limitsTypeCode != null)
            return false;
        if (limitsTypeCts != null ? !limitsTypeCts.equals(that.limitsTypeCts) : that.limitsTypeCts != null)
            return false;
        if (limitsTypeName != null ? !limitsTypeName.equals(that.limitsTypeName) : that.limitsTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = limitsTypeId;
        result = 31 * result + (limitsTypeCode != null ? limitsTypeCode.hashCode() : 0);
        result = 31 * result + (limitsTypeName != null ? limitsTypeName.hashCode() : 0);
        result = 31 * result + limitsTypeStatusId;
        result = 31 * result + (limitsTypeCts != null ? limitsTypeCts.hashCode() : 0);
        return result;
    }
}
