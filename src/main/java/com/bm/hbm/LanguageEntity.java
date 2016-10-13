package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "language", schema = "", catalog = "brain")
public class LanguageEntity {
    private int languageId;
    private Integer languageCountryId;
    private Integer languageStateId;
    private String languageCode;
    private String languageName;
    private int languageStatusId;
    private Timestamp languageCts;

    @Id
    @Column(name = "language_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    @Basic
    @Column(name = "language_country_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getLanguageCountryId() {
        return languageCountryId;
    }

    public void setLanguageCountryId(Integer languageCountryId) {
        this.languageCountryId = languageCountryId;
    }

    @Basic
    @Column(name = "language_state_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getLanguageStateId() {
        return languageStateId;
    }

    public void setLanguageStateId(Integer languageStateId) {
        this.languageStateId = languageStateId;
    }

    @Basic
    @Column(name = "language_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Basic
    @Column(name = "language_name", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    @Basic
    @Column(name = "language_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getLanguageStatusId() {
        return languageStatusId;
    }

    public void setLanguageStatusId(int languageStatusId) {
        this.languageStatusId = languageStatusId;
    }

    @Basic
    @Column(name = "language_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getLanguageCts() {
        return languageCts;
    }

    public void setLanguageCts(Timestamp languageCts) {
        this.languageCts = languageCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LanguageEntity that = (LanguageEntity) o;

        if (languageId != that.languageId) return false;
        if (languageStatusId != that.languageStatusId) return false;
        if (languageCode != null ? !languageCode.equals(that.languageCode) : that.languageCode != null) return false;
        if (languageCountryId != null ? !languageCountryId.equals(that.languageCountryId) : that.languageCountryId != null)
            return false;
        if (languageCts != null ? !languageCts.equals(that.languageCts) : that.languageCts != null) return false;
        if (languageName != null ? !languageName.equals(that.languageName) : that.languageName != null) return false;
        if (languageStateId != null ? !languageStateId.equals(that.languageStateId) : that.languageStateId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = languageId;
        result = 31 * result + (languageCountryId != null ? languageCountryId.hashCode() : 0);
        result = 31 * result + (languageStateId != null ? languageStateId.hashCode() : 0);
        result = 31 * result + (languageCode != null ? languageCode.hashCode() : 0);
        result = 31 * result + (languageName != null ? languageName.hashCode() : 0);
        result = 31 * result + languageStatusId;
        result = 31 * result + (languageCts != null ? languageCts.hashCode() : 0);
        return result;
    }
}
