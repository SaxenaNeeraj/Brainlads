package com.bm.hbm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "pin_available", schema = "", catalog = "brain")
public class PinAvailableEntity {
    private int pinAvailableId;
    private Integer pinAvailableBatchId;
    private Integer pinAvailableProductId;
    private String pinAvailableVendorCode;
    private String pinAvailableSerialNo;
    private String pinAvailablePin;
    private BigDecimal pinAvailableDenomination;
    private Timestamp pinAvailableActiveTs;
    private Timestamp pinAvailableExpiryTs;
    private int pinAvailablePinStatusId;
    private Timestamp pinAvailableCts;

    @Id
    @Column(name = "pin_available_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinAvailableId() {
        return pinAvailableId;
    }

    public void setPinAvailableId(int pinAvailableId) {
        this.pinAvailableId = pinAvailableId;
    }

    @Basic
    @Column(name = "pin_available_batch_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinAvailableBatchId() {
        return pinAvailableBatchId;
    }

    public void setPinAvailableBatchId(Integer pinAvailableBatchId) {
        this.pinAvailableBatchId = pinAvailableBatchId;
    }

    @Basic
    @Column(name = "pin_available_product_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinAvailableProductId() {
        return pinAvailableProductId;
    }

    public void setPinAvailableProductId(Integer pinAvailableProductId) {
        this.pinAvailableProductId = pinAvailableProductId;
    }

    @Basic
    @Column(name = "pin_available_vendor_code", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPinAvailableVendorCode() {
        return pinAvailableVendorCode;
    }

    public void setPinAvailableVendorCode(String pinAvailableVendorCode) {
        this.pinAvailableVendorCode = pinAvailableVendorCode;
    }

    @Basic
    @Column(name = "pin_available_serial_no", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPinAvailableSerialNo() {
        return pinAvailableSerialNo;
    }

    public void setPinAvailableSerialNo(String pinAvailableSerialNo) {
        this.pinAvailableSerialNo = pinAvailableSerialNo;
    }

    @Basic
    @Column(name = "pin_available_pin", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    public String getPinAvailablePin() {
        return pinAvailablePin;
    }

    public void setPinAvailablePin(String pinAvailablePin) {
        this.pinAvailablePin = pinAvailablePin;
    }

    @Basic
    @Column(name = "pin_available_denomination", nullable = true, insertable = true, updatable = true, length = 12, precision = 2)
    public BigDecimal getPinAvailableDenomination() {
        return pinAvailableDenomination;
    }

    public void setPinAvailableDenomination(BigDecimal pinAvailableDenomination) {
        this.pinAvailableDenomination = pinAvailableDenomination;
    }

    @Basic
    @Column(name = "pin_available_active_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinAvailableActiveTs() {
        return pinAvailableActiveTs;
    }

    public void setPinAvailableActiveTs(Timestamp pinAvailableActiveTs) {
        this.pinAvailableActiveTs = pinAvailableActiveTs;
    }

    @Basic
    @Column(name = "pin_available_expiry_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinAvailableExpiryTs() {
        return pinAvailableExpiryTs;
    }

    public void setPinAvailableExpiryTs(Timestamp pinAvailableExpiryTs) {
        this.pinAvailableExpiryTs = pinAvailableExpiryTs;
    }

    @Basic
    @Column(name = "pin_available_pin_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinAvailablePinStatusId() {
        return pinAvailablePinStatusId;
    }

    public void setPinAvailablePinStatusId(int pinAvailablePinStatusId) {
        this.pinAvailablePinStatusId = pinAvailablePinStatusId;
    }

    @Basic
    @Column(name = "pin_available_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinAvailableCts() {
        return pinAvailableCts;
    }

    public void setPinAvailableCts(Timestamp pinAvailableCts) {
        this.pinAvailableCts = pinAvailableCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PinAvailableEntity that = (PinAvailableEntity) o;

        if (pinAvailableId != that.pinAvailableId) return false;
        if (pinAvailablePinStatusId != that.pinAvailablePinStatusId) return false;
        if (pinAvailableActiveTs != null ? !pinAvailableActiveTs.equals(that.pinAvailableActiveTs) : that.pinAvailableActiveTs != null)
            return false;
        if (pinAvailableBatchId != null ? !pinAvailableBatchId.equals(that.pinAvailableBatchId) : that.pinAvailableBatchId != null)
            return false;
        if (pinAvailableCts != null ? !pinAvailableCts.equals(that.pinAvailableCts) : that.pinAvailableCts != null)
            return false;
        if (pinAvailableDenomination != null ? !pinAvailableDenomination.equals(that.pinAvailableDenomination) : that.pinAvailableDenomination != null)
            return false;
        if (pinAvailableExpiryTs != null ? !pinAvailableExpiryTs.equals(that.pinAvailableExpiryTs) : that.pinAvailableExpiryTs != null)
            return false;
        if (pinAvailablePin != null ? !pinAvailablePin.equals(that.pinAvailablePin) : that.pinAvailablePin != null)
            return false;
        if (pinAvailableProductId != null ? !pinAvailableProductId.equals(that.pinAvailableProductId) : that.pinAvailableProductId != null)
            return false;
        if (pinAvailableSerialNo != null ? !pinAvailableSerialNo.equals(that.pinAvailableSerialNo) : that.pinAvailableSerialNo != null)
            return false;
        if (pinAvailableVendorCode != null ? !pinAvailableVendorCode.equals(that.pinAvailableVendorCode) : that.pinAvailableVendorCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pinAvailableId;
        result = 31 * result + (pinAvailableBatchId != null ? pinAvailableBatchId.hashCode() : 0);
        result = 31 * result + (pinAvailableProductId != null ? pinAvailableProductId.hashCode() : 0);
        result = 31 * result + (pinAvailableVendorCode != null ? pinAvailableVendorCode.hashCode() : 0);
        result = 31 * result + (pinAvailableSerialNo != null ? pinAvailableSerialNo.hashCode() : 0);
        result = 31 * result + (pinAvailablePin != null ? pinAvailablePin.hashCode() : 0);
        result = 31 * result + (pinAvailableDenomination != null ? pinAvailableDenomination.hashCode() : 0);
        result = 31 * result + (pinAvailableActiveTs != null ? pinAvailableActiveTs.hashCode() : 0);
        result = 31 * result + (pinAvailableExpiryTs != null ? pinAvailableExpiryTs.hashCode() : 0);
        result = 31 * result + pinAvailablePinStatusId;
        result = 31 * result + (pinAvailableCts != null ? pinAvailableCts.hashCode() : 0);
        return result;
    }
}
