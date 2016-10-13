package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "pin_allocate", schema = "", catalog = "brain")
public class PinAllocateEntity {
    private int pinAllocateId;
    private Integer pinAllocateBatchId;
    private Integer pinAllocateProductId;
    private String pinAllocateVendorCode;
    private String pinAllocateSerialNo;
    private String pinAllocatePin;
    private Integer pinAllocateChannelId;
    private Integer pinAllocateAssignTrId;
    private Integer pinAllocateOrderId;
    private Timestamp pinAllocateActiveTs;
    private Timestamp pinAllocateExpiryTs;
    private Timestamp pinAllocateTerTs;
    private Timestamp pinAllocateDwnTs;
    private Timestamp pinAllocateCurTs;
    private int pinAllocatePinStatusId;
    private Timestamp pinAllocateCts;

    @Id
    @Column(name = "pin_allocate_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinAllocateId() {
        return pinAllocateId;
    }

    public void setPinAllocateId(int pinAllocateId) {
        this.pinAllocateId = pinAllocateId;
    }

    @Basic
    @Column(name = "pin_allocate_batch_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinAllocateBatchId() {
        return pinAllocateBatchId;
    }

    public void setPinAllocateBatchId(Integer pinAllocateBatchId) {
        this.pinAllocateBatchId = pinAllocateBatchId;
    }

    @Basic
    @Column(name = "pin_allocate_product_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinAllocateProductId() {
        return pinAllocateProductId;
    }

    public void setPinAllocateProductId(Integer pinAllocateProductId) {
        this.pinAllocateProductId = pinAllocateProductId;
    }

