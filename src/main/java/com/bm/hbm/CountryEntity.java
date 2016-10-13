package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "country", schema = "", catalog = "brain")
public class CountryEntity {
    private int countryId;
    private String countryCode;
    private String countryName;
    private int countryStatusId;
    private Timestamp countryCts;

    @Id
    @Column(name = "country_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "country_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "country_name", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Basic
    @Column(name = "country_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getCountryStatusId() {
        return countryStatusId;
    }

    public void setCountryStatusId(int countryStatusId) {
        this.countryStatusId = countryStatusId;
    }

    @Basic
    @Column(name = "country_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getCountryCts() {
        return countryCts;
    }

    public void setCountryCts(Timestamp countryCts) {
        this.countryCts = countryCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryEntity that = (CountryEntity) o;

        if (countryId != that.countryId) return false;
        if (countryStatusId != that.countryStatusId) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (countryCts != null ? !countryCts.equals(that.countryCts) : that.countryCts != null) return false;
        if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + countryStatusId;
        result = 31 * result + (countryCts != null ? countryCts.hashCode() : 0);
        return result;
    }
}
