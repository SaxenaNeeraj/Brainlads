package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "pin_failure_reason", schema = "", catalog = "brain")
public class PinFailureReasonEntity {
    private int pinFailureReasonId;
    private String pinFailureReasonCode;
    private String pinFailureReasonName;
    private Timestamp pinFailureReasonCts;

    @Id
    @Column(name = "pin_failure_reason_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinFailureReasonId() {
        return pinFailureReasonId;
    }

    public void setPinFailureReasonId(int pinFailureReasonId) {
        this.pinFailureReasonId = pinFailureReasonId;
    }

    @Basic
    @Column(name = "pin_failure_reason_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPinFailureReasonCode() {
        return pinFailureReasonCode;
    }

    public void setPinFailureReasonCode(String pinFailureReasonCode) {
        this.pinFailureReasonCode = pinFailureReasonCode;
    }

    @Basic
    @Column(name = "pin_failure_reason_name", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPinFailureReasonName() {
        return pinFailureReasonName;
    }

    public void setPinFailureReasonName(String pinFailureReasonName) {
        this.pinFailureReasonName = pinFailureReasonName;
    }

    @Basic
    @Column(name = "pin_failure_reason_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinFailureReasonCts() {
        return pinFailureReasonCts;
    }

    public void setPinFailureReasonCts(Timestamp pinFailureReasonCts) {
        this.pinFailureReasonCts = pinFailureReasonCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PinFailureReasonEntity that = (PinFailureReasonEntity) o;

        if (pinFailureReasonId != that.pinFailureReasonId) return false;
        if (pinFailureReasonCode != null ? !pinFailureReasonCode.equals(that.pinFailureReasonCode) : that.pinFailureReasonCode != null)
            return false;
        if (pinFailureReasonCts != null ? !pinFailureReasonCts.equals(that.pinFailureReasonCts) : that.pinFailureReasonCts != null)
            return false;
        if (pinFailureReasonName != null ? !pinFailureReasonName.equals(that.pinFailureReasonName) : that.pinFailureReasonName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pinFailureReasonId;
        result = 31 * result + (pinFailureReasonCode != null ? pinFailureReasonCode.hashCode() : 0);
        result = 31 * result + (pinFailureReasonName != null ? pinFailureReasonName.hashCode() : 0);
        result = 31 * result + (pinFailureReasonCts != null ? pinFailureReasonCts.hashCode() : 0);
        return result;
    }
}
