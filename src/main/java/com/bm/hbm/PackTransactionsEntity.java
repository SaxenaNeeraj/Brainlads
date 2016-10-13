package com.bm.hbm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "pack_transactions", schema = "", catalog = "brain")
public class PackTransactionsEntity {
    private int packTransactionsId;
    private int packTransactionsPackId;
    private int packTransactionsTransactionTypeId;
    private Integer packTransactionsChannelId;
    private Integer packTransactionsProductId;
    private Integer packTransactionsMinValue;
    private Integer packTransactionsMaxValue;
    private String packTransactionsFeeType;
    private BigDecimal packTransactionsFee;
    private String packTransactionsExtraFeeType;
    private BigDecimal packTransactionsExtraFee;
    private String packTransactionsCommissonValue;
    private int packTransactionsStatusId;
    private Timestamp packTransactionsCts;

    @Id
    @Column(name = "pack_transactions_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPackTransactionsId() {
        return packTransactionsId;
    }

    public void setPackTransactionsId(int packTransactionsId) {
        this.packTransactionsId = packTransactionsId;
    }

    @Basic
    @Column(name = "pack_transactions_pack_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPackTransactionsPackId() {
        return packTransactionsPackId;
    }

    public void setPackTransactionsPackId(int packTransactionsPackId) {
        this.packTransactionsPackId = packTransactionsPackId;
    }

    @Basic
    @Column(name = "pack_transactions_transaction_type_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPackTransactionsTransactionTypeId() {
        return packTransactionsTransactionTypeId;
    }

    public void setPackTransactionsTransactionTypeId(int packTransactionsTransactionTypeId) {
        this.packTransactionsTransactionTypeId = packTransactionsTransactionTypeId;
    }

    @Basic
    @Column(name = "pack_transactions_channel_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPackTransactionsChannelId() {
        return packTransactionsChannelId;
    }

    public void setPackTransactionsChannelId(Integer packTransactionsChannelId) {
        this.packTransactionsChannelId = packTransactionsChannelId;
    }

    @Basic
    @Column(name = "pack_transactions_product_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPackTransactionsProductId() {
        return packTransactionsProductId;
    }

    public void setPackTransactionsProductId(Integer packTransactionsProductId) {
        this.packTransactionsProductId = packTransactionsProductId;
    }

