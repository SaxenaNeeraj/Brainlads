package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "prefix", schema = "", catalog = "brain")
public class PrefixEntity {
    private int prefixId;
    private String prefixCode;
    private int prefixSiId;
    private int prefixStatusId;
    private Timestamp prefixCts;

    @Id
    @Column(name = "prefix_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPrefixId() {
        return prefixId;
    }

    public void setPrefixId(int prefixId) {
        this.prefixId = prefixId;
    }

    @Basic
    @Column(name = "prefix_code", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public String getPrefixCode() {
        return prefixCode;
    }

    public void setPrefixCode(String prefixCode) {
        this.prefixCode = prefixCode;
    }

    @Basic
    @Column(name = "prefix_si_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPrefixSiId() {
        return prefixSiId;
    }

    public void setPrefixSiId(int prefixSiId) {
        this.prefixSiId = prefixSiId;
    }

    @Basic
    @Column(name = "prefix_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPrefixStatusId() {
        return prefixStatusId;
    }

    public void setPrefixStatusId(int prefixStatusId) {
        this.prefixStatusId = prefixStatusId;
    }

    @Basic
    @Column(name = "prefix_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getPrefixCts() {
        return prefixCts;
    }

    public void setPrefixCts(Timestamp prefixCts) {
        this.prefixCts = prefixCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrefixEntity that = (PrefixEntity) o;

        if (prefixId != that.prefixId) return false;
        if (prefixSiId != that.prefixSiId) return false;
        if (prefixStatusId != that.prefixStatusId) return false;
        if (prefixCode != null ? !prefixCode.equals(that.prefixCode) : that.prefixCode != null) return false;
        if (prefixCts != null ? !prefixCts.equals(that.prefixCts) : that.prefixCts != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prefixId;
        result = 31 * result + (prefixCode != null ? prefixCode.hashCode() : 0);
        result = 31 * result + prefixSiId;
        result = 31 * result + prefixStatusId;
        result = 31 * result + (prefixCts != null ? prefixCts.hashCode() : 0);
        return result;
    }
}
