package com.bm.hbm;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "pin_upload_fail", schema = "", catalog = "brain")
public class PinUploadFailEntity {
    private int pinUploadFailId;
    private Integer pinUploadFailPinFailureReasonId;
    private Integer pinUploadFailBatchId;
    private Integer pinUploadFailProductId;
    private String pinUploadFailVendorCode;
    private String pinUploadFailSerialNo;
    private String pinUploadFailPin;
    private BigDecimal pinUploadFailDenomination;
    private Timestamp pinUploadFailExpiryTs;
    private int pinUploadFailPinStatusId;
    private Timestamp pinUploadFailCts;

    @Id
    @Column(name = "pin_upload_fail_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinUploadFailId() {
        return pinUploadFailId;
    }

    public void setPinUploadFailId(int pinUploadFailId) {
        this.pinUploadFailId = pinUploadFailId;
    }

    @Basic
    @Column(name = "pin_upload_fail_pin_failure_reason_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinUploadFailPinFailureReasonId() {
        return pinUploadFailPinFailureReasonId;
    }

    public void setPinUploadFailPinFailureReasonId(Integer pinUploadFailPinFailureReasonId) {
        this.pinUploadFailPinFailureReasonId = pinUploadFailPinFailureReasonId;
    }

    @Basic
    @Column(name = "pin_upload_fail_batch_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinUploadFailBatchId() {
        return pinUploadFailBatchId;
    }

    public void setPinUploadFailBatchId(Integer pinUploadFailBatchId) {
        this.pinUploadFailBatchId = pinUploadFailBatchId;
    }

    @Basic
    @Column(name = "pin_upload_fail_product_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinUploadFailProductId() {
        return pinUploadFailProductId;
    }

    public void setPinUploadFailProductId(Integer pinUploadFailProductId) {
        this.pinUploadFailProductId = pinUploadFailProductId;
    }

    @Basic
    @Column(name = "pin_upload_fail_vendor_code", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPinUploadFailVendorCode() {
        return pinUploadFailVendorCode;
    }

    public void setPinUploadFailVendorCode(String pinUploadFailVendorCode) {
        this.pinUploadFailVendorCode = pinUploadFailVendorCode;
    }

    @Basic
    @Column(name = "pin_upload_fail_serial_no", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPinUploadFailSerialNo() {
        return pinUploadFailSerialNo;
    }

    public void setPinUploadFailSerialNo(String pinUploadFailSerialNo) {
        this.pinUploadFailSerialNo = pinUploadFailSerialNo;
    }

    @Basic
    @Column(name = "pin_upload_fail_pin", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    public String getPinUploadFailPin() {
        return pinUploadFailPin;
    }

    public void setPinUploadFailPin(String pinUploadFailPin) {
        this.pinUploadFailPin = pinUploadFailPin;
    }

    @Basic
    @Column(name = "pin_upload_fail_denomination", nullable = true, insertable = true, updatable = true, length = 12, precision = 2)
    public BigDecimal getPinUploadFailDenomination() {
        return pinUploadFailDenomination;
    }

    public void setPinUploadFailDenomination(BigDecimal pinUploadFailDenomination) {
        this.pinUploadFailDenomination = pinUploadFailDenomination;
    }

    @Basic
    @Column(name = "pin_upload_fail_expiry_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinUploadFailExpiryTs() {
        return pinUploadFailExpiryTs;
    }

    public void setPinUploadFailExpiryTs(Timestamp pinUploadFailExpiryTs) {
        this.pinUploadFailExpiryTs = pinUploadFailExpiryTs;
    }

    @Basic
    @Column(name = "pin_upload_fail_pin_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinUploadFailPinStatusId() {
        return pinUploadFailPinStatusId;
    }

    public void setPinUploadFailPinStatusId(int pinUploadFailPinStatusId) {
        this.pinUploadFailPinStatusId = pinUploadFailPinStatusId;
    }

    @Basic
    @Column(name = "pin_upload_fail_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinUploadFailCts() {
        return pinUploadFailCts;
    }

    public void setPinUploadFailCts(Timestamp pinUploadFailCts) {
        this.pinUploadFailCts = pinUploadFailCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PinUploadFailEntity that = (PinUploadFailEntity) o;

        if (pinUploadFailId != that.pinUploadFailId) return false;
        if (pinUploadFailPinStatusId != that.pinUploadFailPinStatusId) return false;
        if (pinUploadFailBatchId != null ? !pinUploadFailBatchId.equals(that.pinUploadFailBatchId) : that.pinUploadFailBatchId != null)
            return false;
        if (pinUploadFailCts != null ? !pinUploadFailCts.equals(that.pinUploadFailCts) : that.pinUploadFailCts != null)
            return false;
        if (pinUploadFailDenomination != null ? !pinUploadFailDenomination.equals(that.pinUploadFailDenomination) : that.pinUploadFailDenomination != null)
            return false;
        if (pinUploadFailExpiryTs != null ? !pinUploadFailExpiryTs.equals(that.pinUploadFailExpiryTs) : that.pinUploadFailExpiryTs != null)
            return false;
        if (pinUploadFailPin != null ? !pinUploadFailPin.equals(that.pinUploadFailPin) : that.pinUploadFailPin != null)
            return false;
        if (pinUploadFailPinFailureReasonId != null ? !pinUploadFailPinFailureReasonId.equals(that.pinUploadFailPinFailureReasonId) : that.pinUploadFailPinFailureReasonId != null)
            return false;
        if (pinUploadFailProductId != null ? !pinUploadFailProductId.equals(that.pinUploadFailProductId) : that.pinUploadFailProductId != null)
            return false;
        if (pinUploadFailSerialNo != null ? !pinUploadFailSerialNo.equals(that.pinUploadFailSerialNo) : that.pinUploadFailSerialNo != null)
            return false;
        if (pinUploadFailVendorCode != null ? !pinUploadFailVendorCode.equals(that.pinUploadFailVendorCode) : that.pinUploadFailVendorCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pinUploadFailId;
        result = 31 * result + (pinUploadFailPinFailureReasonId != null ? pinUploadFailPinFailureReasonId.hashCode() : 0);
        result = 31 * result + (pinUploadFailBatchId != null ? pinUploadFailBatchId.hashCode() : 0);
        result = 31 * result + (pinUploadFailProductId != null ? pinUploadFailProductId.hashCode() : 0);
        result = 31 * result + (pinUploadFailVendorCode != null ? pinUploadFailVendorCode.hashCode() : 0);
        result = 31 * result + (pinUploadFailSerialNo != null ? pinUploadFailSerialNo.hashCode() : 0);
        result = 31 * result + (pinUploadFailPin != null ? pinUploadFailPin.hashCode() : 0);
        result = 31 * result + (pinUploadFailDenomination != null ? pinUploadFailDenomination.hashCode() : 0);
        result = 31 * result + (pinUploadFailExpiryTs != null ? pinUploadFailExpiryTs.hashCode() : 0);
        result = 31 * result + pinUploadFailPinStatusId;
        result = 31 * result + (pinUploadFailCts != null ? pinUploadFailCts.hashCode() : 0);
        return result;
    }
}
