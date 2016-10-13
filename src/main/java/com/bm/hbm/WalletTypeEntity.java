package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "wallet_type", schema = "", catalog = "brain")
public class WalletTypeEntity {
    private int walletTypeId;
    private String walletTypeCode;
    private String walletTypeName;
    private int walletTypeStatusId;
    private Timestamp walletTypeCts;

    @Id
    @Column(name = "wallet_type_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getWalletTypeId() {
        return walletTypeId;
    }

    public void setWalletTypeId(int walletTypeId) {
        this.walletTypeId = walletTypeId;
    }

    @Basic
    @Column(name = "wallet_type_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getWalletTypeCode() {
        return walletTypeCode;
    }

    public void setWalletTypeCode(String walletTypeCode) {
        this.walletTypeCode = walletTypeCode;
    }

    @Basic
    @Column(name = "wallet_type_name", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getWalletTypeName() {
        return walletTypeName;
    }

    public void setWalletTypeName(String walletTypeName) {
        this.walletTypeName = walletTypeName;
    }

    @Basic
    @Column(name = "wallet_type_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getWalletTypeStatusId() {
        return walletTypeStatusId;
    }

    public void setWalletTypeStatusId(int walletTypeStatusId) {
        this.walletTypeStatusId = walletTypeStatusId;
    }

    @Basic
    @Column(name = "wallet_type_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getWalletTypeCts() {
        return walletTypeCts;
    }

    public void setWalletTypeCts(Timestamp walletTypeCts) {
        this.walletTypeCts = walletTypeCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WalletTypeEntity that = (WalletTypeEntity) o;

        if (walletTypeId != that.walletTypeId) return false;
        if (walletTypeStatusId != that.walletTypeStatusId) return false;
        if (walletTypeCode != null ? !walletTypeCode.equals(that.walletTypeCode) : that.walletTypeCode != null)
            return false;
        if (walletTypeCts != null ? !walletTypeCts.equals(that.walletTypeCts) : that.walletTypeCts != null)
            return false;
        if (walletTypeName != null ? !walletTypeName.equals(that.walletTypeName) : that.walletTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = walletTypeId;
        result = 31 * result + (walletTypeCode != null ? walletTypeCode.hashCode() : 0);
        result = 31 * result + (walletTypeName != null ? walletTypeName.hashCode() : 0);
        result = 31 * result + walletTypeStatusId;
        result = 31 * result + (walletTypeCts != null ? walletTypeCts.hashCode() : 0);
        return result;
    }
}
