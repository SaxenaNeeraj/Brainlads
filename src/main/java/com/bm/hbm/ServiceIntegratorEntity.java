package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "service_integrator", schema = "", catalog = "brain")
public class ServiceIntegratorEntity {
    private int serviceIntegratorId;
    private String serviceIntegratorCode;
    private String serviceIntegratorName;
    private int serviceIntegratorCountryId;
    private int serviceIntegratorStatusId;
    private Timestamp serviceIntegratorCts;

    @Id
    @Column(name = "service_integrator_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getServiceIntegratorId() {
        return serviceIntegratorId;
    }

    public void setServiceIntegratorId(int serviceIntegratorId) {
        this.serviceIntegratorId = serviceIntegratorId;
    }

    @Basic
    @Column(name = "service_integrator_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getServiceIntegratorCode() {
        return serviceIntegratorCode;
    }

    public void setServiceIntegratorCode(String serviceIntegratorCode) {
        this.serviceIntegratorCode = serviceIntegratorCode;
    }

    @Basic
    @Column(name = "service_integrator_name", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getServiceIntegratorName() {
        return serviceIntegratorName;
    }

    public void setServiceIntegratorName(String serviceIntegratorName) {
        this.serviceIntegratorName = serviceIntegratorName;
    }

    @Basic
    @Column(name = "service_integrator_country_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getServiceIntegratorCountryId() {
        return serviceIntegratorCountryId;
    }

    public void setServiceIntegratorCountryId(int serviceIntegratorCountryId) {
        this.serviceIntegratorCountryId = serviceIntegratorCountryId;
    }

    @Basic
    @Column(name = "service_integrator_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getServiceIntegratorStatusId() {
        return serviceIntegratorStatusId;
    }

    public void setServiceIntegratorStatusId(int serviceIntegratorStatusId) {
        this.serviceIntegratorStatusId = serviceIntegratorStatusId;
    }

    @Basic
    @Column(name = "service_integrator_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getServiceIntegratorCts() {
        return serviceIntegratorCts;
    }

    public void setServiceIntegratorCts(Timestamp serviceIntegratorCts) {
        this.serviceIntegratorCts = serviceIntegratorCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceIntegratorEntity that = (ServiceIntegratorEntity) o;

        if (serviceIntegratorCountryId != that.serviceIntegratorCountryId) return false;
        if (serviceIntegratorId != that.serviceIntegratorId) return false;
        if (serviceIntegratorStatusId != that.serviceIntegratorStatusId) return false;
        if (serviceIntegratorCode != null ? !serviceIntegratorCode.equals(that.serviceIntegratorCode) : that.serviceIntegratorCode != null)
            return false;
        if (serviceIntegratorCts != null ? !serviceIntegratorCts.equals(that.serviceIntegratorCts) : that.serviceIntegratorCts != null)
            return false;
        if (serviceIntegratorName != null ? !serviceIntegratorName.equals(that.serviceIntegratorName) : that.serviceIntegratorName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = serviceIntegratorId;
        result = 31 * result + (serviceIntegratorCode != null ? serviceIntegratorCode.hashCode() : 0);
        result = 31 * result + (serviceIntegratorName != null ? serviceIntegratorName.hashCode() : 0);
        result = 31 * result + serviceIntegratorCountryId;
        result = 31 * result + serviceIntegratorStatusId;
        result = 31 * result + (serviceIntegratorCts != null ? serviceIntegratorCts.hashCode() : 0);
        return result;
    }
}
