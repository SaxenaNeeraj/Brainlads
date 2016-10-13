package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "state", schema = "", catalog = "brain")
public class StateEntity {
    private int stateId;
    private int stateCountryId;
    private String stateCode;
    private String stateName;
    private int stateStatusId;
    private Timestamp stateCts;

    @Id
    @Column(name = "state_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    @Basic
    @Column(name = "state_country_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getStateCountryId() {
        return stateCountryId;
    }

    public void setStateCountryId(int stateCountryId) {
        this.stateCountryId = stateCountryId;
    }

    @Basic
    @Column(name = "state_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Basic
    @Column(name = "state_name", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Basic
    @Column(name = "state_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getStateStatusId() {
        return stateStatusId;
    }

    public void setStateStatusId(int stateStatusId) {
        this.stateStatusId = stateStatusId;
    }

    @Basic
    @Column(name = "state_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getStateCts() {
        return stateCts;
    }

    public void setStateCts(Timestamp stateCts) {
        this.stateCts = stateCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StateEntity that = (StateEntity) o;

        if (stateCountryId != that.stateCountryId) return false;
        if (stateId != that.stateId) return false;
        if (stateStatusId != that.stateStatusId) return false;
        if (stateCode != null ? !stateCode.equals(that.stateCode) : that.stateCode != null) return false;
        if (stateCts != null ? !stateCts.equals(that.stateCts) : that.stateCts != null) return false;
        if (stateName != null ? !stateName.equals(that.stateName) : that.stateName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stateId;
        result = 31 * result + stateCountryId;
        result = 31 * result + (stateCode != null ? stateCode.hashCode() : 0);
        result = 31 * result + (stateName != null ? stateName.hashCode() : 0);
        result = 31 * result + stateStatusId;
        result = 31 * result + (stateCts != null ? stateCts.hashCode() : 0);
        return result;
    }
}
