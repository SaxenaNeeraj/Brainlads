package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "pin_upload_info", schema = "", catalog = "brain")
public class PinUploadInfoEntity {
    private int pinUploadInfoId;
    private Integer pinUploadInfoUserId;
    private Integer pinUploadInfoProductId;
    private String pinUploadInfoFileName;
    private Timestamp pinUploadInfoStartTs;
    private Timestamp pinUploadInfoFinishTs;
    private Integer pinUploadInfoSuccessCount;
    private Integer pinUploadInfoFailCount;
    private Integer pinUploadInfoTotalCount;
    private int pinUploadInfoPinStatusId;
    private Timestamp pinUploadInfoCts;

    @Id
    @Column(name = "pin_upload_info_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinUploadInfoId() {
        return pinUploadInfoId;
    }

    public void setPinUploadInfoId(int pinUploadInfoId) {
        this.pinUploadInfoId = pinUploadInfoId;
    }

    @Basic
    @Column(name = "pin_upload_info_user_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinUploadInfoUserId() {
        return pinUploadInfoUserId;
    }

    public void setPinUploadInfoUserId(Integer pinUploadInfoUserId) {
        this.pinUploadInfoUserId = pinUploadInfoUserId;
    }

    @Basic
    @Column(name = "pin_upload_info_product_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinUploadInfoProductId() {
        return pinUploadInfoProductId;
    }

    public void setPinUploadInfoProductId(Integer pinUploadInfoProductId) {
        this.pinUploadInfoProductId = pinUploadInfoProductId;
    }

    @Basic
    @Column(name = "pin_upload_info_file_name", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPinUploadInfoFileName() {
        return pinUploadInfoFileName;
    }

    public void setPinUploadInfoFileName(String pinUploadInfoFileName) {
        this.pinUploadInfoFileName = pinUploadInfoFileName;
    }

    @Basic
    @Column(name = "pin_upload_info_start_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinUploadInfoStartTs() {
        return pinUploadInfoStartTs;
    }

    public void setPinUploadInfoStartTs(Timestamp pinUploadInfoStartTs) {
        this.pinUploadInfoStartTs = pinUploadInfoStartTs;
    }

    @Basic
    @Column(name = "pin_upload_info_finish_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinUploadInfoFinishTs() {
        return pinUploadInfoFinishTs;
    }

    public void setPinUploadInfoFinishTs(Timestamp pinUploadInfoFinishTs) {
        this.pinUploadInfoFinishTs = pinUploadInfoFinishTs;
    }

    @Basic
    @Column(name = "pin_upload_info_success_count", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinUploadInfoSuccessCount() {
        return pinUploadInfoSuccessCount;
    }

    public void setPinUploadInfoSuccessCount(Integer pinUploadInfoSuccessCount) {
        this.pinUploadInfoSuccessCount = pinUploadInfoSuccessCount;
    }

    @Basic
    @Column(name = "pin_upload_info_fail_count", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinUploadInfoFailCount() {
        return pinUploadInfoFailCount;
    }

    public void setPinUploadInfoFailCount(Integer pinUploadInfoFailCount) {
        this.pinUploadInfoFailCount = pinUploadInfoFailCount;
    }

    @Basic
    @Column(name = "pin_upload_info_total_count", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPinUploadInfoTotalCount() {
        return pinUploadInfoTotalCount;
    }

    public void setPinUploadInfoTotalCount(Integer pinUploadInfoTotalCount) {
        this.pinUploadInfoTotalCount = pinUploadInfoTotalCount;
    }

    @Basic
    @Column(name = "pin_upload_info_pin_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinUploadInfoPinStatusId() {
        return pinUploadInfoPinStatusId;
    }

    public void setPinUploadInfoPinStatusId(int pinUploadInfoPinStatusId) {
        this.pinUploadInfoPinStatusId = pinUploadInfoPinStatusId;
    }

    @Basic
    @Column(name = "pin_upload_info_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinUploadInfoCts() {
        return pinUploadInfoCts;
    }

    public void setPinUploadInfoCts(Timestamp pinUploadInfoCts) {
        this.pinUploadInfoCts = pinUploadInfoCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PinUploadInfoEntity that = (PinUploadInfoEntity) o;

        if (pinUploadInfoId != that.pinUploadInfoId) return false;
        if (pinUploadInfoPinStatusId != that.pinUploadInfoPinStatusId) return false;
        if (pinUploadInfoCts != null ? !pinUploadInfoCts.equals(that.pinUploadInfoCts) : that.pinUploadInfoCts != null)
            return false;
        if (pinUploadInfoFailCount != null ? !pinUploadInfoFailCount.equals(that.pinUploadInfoFailCount) : that.pinUploadInfoFailCount != null)
            return false;
        if (pinUploadInfoFileName != null ? !pinUploadInfoFileName.equals(that.pinUploadInfoFileName) : that.pinUploadInfoFileName != null)
            return false;
        if (pinUploadInfoFinishTs != null ? !pinUploadInfoFinishTs.equals(that.pinUploadInfoFinishTs) : that.pinUploadInfoFinishTs != null)
            return false;
        if (pinUploadInfoProductId != null ? !pinUploadInfoProductId.equals(that.pinUploadInfoProductId) : that.pinUploadInfoProductId != null)
            return false;
        if (pinUploadInfoStartTs != null ? !pinUploadInfoStartTs.equals(that.pinUploadInfoStartTs) : that.pinUploadInfoStartTs != null)
            return false;
        if (pinUploadInfoSuccessCount != null ? !pinUploadInfoSuccessCount.equals(that.pinUploadInfoSuccessCount) : that.pinUploadInfoSuccessCount != null)
            return false;
        if (pinUploadInfoTotalCount != null ? !pinUploadInfoTotalCount.equals(that.pinUploadInfoTotalCount) : that.pinUploadInfoTotalCount != null)
            return false;
        if (pinUploadInfoUserId != null ? !pinUploadInfoUserId.equals(that.pinUploadInfoUserId) : that.pinUploadInfoUserId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pinUploadInfoId;
        result = 31 * result + (pinUploadInfoUserId != null ? pinUploadInfoUserId.hashCode() : 0);
        result = 31 * result + (pinUploadInfoProductId != null ? pinUploadInfoProductId.hashCode() : 0);
        result = 31 * result + (pinUploadInfoFileName != null ? pinUploadInfoFileName.hashCode() : 0);
        result = 31 * result + (pinUploadInfoStartTs != null ? pinUploadInfoStartTs.hashCode() : 0);
        result = 31 * result + (pinUploadInfoFinishTs != null ? pinUploadInfoFinishTs.hashCode() : 0);
        result = 31 * result + (pinUploadInfoSuccessCount != null ? pinUploadInfoSuccessCount.hashCode() : 0);
        result = 31 * result + (pinUploadInfoFailCount != null ? pinUploadInfoFailCount.hashCode() : 0);
        result = 31 * result + (pinUploadInfoTotalCount != null ? pinUploadInfoTotalCount.hashCode() : 0);
        result = 31 * result + pinUploadInfoPinStatusId;
        result = 31 * result + (pinUploadInfoCts != null ? pinUploadInfoCts.hashCode() : 0);
        return result;
    }
}
