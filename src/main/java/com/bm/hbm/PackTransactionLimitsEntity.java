package com.bm.hbm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "pack_transaction_limits", schema = "", catalog = "brain")
public class PackTransactionLimitsEntity {
    private int packTransactionLimitsId;
    private Integer packTransactionLimitsPackId;
    private Integer packTransactionLimitsLimitsTypeId;
    private Integer packTransactionLimitsTransactionTypeId;
    private BigDecimal packTransactionLimitsValue;
    private int packTransactionLimitsStatusId;
    private Timestamp packTransactionLimitsCts;

    @Id
    @Column(name = "pack_transaction_limits_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPackTransactionLimitsId() {
        return packTransactionLimitsId;
    }

    public void setPackTransactionLimitsId(int packTransactionLimitsId) {
        this.packTransactionLimitsId = packTransactionLimitsId;
    }

    @Basic
    @Column(name = "pack_transaction_limits_pack_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPackTransactionLimitsPackId() {
        return packTransactionLimitsPackId;
    }

    public void setPackTransactionLimitsPackId(Integer packTransactionLimitsPackId) {
        this.packTransactionLimitsPackId = packTransactionLimitsPackId;
    }

    @Basic
    @Column(name = "pack_transaction_limits_limits_type_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPackTransactionLimitsLimitsTypeId() {
        return packTransactionLimitsLimitsTypeId;
    }

    public void setPackTransactionLimitsLimitsTypeId(Integer packTransactionLimitsLimitsTypeId) {
        this.packTransactionLimitsLimitsTypeId = packTransactionLimitsLimitsTypeId;
    }

    @Basic
    @Column(name = "pack_transaction_limits_transaction_type_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPackTransactionLimitsTransactionTypeId() {
        return packTransactionLimitsTransactionTypeId;
    }

    public void setPackTransactionLimitsTransactionTypeId(Integer packTransactionLimitsTransactionTypeId) {
        this.packTransactionLimitsTransactionTypeId = packTransactionLimitsTransactionTypeId;
    }

    @Basic
    @Column(name = "pack_transaction_limits_value", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getPackTransactionLimitsValue() {
        return packTransactionLimitsValue;
    }

    public void setPackTransactionLimitsValue(BigDecimal packTransactionLimitsValue) {
        this.packTransactionLimitsValue = packTransactionLimitsValue;
    }

    @Basic
    @Column(name = "pack_transaction_limits_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPackTransactionLimitsStatusId() {
        return packTransactionLimitsStatusId;
    }

    public void setPackTransactionLimitsStatusId(int packTransactionLimitsStatusId) {
        this.packTransactionLimitsStatusId = packTransactionLimitsStatusId;
    }

    @Basic
    @Column(name = "pack_transaction_limits_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPackTransactionLimitsCts() {
        return packTransactionLimitsCts;
    }

    public void setPackTransactionLimitsCts(Timestamp packTransactionLimitsCts) {
        this.packTransactionLimitsCts = packTransactionLimitsCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackTransactionLimitsEntity that = (PackTransactionLimitsEntity) o;

        if (packTransactionLimitsId != that.packTransactionLimitsId) return false;
        if (packTransactionLimitsStatusId != that.packTransactionLimitsStatusId) return false;
        if (packTransactionLimitsCts != null ? !packTransactionLimitsCts.equals(that.packTransactionLimitsCts) : that.packTransactionLimitsCts != null)
            return false;
        if (packTransactionLimitsLimitsTypeId != null ? !packTransactionLimitsLimitsTypeId.equals(that.packTransactionLimitsLimitsTypeId) : that.packTransactionLimitsLimitsTypeId != null)
            return false;
        if (packTransactionLimitsPackId != null ? !packTransactionLimitsPackId.equals(that.packTransactionLimitsPackId) : that.packTransactionLimitsPackId != null)
            return false;
        if (packTransactionLimitsTransactionTypeId != null ? !packTransactionLimitsTransactionTypeId.equals(that.packTransactionLimitsTransactionTypeId) : that.packTransactionLimitsTransactionTypeId != null)
            return false;
        if (packTransactionLimitsValue != null ? !packTransactionLimitsValue.equals(that.packTransactionLimitsValue) : that.packTransactionLimitsValue != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = packTransactionLimitsId;
        result = 31 * result + (packTransactionLimitsPackId != null ? packTransactionLimitsPackId.hashCode() : 0);
        result = 31 * result + (packTransactionLimitsLimitsTypeId != null ? packTransactionLimitsLimitsTypeId.hashCode() : 0);
        result = 31 * result + (packTransactionLimitsTransactionTypeId != null ? packTransactionLimitsTransactionTypeId.hashCode() : 0);
        result = 31 * result + (packTransactionLimitsValue != null ? packTransactionLimitsValue.hashCode() : 0);
        result = 31 * result + packTransactionLimitsStatusId;
        result = 31 * result + (packTransactionLimitsCts != null ? packTransactionLimitsCts.hashCode() : 0);
        return result;
    }
}