    @Basic
    @Column(name = "pack_transactions_min_value", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPackTransactionsMinValue() {
        return packTransactionsMinValue;
    }

    public void setPackTransactionsMinValue(Integer packTransactionsMinValue) {
        this.packTransactionsMinValue = packTransactionsMinValue;
    }

    @Basic
    @Column(name = "pack_transactions_max_value", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPackTransactionsMaxValue() {
        return packTransactionsMaxValue;
    }

    public void setPackTransactionsMaxValue(Integer packTransactionsMaxValue) {
        this.packTransactionsMaxValue = packTransactionsMaxValue;
    }

    @Basic
    @Column(name = "pack_transactions_fee_type", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getPackTransactionsFeeType() {
        return packTransactionsFeeType;
    }

    public void setPackTransactionsFeeType(String packTransactionsFeeType) {
        this.packTransactionsFeeType = packTransactionsFeeType;
    }

    @Basic
    @Column(name = "pack_transactions_fee", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getPackTransactionsFee() {
        return packTransactionsFee;
    }

    public void setPackTransactionsFee(BigDecimal packTransactionsFee) {
        this.packTransactionsFee = packTransactionsFee;
    }

    @Basic
    @Column(name = "pack_transactions_extra_fee_type", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getPackTransactionsExtraFeeType() {
        return packTransactionsExtraFeeType;
    }

    public void setPackTransactionsExtraFeeType(String packTransactionsExtraFeeType) {
        this.packTransactionsExtraFeeType = packTransactionsExtraFeeType;
    }

    @Basic
    @Column(name = "pack_transactions_extra_fee", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getPackTransactionsExtraFee() {
        return packTransactionsExtraFee;
    }

    public void setPackTransactionsExtraFee(BigDecimal packTransactionsExtraFee) {
        this.packTransactionsExtraFee = packTransactionsExtraFee;
    }

    @Basic
    @Column(name = "pack_transactions_commisson_value", nullable = true, insertable = true, updatable = true, length = 128, precision = 0)
    public String getPackTransactionsCommissonValue() {
        return packTransactionsCommissonValue;
    }

    public void setPackTransactionsCommissonValue(String packTransactionsCommissonValue) {
        this.packTransactionsCommissonValue = packTransactionsCommissonValue;
    }

    @Basic
    @Column(name = "pack_transactions_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPackTransactionsStatusId() {
        return packTransactionsStatusId;
    }

    public void setPackTransactionsStatusId(int packTransactionsStatusId) {
        this.packTransactionsStatusId = packTransactionsStatusId;
    }

    @Basic
    @Column(name = "pack_transactions_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPackTransactionsCts() {
        return packTransactionsCts;
    }

    public void setPackTransactionsCts(Timestamp packTransactionsCts) {
        this.packTransactionsCts = packTransactionsCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackTransactionsEntity that = (PackTransactionsEntity) o;

        if (packTransactionsId != that.packTransactionsId) return false;
        if (packTransactionsPackId != that.packTransactionsPackId) return false;
        if (packTransactionsStatusId != that.packTransactionsStatusId) return false;
        if (packTransactionsTransactionTypeId != that.packTransactionsTransactionTypeId) return false;
        if (packTransactionsChannelId != null ? !packTransactionsChannelId.equals(that.packTransactionsChannelId) : that.packTransactionsChannelId != null)
            return false;
        if (packTransactionsCommissonValue != null ? !packTransactionsCommissonValue.equals(that.packTransactionsCommissonValue) : that.packTransactionsCommissonValue != null)
            return false;
        if (packTransactionsCts != null ? !packTransactionsCts.equals(that.packTransactionsCts) : that.packTransactionsCts != null)
            return false;
        if (packTransactionsExtraFee != null ? !packTransactionsExtraFee.equals(that.packTransactionsExtraFee) : that.packTransactionsExtraFee != null)
            return false;
        if (packTransactionsExtraFeeType != null ? !packTransactionsExtraFeeType.equals(that.packTransactionsExtraFeeType) : that.packTransactionsExtraFeeType != null)
            return false;
        if (packTransactionsFee != null ? !packTransactionsFee.equals(that.packTransactionsFee) : that.packTransactionsFee != null)
            return false;
        if (packTransactionsFeeType != null ? !packTransactionsFeeType.equals(that.packTransactionsFeeType) : that.packTransactionsFeeType != null)
            return false;
        if (packTransactionsMaxValue != null ? !packTransactionsMaxValue.equals(that.packTransactionsMaxValue) : that.packTransactionsMaxValue != null)
            return false;
        if (packTransactionsMinValue != null ? !packTransactionsMinValue.equals(that.packTransactionsMinValue) : that.packTransactionsMinValue != null)
            return false;
        if (packTransactionsProductId != null ? !packTransactionsProductId.equals(that.packTransactionsProductId) : that.packTransactionsProductId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = packTransactionsId;
        result = 31 * result + packTransactionsPackId;
        result = 31 * result + packTransactionsTransactionTypeId;
        result = 31 * result + (packTransactionsChannelId != null ? packTransactionsChannelId.hashCode() : 0);
        result = 31 * result + (packTransactionsProductId != null ? packTransactionsProductId.hashCode() : 0);
        result = 31 * result + (packTransactionsMinValue != null ? packTransactionsMinValue.hashCode() : 0);
        result = 31 * result + (packTransactionsMaxValue != null ? packTransactionsMaxValue.hashCode() : 0);
        result = 31 * result + (packTransactionsFeeType != null ? packTransactionsFeeType.hashCode() : 0);
        result = 31 * result + (packTransactionsFee != null ? packTransactionsFee.hashCode() : 0);
        result = 31 * result + (packTransactionsExtraFeeType != null ? packTransactionsExtraFeeType.hashCode() : 0);
        result = 31 * result + (packTransactionsExtraFee != null ? packTransactionsExtraFee.hashCode() : 0);
        result = 31 * result + (packTransactionsCommissonValue != null ? packTransactionsCommissonValue.hashCode() : 0);
        result = 31 * result + packTransactionsStatusId;
        result = 31 * result + (packTransactionsCts != null ? packTransactionsCts.hashCode() : 0);
        return result;
    }
}
