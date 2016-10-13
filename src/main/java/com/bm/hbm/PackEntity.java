package com.bm.hbm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "pack", schema = "", catalog = "brain")
public class PackEntity {
    private int packId;
    private String packCode;
    private String packName;
    private int packChannelTypeId;
    private String packFeeType;
    private BigDecimal packFee;
    private String packExtraFeeType;
    private BigDecimal packExtraFee;
    private int packStatusId;
    private Timestamp packCts;

    @Id
    @Column(name = "pack_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPackId() {
        return packId;
    }

    public void setPackId(int packId) {
        this.packId = packId;
    }

    @Basic
    @Column(name = "pack_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPackCode() {
        return packCode;
    }

    public void setPackCode(String packCode) {
        this.packCode = packCode;
    }

    @Basic
    @Column(name = "pack_name", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }

    @Basic
    @Column(name = "pack_channel_type_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPackChannelTypeId() {
        return packChannelTypeId;
    }

    public void setPackChannelTypeId(int packChannelTypeId) {
        this.packChannelTypeId = packChannelTypeId;
    }

    @Basic
    @Column(name = "pack_fee_type", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getPackFeeType() {
        return packFeeType;
    }

    public void setPackFeeType(String packFeeType) {
        this.packFeeType = packFeeType;
    }

    @Basic
    @Column(name = "pack_fee", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getPackFee() {
        return packFee;
    }

    public void setPackFee(BigDecimal packFee) {
        this.packFee = packFee;
    }

    @Basic
    @Column(name = "pack_extra_fee_type", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getPackExtraFeeType() {
        return packExtraFeeType;
    }

    public void setPackExtraFeeType(String packExtraFeeType) {
        this.packExtraFeeType = packExtraFeeType;
    }

    @Basic
    @Column(name = "pack_extra_fee", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getPackExtraFee() {
        return packExtraFee;
    }

    public void setPackExtraFee(BigDecimal packExtraFee) {
        this.packExtraFee = packExtraFee;
    }

    @Basic
    @Column(name = "pack_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPackStatusId() {
        return packStatusId;
    }

    public void setPackStatusId(int packStatusId) {
        this.packStatusId = packStatusId;
    }

    @Basic
    @Column(name = "pack_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPackCts() {
        return packCts;
    }

    public void setPackCts(Timestamp packCts) {
        this.packCts = packCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackEntity that = (PackEntity) o;

        if (packChannelTypeId != that.packChannelTypeId) return false;
        if (packId != that.packId) return false;
        if (packStatusId != that.packStatusId) return false;
        if (packCode != null ? !packCode.equals(that.packCode) : that.packCode != null) return false;
        if (packCts != null ? !packCts.equals(that.packCts) : that.packCts != null) return false;
        if (packExtraFee != null ? !packExtraFee.equals(that.packExtraFee) : that.packExtraFee != null) return false;
        if (packExtraFeeType != null ? !packExtraFeeType.equals(that.packExtraFeeType) : that.packExtraFeeType != null)
            return false;
        if (packFee != null ? !packFee.equals(that.packFee) : that.packFee != null) return false;
        if (packFeeType != null ? !packFeeType.equals(that.packFeeType) : that.packFeeType != null) return false;
        if (packName != null ? !packName.equals(that.packName) : that.packName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = packId;
        result = 31 * result + (packCode != null ? packCode.hashCode() : 0);
        result = 31 * result + (packName != null ? packName.hashCode() : 0);
        result = 31 * result + packChannelTypeId;
        result = 31 * result + (packFeeType != null ? packFeeType.hashCode() : 0);
        result = 31 * result + (packFee != null ? packFee.hashCode() : 0);
        result = 31 * result + (packExtraFeeType != null ? packExtraFeeType.hashCode() : 0);
        result = 31 * result + (packExtraFee != null ? packExtraFee.hashCode() : 0);
        result = 31 * result + packStatusId;
        result = 31 * result + (packCts != null ? packCts.hashCode() : 0);
        return result;
    }
}
