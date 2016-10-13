package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "status", schema = "", catalog = "brain")
public class StatusEntity {
    private int statusId;
    private String statusCode;
    private String statusName;
    private Timestamp statusCts;

    @Id
    @Column(name = "status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "status_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Basic
    @Column(name = "status_name", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Basic
    @Column(name = "status_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getStatusCts() {
        return statusCts;
    }

    public void setStatusCts(Timestamp statusCts) {
        this.statusCts = statusCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatusEntity that = (StatusEntity) o;

        if (statusId != that.statusId) return false;
        if (statusCode != null ? !statusCode.equals(that.statusCode) : that.statusCode != null) return false;
        if (statusCts != null ? !statusCts.equals(that.statusCts) : that.statusCts != null) return false;
        if (statusName != null ? !statusName.equals(that.statusName) : that.statusName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = statusId;
        result = 31 * result + (statusCode != null ? statusCode.hashCode() : 0);
        result = 31 * result + (statusName != null ? statusName.hashCode() : 0);
        result = 31 * result + (statusCts != null ? statusCts.hashCode() : 0);
        return result;
    }
}
