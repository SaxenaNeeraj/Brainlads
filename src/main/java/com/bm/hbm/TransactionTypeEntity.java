package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "transaction_type", schema = "", catalog = "brain")
public class TransactionTypeEntity {
    private int transactionTypeId;
    private String transactionTypeCode;
    private String transactionTypeName;
    private int transactionTypeStatusId;
    private Timestamp transactionTypeCts;

    @Id
    @Column(name = "transaction_type_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(int transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    @Basic
    @Column(name = "transaction_type_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    public void setTransactionTypeCode(String transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }

    @Basic
    @Column(name = "transaction_type_name", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getTransactionTypeName() {
        return transactionTypeName;
    }

    public void setTransactionTypeName(String transactionTypeName) {
        this.transactionTypeName = transactionTypeName;
    }

    @Basic
    @Column(name = "transaction_type_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getTransactionTypeStatusId() {
        return transactionTypeStatusId;
    }

    public void setTransactionTypeStatusId(int transactionTypeStatusId) {
        this.transactionTypeStatusId = transactionTypeStatusId;
    }

    @Basic
    @Column(name = "transaction_type_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getTransactionTypeCts() {
        return transactionTypeCts;
    }

    public void setTransactionTypeCts(Timestamp transactionTypeCts) {
        this.transactionTypeCts = transactionTypeCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransactionTypeEntity that = (TransactionTypeEntity) o;

        if (transactionTypeId != that.transactionTypeId) return false;
        if (transactionTypeStatusId != that.transactionTypeStatusId) return false;
        if (transactionTypeCode != null ? !transactionTypeCode.equals(that.transactionTypeCode) : that.transactionTypeCode != null)
            return false;
        if (transactionTypeCts != null ? !transactionTypeCts.equals(that.transactionTypeCts) : that.transactionTypeCts != null)
            return false;
        if (transactionTypeName != null ? !transactionTypeName.equals(that.transactionTypeName) : that.transactionTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = transactionTypeId;
        result = 31 * result + (transactionTypeCode != null ? transactionTypeCode.hashCode() : 0);
        result = 31 * result + (transactionTypeName != null ? transactionTypeName.hashCode() : 0);
        result = 31 * result + transactionTypeStatusId;
        result = 31 * result + (transactionTypeCts != null ? transactionTypeCts.hashCode() : 0);
        return result;
    }
}
