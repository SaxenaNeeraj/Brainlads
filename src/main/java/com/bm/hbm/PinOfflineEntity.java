package com.bm.hbm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "pin_offline", schema = "", catalog = "brain")
public class PinOfflineEntity {
    private int pinOfflineId;
    private Integer pinOfflineBatchId;
    private Integer pinOfflineProductId;
    private String pinOfflineVendorCode;
    private String pinOfflineSerialNo;
    private String pinOfflinePin;
    private BigDecimal pinOfflineDenomination;
    private Timestamp pinOfflineActiveTs;
    private Timestamp pinOfflineExpiryTs;
    private int pinOfflinePinStatusId;
    private Timestamp pinOfflineCts;

    @Id
    @Column(name = "pin_offline_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinOfflineId() {
        return pinOfflineId;
    }

    public void setPinOfflineId(int pinOfflineId) {
        this.pinOfflineId = pinOfflineId;
    }

    @Basic
    @Column(name = "pin_offline_batch_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinOfflineBatchId() {
        return pinOfflineBatchId;
    }

    public void setPinOfflineBatchId(Integer pinOfflineBatchId) {
        this.pinOfflineBatchId = pinOfflineBatchId;
    }

    @Basic
    @Column(name = "pin_offline_product_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinOfflineProductId() {
        return pinOfflineProductId;
    }

    public void setPinOfflineProductId(Integer pinOfflineProductId) {
        this.pinOfflineProductId = pinOfflineProductId;
    }

    @Basic
    @Column(name = "pin_offline_vendor_code", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPinOfflineVendorCode() {
        return pinOfflineVendorCode;
    }

    public void setPinOfflineVendorCode(String pinOfflineVendorCode) {
        this.pinOfflineVendorCode = pinOfflineVendorCode;
    }

    @Basic
    @Column(name = "pin_offline_serial_no", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPinOfflineSerialNo() {
        return pinOfflineSerialNo;
    }

    public void setPinOfflineSerialNo(String pinOfflineSerialNo) {
        this.pinOfflineSerialNo = pinOfflineSerialNo;
    }

    @Basic
    @Column(name = "pin_offline_pin", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    public String getPinOfflinePin() {
        return pinOfflinePin;
    }

    public void setPinOfflinePin(String pinOfflinePin) {
        this.pinOfflinePin = pinOfflinePin;
    }

    @Basic
    @Column(name = "pin_offline_denomination", nullable = true, insertable = true, updatable = true, length = 12, precision = 2)
    public BigDecimal getPinOfflineDenomination() {
        return pinOfflineDenomination;
    }

    public void setPinOfflineDenomination(BigDecimal pinOfflineDenomination) {
        this.pinOfflineDenomination = pinOfflineDenomination;
    }

    @Basic
    @Column(name = "pin_offline_active_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinOfflineActiveTs() {
        return pinOfflineActiveTs;
    }

    public void setPinOfflineActiveTs(Timestamp pinOfflineActiveTs) {
        this.pinOfflineActiveTs = pinOfflineActiveTs;
    }

    @Basic
    @Column(name = "pin_offline_expiry_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinOfflineExpiryTs() {
        return pinOfflineExpiryTs;
    }

    public void setPinOfflineExpiryTs(Timestamp pinOfflineExpiryTs) {
        this.pinOfflineExpiryTs = pinOfflineExpiryTs;
    }

    @Basic
    @Column(name = "pin_offline_pin_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinOfflinePinStatusId() {
        return pinOfflinePinStatusId;
    }

    public void setPinOfflinePinStatusId(int pinOfflinePinStatusId) {
        this.pinOfflinePinStatusId = pinOfflinePinStatusId;
    }

    @Basic
    @Column(name = "pin_offline_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinOfflineCts() {
        return pinOfflineCts;
    }

    public void setPinOfflineCts(Timestamp pinOfflineCts) {
        this.pinOfflineCts = pinOfflineCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PinOfflineEntity that = (PinOfflineEntity) o;

        if (pinOfflineId != that.pinOfflineId) return false;
        if (pinOfflinePinStatusId != that.pinOfflinePinStatusId) return false;
        if (pinOfflineActiveTs != null ? !pinOfflineActiveTs.equals(that.pinOfflineActiveTs) : that.pinOfflineActiveTs != null)
            return false;
        if (pinOfflineBatchId != null ? !pinOfflineBatchId.equals(that.pinOfflineBatchId) : that.pinOfflineBatchId != null)
            return false;
        if (pinOfflineCts != null ? !pinOfflineCts.equals(that.pinOfflineCts) : that.pinOfflineCts != null)
            return false;
        if (pinOfflineDenomination != null ? !pinOfflineDenomination.equals(that.pinOfflineDenomination) : that.pinOfflineDenomination != null)
            return false;
        if (pinOfflineExpiryTs != null ? !pinOfflineExpiryTs.equals(that.pinOfflineExpiryTs) : that.pinOfflineExpiryTs != null)
            return false;
        if (pinOfflinePin != null ? !pinOfflinePin.equals(that.pinOfflinePin) : that.pinOfflinePin != null)
            return false;
        if (pinOfflineProductId != null ? !pinOfflineProductId.equals(that.pinOfflineProductId) : that.pinOfflineProductId != null)
            return false;
        if (pinOfflineSerialNo != null ? !pinOfflineSerialNo.equals(that.pinOfflineSerialNo) : that.pinOfflineSerialNo != null)
            return false;
        if (pinOfflineVendorCode != null ? !pinOfflineVendorCode.equals(that.pinOfflineVendorCode) : that.pinOfflineVendorCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pinOfflineId;
        result = 31 * result + (pinOfflineBatchId != null ? pinOfflineBatchId.hashCode() : 0);
        result = 31 * result + (pinOfflineProductId != null ? pinOfflineProductId.hashCode() : 0);
        result = 31 * result + (pinOfflineVendorCode != null ? pinOfflineVendorCode.hashCode() : 0);
        result = 31 * result + (pinOfflineSerialNo != null ? pinOfflineSerialNo.hashCode() : 0);
        result = 31 * result + (pinOfflinePin != null ? pinOfflinePin.hashCode() : 0);
        result = 31 * result + (pinOfflineDenomination != null ? pinOfflineDenomination.hashCode() : 0);
        result = 31 * result + (pinOfflineActiveTs != null ? pinOfflineActiveTs.hashCode() : 0);
        result = 31 * result + (pinOfflineExpiryTs != null ? pinOfflineExpiryTs.hashCode() : 0);
        result = 31 * result + pinOfflinePinStatusId;
        result = 31 * result + (pinOfflineCts != null ? pinOfflineCts.hashCode() : 0);
        return result;
    }
}