    @Basic
    @Column(name = "pin_allocate_vendor_code", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPinAllocateVendorCode() {
        return pinAllocateVendorCode;
    }

    public void setPinAllocateVendorCode(String pinAllocateVendorCode) {
        this.pinAllocateVendorCode = pinAllocateVendorCode;
    }

    @Basic
    @Column(name = "pin_allocate_serial_no", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPinAllocateSerialNo() {
        return pinAllocateSerialNo;
    }

    public void setPinAllocateSerialNo(String pinAllocateSerialNo) {
        this.pinAllocateSerialNo = pinAllocateSerialNo;
    }

    @Basic
    @Column(name = "pin_allocate_pin", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    public String getPinAllocatePin() {
        return pinAllocatePin;
    }

    public void setPinAllocatePin(String pinAllocatePin) {
        this.pinAllocatePin = pinAllocatePin;
    }

    @Basic
    @Column(name = "pin_allocate_channel_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinAllocateChannelId() {
        return pinAllocateChannelId;
    }

    public void setPinAllocateChannelId(Integer pinAllocateChannelId) {
        this.pinAllocateChannelId = pinAllocateChannelId;
    }

    @Basic
    @Column(name = "pin_allocate_assign_tr_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinAllocateAssignTrId() {
        return pinAllocateAssignTrId;
    }

    public void setPinAllocateAssignTrId(Integer pinAllocateAssignTrId) {
        this.pinAllocateAssignTrId = pinAllocateAssignTrId;
    }

    @Basic
    @Column(name = "pin_allocate_order_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinAllocateOrderId() {
        return pinAllocateOrderId;
    }

    public void setPinAllocateOrderId(Integer pinAllocateOrderId) {
        this.pinAllocateOrderId = pinAllocateOrderId;
    }

    @Basic
    @Column(name = "pin_allocate_active_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinAllocateActiveTs() {
        return pinAllocateActiveTs;
    }

    public void setPinAllocateActiveTs(Timestamp pinAllocateActiveTs) {
        this.pinAllocateActiveTs = pinAllocateActiveTs;
    }

    @Basic
    @Column(name = "pin_allocate_expiry_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinAllocateExpiryTs() {
        return pinAllocateExpiryTs;
    }

    public void setPinAllocateExpiryTs(Timestamp pinAllocateExpiryTs) {
        this.pinAllocateExpiryTs = pinAllocateExpiryTs;
    }

    @Basic
    @Column(name = "pin_allocate_ter_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinAllocateTerTs() {
        return pinAllocateTerTs;
    }

    public void setPinAllocateTerTs(Timestamp pinAllocateTerTs) {
        this.pinAllocateTerTs = pinAllocateTerTs;
    }

    @Basic
    @Column(name = "pin_allocate_dwn_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinAllocateDwnTs() {
        return pinAllocateDwnTs;
    }

    public void setPinAllocateDwnTs(Timestamp pinAllocateDwnTs) {
        this.pinAllocateDwnTs = pinAllocateDwnTs;
    }

    @Basic
    @Column(name = "pin_allocate_cur_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinAllocateCurTs() {
        return pinAllocateCurTs;
    }

    public void setPinAllocateCurTs(Timestamp pinAllocateCurTs) {
        this.pinAllocateCurTs = pinAllocateCurTs;
    }

    @Basic
    @Column(name = "pin_allocate_pin_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinAllocatePinStatusId() {
        return pinAllocatePinStatusId;
    }

    public void setPinAllocatePinStatusId(int pinAllocatePinStatusId) {
        this.pinAllocatePinStatusId = pinAllocatePinStatusId;
    }

    @Basic
    @Column(name = "pin_allocate_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinAllocateCts() {
        return pinAllocateCts;
    }

    public void setPinAllocateCts(Timestamp pinAllocateCts) {
        this.pinAllocateCts = pinAllocateCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PinAllocateEntity that = (PinAllocateEntity) o;

        if (pinAllocateId != that.pinAllocateId) return false;
        if (pinAllocatePinStatusId != that.pinAllocatePinStatusId) return false;
        if (pinAllocateActiveTs != null ? !pinAllocateActiveTs.equals(that.pinAllocateActiveTs) : that.pinAllocateActiveTs != null)
            return false;
        if (pinAllocateAssignTrId != null ? !pinAllocateAssignTrId.equals(that.pinAllocateAssignTrId) : that.pinAllocateAssignTrId != null)
            return false;
        if (pinAllocateBatchId != null ? !pinAllocateBatchId.equals(that.pinAllocateBatchId) : that.pinAllocateBatchId != null)
            return false;
        if (pinAllocateChannelId != null ? !pinAllocateChannelId.equals(that.pinAllocateChannelId) : that.pinAllocateChannelId != null)
            return false;
        if (pinAllocateCts != null ? !pinAllocateCts.equals(that.pinAllocateCts) : that.pinAllocateCts != null)
            return false;
        if (pinAllocateCurTs != null ? !pinAllocateCurTs.equals(that.pinAllocateCurTs) : that.pinAllocateCurTs != null)
            return false;
        if (pinAllocateDwnTs != null ? !pinAllocateDwnTs.equals(that.pinAllocateDwnTs) : that.pinAllocateDwnTs != null)
            return false;
        if (pinAllocateExpiryTs != null ? !pinAllocateExpiryTs.equals(that.pinAllocateExpiryTs) : that.pinAllocateExpiryTs != null)
            return false;
        if (pinAllocateOrderId != null ? !pinAllocateOrderId.equals(that.pinAllocateOrderId) : that.pinAllocateOrderId != null)
            return false;
        if (pinAllocatePin != null ? !pinAllocatePin.equals(that.pinAllocatePin) : that.pinAllocatePin != null)
            return false;
        if (pinAllocateProductId != null ? !pinAllocateProductId.equals(that.pinAllocateProductId) : that.pinAllocateProductId != null)
            return false;
        if (pinAllocateSerialNo != null ? !pinAllocateSerialNo.equals(that.pinAllocateSerialNo) : that.pinAllocateSerialNo != null)
            return false;
        if (pinAllocateTerTs != null ? !pinAllocateTerTs.equals(that.pinAllocateTerTs) : that.pinAllocateTerTs != null)
            return false;
        if (pinAllocateVendorCode != null ? !pinAllocateVendorCode.equals(that.pinAllocateVendorCode) : that.pinAllocateVendorCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pinAllocateId;
        result = 31 * result + (pinAllocateBatchId != null ? pinAllocateBatchId.hashCode() : 0);
        result = 31 * result + (pinAllocateProductId != null ? pinAllocateProductId.hashCode() : 0);
        result = 31 * result + (pinAllocateVendorCode != null ? pinAllocateVendorCode.hashCode() : 0);
        result = 31 * result + (pinAllocateSerialNo != null ? pinAllocateSerialNo.hashCode() : 0);
        result = 31 * result + (pinAllocatePin != null ? pinAllocatePin.hashCode() : 0);
        result = 31 * result + (pinAllocateChannelId != null ? pinAllocateChannelId.hashCode() : 0);
        result = 31 * result + (pinAllocateAssignTrId != null ? pinAllocateAssignTrId.hashCode() : 0);
        result = 31 * result + (pinAllocateOrderId != null ? pinAllocateOrderId.hashCode() : 0);
        result = 31 * result + (pinAllocateActiveTs != null ? pinAllocateActiveTs.hashCode() : 0);
        result = 31 * result + (pinAllocateExpiryTs != null ? pinAllocateExpiryTs.hashCode() : 0);
        result = 31 * result + (pinAllocateTerTs != null ? pinAllocateTerTs.hashCode() : 0);
        result = 31 * result + (pinAllocateDwnTs != null ? pinAllocateDwnTs.hashCode() : 0);
        result = 31 * result + (pinAllocateCurTs != null ? pinAllocateCurTs.hashCode() : 0);
        result = 31 * result + pinAllocatePinStatusId;
        result = 31 * result + (pinAllocateCts != null ? pinAllocateCts.hashCode() : 0);
        return result;
    }
}
