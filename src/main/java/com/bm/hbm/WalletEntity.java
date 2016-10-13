package com.bm.hbm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "wallet", schema = "", catalog = "brain")
public class WalletEntity {
    private int walletId;
    private int walletTypeId;
    private BigDecimal walletValue;
    private BigDecimal walletAllocatedValue;
    private BigDecimal walletMinValue;
    private BigDecimal walletMaxValue;
    private BigDecimal walletAlertValue;
    private String walletNotifyMsisdn;
    private String walletNotifyEmail;
    private int walletStatusId;
    private Timestamp walletCts;

    @Id
    @Column(name = "wallet_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    @Basic
    @Column(name = "wallet_type_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getWalletTypeId() {
        return walletTypeId;
    }

    public void setWalletTypeId(int walletTypeId) {
        this.walletTypeId = walletTypeId;
    }

    @Basic
    @Column(name = "wallet_value", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getWalletValue() {
        return walletValue;
    }

    public void setWalletValue(BigDecimal walletValue) {
        this.walletValue = walletValue;
    }

    @Basic
    @Column(name = "wallet_allocated_value", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getWalletAllocatedValue() {
        return walletAllocatedValue;
    }

    public void setWalletAllocatedValue(BigDecimal walletAllocatedValue) {
        this.walletAllocatedValue = walletAllocatedValue;
    }

    @Basic
    @Column(name = "wallet_min_value", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getWalletMinValue() {
        return walletMinValue;
    }

    public void setWalletMinValue(BigDecimal walletMinValue) {
        this.walletMinValue = walletMinValue;
    }

    @Basic
    @Column(name = "wallet_max_value", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getWalletMaxValue() {
        return walletMaxValue;
    }

    public void setWalletMaxValue(BigDecimal walletMaxValue) {
        this.walletMaxValue = walletMaxValue;
    }

    @Basic
    @Column(name = "wallet_alert_value", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getWalletAlertValue() {
        return walletAlertValue;
    }

    public void setWalletAlertValue(BigDecimal walletAlertValue) {
        this.walletAlertValue = walletAlertValue;
    }

    @Basic
    @Column(name = "wallet_notify_msisdn", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getWalletNotifyMsisdn() {
        return walletNotifyMsisdn;
    }

    public void setWalletNotifyMsisdn(String walletNotifyMsisdn) {
        this.walletNotifyMsisdn = walletNotifyMsisdn;
    }

    @Basic
    @Column(name = "wallet_notify_email", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getWalletNotifyEmail() {
        return walletNotifyEmail;
    }

    public void setWalletNotifyEmail(String walletNotifyEmail) {
        this.walletNotifyEmail = walletNotifyEmail;
    }

    @Basic
    @Column(name = "wallet_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getWalletStatusId() {
        return walletStatusId;
    }

    public void setWalletStatusId(int walletStatusId) {
        this.walletStatusId = walletStatusId;
    }

    @Basic
    @Column(name = "wallet_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getWalletCts() {
        return walletCts;
    }

    public void setWalletCts(Timestamp walletCts) {
        this.walletCts = walletCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WalletEntity that = (WalletEntity) o;

        if (walletId != that.walletId) return false;
        if (walletStatusId != that.walletStatusId) return false;
        if (walletTypeId != that.walletTypeId) return false;
        if (walletAlertValue != null ? !walletAlertValue.equals(that.walletAlertValue) : that.walletAlertValue != null)
            return false;
        if (walletAllocatedValue != null ? !walletAllocatedValue.equals(that.walletAllocatedValue) : that.walletAllocatedValue != null)
            return false;
        if (walletCts != null ? !walletCts.equals(that.walletCts) : that.walletCts != null) return false;
        if (walletMaxValue != null ? !walletMaxValue.equals(that.walletMaxValue) : that.walletMaxValue != null)
            return false;
        if (walletMinValue != null ? !walletMinValue.equals(that.walletMinValue) : that.walletMinValue != null)
            return false;
        if (walletNotifyEmail != null ? !walletNotifyEmail.equals(that.walletNotifyEmail) : that.walletNotifyEmail != null)
            return false;
        if (walletNotifyMsisdn != null ? !walletNotifyMsisdn.equals(that.walletNotifyMsisdn) : that.walletNotifyMsisdn != null)
            return false;
        if (walletValue != null ? !walletValue.equals(that.walletValue) : that.walletValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = walletId;
        result = 31 * result + walletTypeId;
        result = 31 * result + (walletValue != null ? walletValue.hashCode() : 0);
        result = 31 * result + (walletAllocatedValue != null ? walletAllocatedValue.hashCode() : 0);
        result = 31 * result + (walletMinValue != null ? walletMinValue.hashCode() : 0);
        result = 31 * result + (walletMaxValue != null ? walletMaxValue.hashCode() : 0);
        result = 31 * result + (walletAlertValue != null ? walletAlertValue.hashCode() : 0);
        result = 31 * result + (walletNotifyMsisdn != null ? walletNotifyMsisdn.hashCode() : 0);
        result = 31 * result + (walletNotifyEmail != null ? walletNotifyEmail.hashCode() : 0);
        result = 31 * result + walletStatusId;
        result = 31 * result + (walletCts != null ? walletCts.hashCode() : 0);
        return result;
    }
}
