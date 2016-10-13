package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "city", schema = "", catalog = "brain")
public class CityEntity {
    private int cityId;
    private int cityStateId;
    private String cityCode;
    private String cityName;
    private int cityStatusId;
    private Timestamp cityCts;

    @Id
    @Column(name = "city_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "city_state_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getCityStateId() {
        return cityStateId;
    }

    public void setCityStateId(int cityStateId) {
        this.cityStateId = cityStateId;
    }

    @Basic
    @Column(name = "city_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "city_name", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "city_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getCityStatusId() {
        return cityStatusId;
    }

    public void setCityStatusId(int cityStatusId) {
        this.cityStatusId = cityStatusId;
    }

    @Basic
    @Column(name = "city_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getCityCts() {
        return cityCts;
    }

    public void setCityCts(Timestamp cityCts) {
        this.cityCts = cityCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (cityId != that.cityId) return false;
        if (cityStateId != that.cityStateId) return false;
        if (cityStatusId != that.cityStatusId) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;
        if (cityCts != null ? !cityCts.equals(that.cityCts) : that.cityCts != null) return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityId;
        result = 31 * result + cityStateId;
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + cityStatusId;
        result = 31 * result + (cityCts != null ? cityCts.hashCode() : 0);
        return result;
    }
}
