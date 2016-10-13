package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "pin_status", schema = "", catalog = "brain")
public class PinStatusEntity {
    private int pinStatusId;
    private String pinStatusCode;
    private String pinStatusName;
    private Timestamp pinStatusCts;

    @Id
    @Column(name = "pin_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPinStatusId() {
        return pinStatusId;
    }

    public void setPinStatusId(int pinStatusId) {
        this.pinStatusId = pinStatusId;
    }

    @Basic
    @Column(name = "pin_status_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPinStatusCode() {
        return pinStatusCode;
    }

    public void setPinStatusCode(String pinStatusCode) {
        this.pinStatusCode = pinStatusCode;
    }

    @Basic
    @Column(name = "pin_status_name", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPinStatusName() {
        return pinStatusName;
    }

    public void setPinStatusName(String pinStatusName) {
        this.pinStatusName = pinStatusName;
    }

    @Basic
    @Column(name = "pin_status_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPinStatusCts() {
        return pinStatusCts;
    }

    public void setPinStatusCts(Timestamp pinStatusCts) {
        this.pinStatusCts = pinStatusCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PinStatusEntity that = (PinStatusEntity) o;

        if (pinStatusId != that.pinStatusId) return false;
        if (pinStatusCode != null ? !pinStatusCode.equals(that.pinStatusCode) : that.pinStatusCode != null)
            return false;
        if (pinStatusCts != null ? !pinStatusCts.equals(that.pinStatusCts) : that.pinStatusCts != null) return false;
        if (pinStatusName != null ? !pinStatusName.equals(that.pinStatusName) : that.pinStatusName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pinStatusId;
        result = 31 * result + (pinStatusCode != null ? pinStatusCode.hashCode() : 0);
        result = 31 * result + (pinStatusName != null ? pinStatusName.hashCode() : 0);
        result = 31 * result + (pinStatusCts != null ? pinStatusCts.hashCode() : 0);
        return result;
    }
}
