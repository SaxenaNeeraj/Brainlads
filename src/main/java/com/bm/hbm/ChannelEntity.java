package com.bm.hbm;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@javax.persistence.Table(name = "channel", schema = "", catalog = "brain")
public class ChannelEntity {
    private int channelId;

    @Id
    @javax.persistence.Column(name = "channel_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    private String channelCode;

    @Basic
    @javax.persistence.Column(name = "channel_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    private int channelTypeId;

    @Basic
    @javax.persistence.Column(name = "channel_type_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getChannelTypeId() {
        return channelTypeId;
    }

    public void setChannelTypeId(int channelTypeId) {
        this.channelTypeId = channelTypeId;
    }

    private int channelParentId;

    @Basic
    @javax.persistence.Column(name = "channel_parent_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getChannelParentId() {
        return channelParentId;
    }

    public void setChannelParentId(int channelParentId) {
        this.channelParentId = channelParentId;
    }

    private int channelTopId;

    @Basic
    @javax.persistence.Column(name = "channel_top_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getChannelTopId() {
        return channelTopId;
    }

    public void setChannelTopId(int channelTopId) {
        this.channelTopId = channelTopId;
    }

    private String channelPSalution;

    @Basic
    @javax.persistence.Column(name = "channel_p_salution", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public String getChannelPSalution() {
        return channelPSalution;
    }

    public void setChannelPSalution(String channelPSalution) {
        this.channelPSalution = channelPSalution;
    }

    private String channelPFirstName;

    @Basic
    @javax.persistence.Column(name = "channel_p_first_name", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelPFirstName() {
        return channelPFirstName;
    }

    public void setChannelPFirstName(String channelPFirstName) {
        this.channelPFirstName = channelPFirstName;
    }

    private String channelPMiddleName;

    @Basic
    @javax.persistence.Column(name = "channel_p_middle_name", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelPMiddleName() {
        return channelPMiddleName;
    }

    public void setChannelPMiddleName(String channelPMiddleName) {
        this.channelPMiddleName = channelPMiddleName;
    }

    private String channelPLastName;

    @Basic
    @javax.persistence.Column(name = "channel_p_last_name", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelPLastName() {
        return channelPLastName;
    }

    public void setChannelPLastName(String channelPLastName) {
        this.channelPLastName = channelPLastName;
    }

    private String channelPMobileNo;

    @Basic
    @javax.persistence.Column(name = "channel_p_mobile_no", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getChannelPMobileNo() {
        return channelPMobileNo;
    }

    public void setChannelPMobileNo(String channelPMobileNo) {
        this.channelPMobileNo = channelPMobileNo;
    }

    private String channelPdGender;

    @Basic
    @javax.persistence.Column(name = "channel_pd_gender", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getChannelPdGender() {
        return channelPdGender;
    }

    public void setChannelPdGender(String channelPdGender) {
        this.channelPdGender = channelPdGender;
    }

    private String channelPdDob;

    @Basic
    @javax.persistence.Column(name = "channel_pd_dob", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getChannelPdDob() {
        return channelPdDob;
    }

    public void setChannelPdDob(String channelPdDob) {
        this.channelPdDob = channelPdDob;
    }

    private String channelPdMartialStatus;

    @Basic
    @javax.persistence.Column(name = "channel_pd_martial_status", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getChannelPdMartialStatus() {
        return channelPdMartialStatus;
    }

    public void setChannelPdMartialStatus(String channelPdMartialStatus) {
        this.channelPdMartialStatus = channelPdMartialStatus;
    }

    private String channelPdEmail;

    @Basic
    @javax.persistence.Column(name = "channel_pd_email", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelPdEmail() {
        return channelPdEmail;
    }

    public void setChannelPdEmail(String channelPdEmail) {
        this.channelPdEmail = channelPdEmail;
    }

    private String channelPdPrimaryLanguageId;

    @Basic
    @javax.persistence.Column(name = "channel_pd_primary_language_id", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelPdPrimaryLanguageId() {
        return channelPdPrimaryLanguageId;
    }

    public void setChannelPdPrimaryLanguageId(String channelPdPrimaryLanguageId) {
        this.channelPdPrimaryLanguageId = channelPdPrimaryLanguageId;
    }

    private String channelPdSecondryLanguageId;

    @Basic
    @javax.persistence.Column(name = "channel_pd_secondry_language_id", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelPdSecondryLanguageId() {
        return channelPdSecondryLanguageId;
    }

    public void setChannelPdSecondryLanguageId(String channelPdSecondryLanguageId) {
        this.channelPdSecondryLanguageId = channelPdSecondryLanguageId;
    }

    private String channelPdLandlineNumber;

    @Basic
    @javax.persistence.Column(name = "channel_pd_landline_number", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getChannelPdLandlineNumber() {
        return channelPdLandlineNumber;
    }

    public void setChannelPdLandlineNumber(String channelPdLandlineNumber) {
        this.channelPdLandlineNumber = channelPdLandlineNumber;
    }

    private String channelPdFaxNumber;

    @Basic
    @javax.persistence.Column(name = "channel_pd_fax_number", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getChannelPdFaxNumber() {
        return channelPdFaxNumber;
    }

    public void setChannelPdFaxNumber(String channelPdFaxNumber) {
        this.channelPdFaxNumber = channelPdFaxNumber;
    }

    private String channelPdFathersName;

    @Basic
    @javax.persistence.Column(name = "channel_pd_fathers_name", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelPdFathersName() {
        return channelPdFathersName;
    }

    public void setChannelPdFathersName(String channelPdFathersName) {
        this.channelPdFathersName = channelPdFathersName;
    }

    private String channelPdMothersName;

    @Basic
    @javax.persistence.Column(name = "channel_pd_mothers_name", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelPdMothersName() {
        return channelPdMothersName;
    }

    public void setChannelPdMothersName(String channelPdMothersName) {
        this.channelPdMothersName = channelPdMothersName;
    }

    private String channelPdSpouseName;

    @Basic
    @javax.persistence.Column(name = "channel_pd_spouse_name", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelPdSpouseName() {
        return channelPdSpouseName;
    }

    public void setChannelPdSpouseName(String channelPdSpouseName) {
        this.channelPdSpouseName = channelPdSpouseName;
    }

    private String channelPdNomineeName;

    @Basic
    @javax.persistence.Column(name = "channel_pd_nominee_name", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelPdNomineeName() {
        return channelPdNomineeName;
    }

    public void setChannelPdNomineeName(String channelPdNomineeName) {
        this.channelPdNomineeName = channelPdNomineeName;
    }

    private String channelPdNomineeIdType;

    @Basic
    @javax.persistence.Column(name = "channel_pd_nominee_id_type", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getChannelPdNomineeIdType() {
        return channelPdNomineeIdType;
    }

    public void setChannelPdNomineeIdType(String channelPdNomineeIdType) {
        this.channelPdNomineeIdType = channelPdNomineeIdType;
    }

    private String channelPdNomineeIdNumber;

    @Basic
    @javax.persistence.Column(name = "channel_pd_nominee_id_number", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getChannelPdNomineeIdNumber() {
        return channelPdNomineeIdNumber;
    }

    public void setChannelPdNomineeIdNumber(String channelPdNomineeIdNumber) {
        this.channelPdNomineeIdNumber = channelPdNomineeIdNumber;
    }

    private String channelAd1Unit;

    @Basic
    @javax.persistence.Column(name = "channel_ad1_unit", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelAd1Unit() {
        return channelAd1Unit;
    }

    public void setChannelAd1Unit(String channelAd1Unit) {
        this.channelAd1Unit = channelAd1Unit;
    }

    private String channelAd1Street;

    @Basic
    @javax.persistence.Column(name = "channel_ad1_street", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelAd1Street() {
        return channelAd1Street;
    }

    public void setChannelAd1Street(String channelAd1Street) {
        this.channelAd1Street = channelAd1Street;
    }

    private Integer channelAd1CountryId;

    @Basic
    @javax.persistence.Column(name = "channel_ad1_country_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getChannelAd1CountryId() {
        return channelAd1CountryId;
    }

    public void setChannelAd1CountryId(Integer channelAd1CountryId) {
        this.channelAd1CountryId = channelAd1CountryId;
    }

    private Integer channelAd1StateId;

    @Basic
    @javax.persistence.Column(name = "channel_ad1_state_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getChannelAd1StateId() {
        return channelAd1StateId;
    }

    public void setChannelAd1StateId(Integer channelAd1StateId) {
        this.channelAd1StateId = channelAd1StateId;
    }

    private Integer channelAd1CityId;

    @Basic
    @javax.persistence.Column(name = "channel_ad1_city_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getChannelAd1CityId() {
        return channelAd1CityId;
    }

    public void setChannelAd1CityId(Integer channelAd1CityId) {
        this.channelAd1CityId = channelAd1CityId;
    }

    private String channelAd1ZipCode;

    @Basic
    @javax.persistence.Column(name = "channel_ad1_zip_code", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getChannelAd1ZipCode() {
        return channelAd1ZipCode;
    }

    public void setChannelAd1ZipCode(String channelAd1ZipCode) {
        this.channelAd1ZipCode = channelAd1ZipCode;
    }

    private String channelAd2Unit;

    @Basic
    @javax.persistence.Column(name = "channel_ad2_unit", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelAd2Unit() {
        return channelAd2Unit;
    }

    public void setChannelAd2Unit(String channelAd2Unit) {
        this.channelAd2Unit = channelAd2Unit;
    }

    private String channelAd2Street;

    @Basic
    @javax.persistence.Column(name = "channel_ad2_street", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getChannelAd2Street() {
        return channelAd2Street;
    }

    public void setChannelAd2Street(String channelAd2Street) {
        this.channelAd2Street = channelAd2Street;
    }

    private Integer channelAd2CountryId;

    @Basic
    @javax.persistence.Column(name = "channel_ad2_country_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getChannelAd2CountryId() {
        return channelAd2CountryId;
    }

    public void setChannelAd2CountryId(Integer channelAd2CountryId) {
        this.channelAd2CountryId = channelAd2CountryId;
    }

    private Integer channelAd2StateId;

    @Basic
    @javax.persistence.Column(name = "channel_ad2_state_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getChannelAd2StateId() {
        return channelAd2StateId;
    }

    public void setChannelAd2StateId(Integer channelAd2StateId) {
        this.channelAd2StateId = channelAd2StateId;
    }

    private Integer channelAd2CityId;

    @Basic
    @javax.persistence.Column(name = "channel_ad2_city_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getChannelAd2CityId() {
        return channelAd2CityId;
    }

    public void setChannelAd2CityId(Integer channelAd2CityId) {
        this.channelAd2CityId = channelAd2CityId;
    }

    private String channelAd2ZipCode;

    @Basic
    @javax.persistence.Column(name = "channel_ad2_zip_code", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getChannelAd2ZipCode() {
        return channelAd2ZipCode;
    }

    public void setChannelAd2ZipCode(String channelAd2ZipCode) {
        this.channelAd2ZipCode = channelAd2ZipCode;
    }

    private Integer channelSPlanId;

    @Basic
    @javax.persistence.Column(name = "channel_s_plan_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getChannelSPlanId() {
        return channelSPlanId;
    }

    public void setChannelSPlanId(Integer channelSPlanId) {
        this.channelSPlanId = channelSPlanId;
    }

    private Integer channelSWalletId;

    @Basic
    @javax.persistence.Column(name = "channel_s_wallet_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getChannelSWalletId() {
        return channelSWalletId;
    }

    public void setChannelSWalletId(Integer channelSWalletId) {
        this.channelSWalletId = channelSWalletId;
    }

    private String channelSAid;

    @Basic
    @javax.persistence.Column(name = "channel_s_aid", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public String getChannelSAid() {
        return channelSAid;
    }

    public void setChannelSAid(String channelSAid) {
        this.channelSAid = channelSAid;
    }

    private String channelSSal;

    @Basic
    @javax.persistence.Column(name = "channel_s_sal", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public String getChannelSSal() {
        return channelSSal;
    }

    public void setChannelSSal(String channelSSal) {
        this.channelSSal = channelSSal;
    }

    private String channelSSme;

    @Basic
    @javax.persistence.Column(name = "channel_s_sme", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public String getChannelSSme() {
        return channelSSme;
    }

    public void setChannelSSme(String channelSSme) {
        this.channelSSme = channelSSme;
    }

    private Timestamp channelCreationTs;

    @Basic
    @javax.persistence.Column(name = "channel_creation_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getChannelCreationTs() {
        return channelCreationTs;
    }

    public void setChannelCreationTs(Timestamp channelCreationTs) {
        this.channelCreationTs = channelCreationTs;
    }

    private Timestamp channelBlockTs;

    @Basic
    @javax.persistence.Column(name = "channel_block_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getChannelBlockTs() {
        return channelBlockTs;
    }

    public void setChannelBlockTs(Timestamp channelBlockTs) {
        this.channelBlockTs = channelBlockTs;
    }

    private Timestamp channelActivationTs;

    @Basic
    @javax.persistence.Column(name = "channel_activation_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getChannelActivationTs() {
        return channelActivationTs;
    }

    public void setChannelActivationTs(Timestamp channelActivationTs) {
        this.channelActivationTs = channelActivationTs;
    }

    private Timestamp channelCancelTs;

    @Basic
    @javax.persistence.Column(name = "channel_cancel_ts", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getChannelCancelTs() {
        return channelCancelTs;
    }

    public void setChannelCancelTs(Timestamp channelCancelTs) {
        this.channelCancelTs = channelCancelTs;
    }

    private int channelStatusId;

    @Basic
    @javax.persistence.Column(name = "channel_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getChannelStatusId() {
        return channelStatusId;
    }

    public void setChannelStatusId(int channelStatusId) {
        this.channelStatusId = channelStatusId;
    }

    private Timestamp channelCts;

    @Basic
    @javax.persistence.Column(name = "channel_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getChannelCts() {
        return channelCts;
    }

    public void setChannelCts(Timestamp channelCts) {
        this.channelCts = channelCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChannelEntity that = (ChannelEntity) o;

        if (channelId != that.channelId) return false;
        if (channelParentId != that.channelParentId) return false;
        if (channelStatusId != that.channelStatusId) return false;
        if (channelTopId != that.channelTopId) return false;
        if (channelTypeId != that.channelTypeId) return false;
        if (channelActivationTs != null ? !channelActivationTs.equals(that.channelActivationTs) : that.channelActivationTs != null)
            return false;
        if (channelAd1CityId != null ? !channelAd1CityId.equals(that.channelAd1CityId) : that.channelAd1CityId != null)
            return false;
        if (channelAd1CountryId != null ? !channelAd1CountryId.equals(that.channelAd1CountryId) : that.channelAd1CountryId != null)
            return false;
        if (channelAd1StateId != null ? !channelAd1StateId.equals(that.channelAd1StateId) : that.channelAd1StateId != null)
            return false;
        if (channelAd1Street != null ? !channelAd1Street.equals(that.channelAd1Street) : that.channelAd1Street != null)
            return false;
        if (channelAd1Unit != null ? !channelAd1Unit.equals(that.channelAd1Unit) : that.channelAd1Unit != null)
            return false;
        if (channelAd1ZipCode != null ? !channelAd1ZipCode.equals(that.channelAd1ZipCode) : that.channelAd1ZipCode != null)
            return false;
        if (channelAd2CityId != null ? !channelAd2CityId.equals(that.channelAd2CityId) : that.channelAd2CityId != null)
            return false;
        if (channelAd2CountryId != null ? !channelAd2CountryId.equals(that.channelAd2CountryId) : that.channelAd2CountryId != null)
            return false;
        if (channelAd2StateId != null ? !channelAd2StateId.equals(that.channelAd2StateId) : that.channelAd2StateId != null)
            return false;
        if (channelAd2Street != null ? !channelAd2Street.equals(that.channelAd2Street) : that.channelAd2Street != null)
            return false;
        if (channelAd2Unit != null ? !channelAd2Unit.equals(that.channelAd2Unit) : that.channelAd2Unit != null)
            return false;
        if (channelAd2ZipCode != null ? !channelAd2ZipCode.equals(that.channelAd2ZipCode) : that.channelAd2ZipCode != null)
            return false;
        if (channelBlockTs != null ? !channelBlockTs.equals(that.channelBlockTs) : that.channelBlockTs != null)
            return false;
        if (channelCancelTs != null ? !channelCancelTs.equals(that.channelCancelTs) : that.channelCancelTs != null)
            return false;
        if (channelCode != null ? !channelCode.equals(that.channelCode) : that.channelCode != null) return false;
        if (channelCreationTs != null ? !channelCreationTs.equals(that.channelCreationTs) : that.channelCreationTs != null)
            return false;
        if (channelCts != null ? !channelCts.equals(that.channelCts) : that.channelCts != null) return false;
        if (channelPFirstName != null ? !channelPFirstName.equals(that.channelPFirstName) : that.channelPFirstName != null)
            return false;
        if (channelPLastName != null ? !channelPLastName.equals(that.channelPLastName) : that.channelPLastName != null)
            return false;
        if (channelPMiddleName != null ? !channelPMiddleName.equals(that.channelPMiddleName) : that.channelPMiddleName != null)
            return false;
        if (channelPMobileNo != null ? !channelPMobileNo.equals(that.channelPMobileNo) : that.channelPMobileNo != null)
            return false;
        if (channelPSalution != null ? !channelPSalution.equals(that.channelPSalution) : that.channelPSalution != null)
            return false;
        if (channelPdDob != null ? !channelPdDob.equals(that.channelPdDob) : that.channelPdDob != null) return false;
        if (channelPdEmail != null ? !channelPdEmail.equals(that.channelPdEmail) : that.channelPdEmail != null)
            return false;
        if (channelPdFathersName != null ? !channelPdFathersName.equals(that.channelPdFathersName) : that.channelPdFathersName != null)
            return false;
        if (channelPdFaxNumber != null ? !channelPdFaxNumber.equals(that.channelPdFaxNumber) : that.channelPdFaxNumber != null)
            return false;
        if (channelPdGender != null ? !channelPdGender.equals(that.channelPdGender) : that.channelPdGender != null)
            return false;
        if (channelPdLandlineNumber != null ? !channelPdLandlineNumber.equals(that.channelPdLandlineNumber) : that.channelPdLandlineNumber != null)
            return false;
        if (channelPdMartialStatus != null ? !channelPdMartialStatus.equals(that.channelPdMartialStatus) : that.channelPdMartialStatus != null)
            return false;
        if (channelPdMothersName != null ? !channelPdMothersName.equals(that.channelPdMothersName) : that.channelPdMothersName != null)
            return false;
        if (channelPdNomineeIdNumber != null ? !channelPdNomineeIdNumber.equals(that.channelPdNomineeIdNumber) : that.channelPdNomineeIdNumber != null)
            return false;
        if (channelPdNomineeIdType != null ? !channelPdNomineeIdType.equals(that.channelPdNomineeIdType) : that.channelPdNomineeIdType != null)
            return false;
        if (channelPdNomineeName != null ? !channelPdNomineeName.equals(that.channelPdNomineeName) : that.channelPdNomineeName != null)
            return false;
        if (channelPdPrimaryLanguageId != null ? !channelPdPrimaryLanguageId.equals(that.channelPdPrimaryLanguageId) : that.channelPdPrimaryLanguageId != null)
            return false;
        if (channelPdSecondryLanguageId != null ? !channelPdSecondryLanguageId.equals(that.channelPdSecondryLanguageId) : that.channelPdSecondryLanguageId != null)
            return false;
        if (channelPdSpouseName != null ? !channelPdSpouseName.equals(that.channelPdSpouseName) : that.channelPdSpouseName != null)
            return false;
        if (channelSAid != null ? !channelSAid.equals(that.channelSAid) : that.channelSAid != null) return false;
        if (channelSPlanId != null ? !channelSPlanId.equals(that.channelSPlanId) : that.channelSPlanId != null)
            return false;
        if (channelSSal != null ? !channelSSal.equals(that.channelSSal) : that.channelSSal != null) return false;
        if (channelSSme != null ? !channelSSme.equals(that.channelSSme) : that.channelSSme != null) return false;
        if (channelSWalletId != null ? !channelSWalletId.equals(that.channelSWalletId) : that.channelSWalletId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = channelId;
        result = 31 * result + (channelCode != null ? channelCode.hashCode() : 0);
        result = 31 * result + channelTypeId;
        result = 31 * result + channelParentId;
        result = 31 * result + channelTopId;
        result = 31 * result + (channelPSalution != null ? channelPSalution.hashCode() : 0);
        result = 31 * result + (channelPFirstName != null ? channelPFirstName.hashCode() : 0);
        result = 31 * result + (channelPMiddleName != null ? channelPMiddleName.hashCode() : 0);
        result = 31 * result + (channelPLastName != null ? channelPLastName.hashCode() : 0);
        result = 31 * result + (channelPMobileNo != null ? channelPMobileNo.hashCode() : 0);
        result = 31 * result + (channelPdGender != null ? channelPdGender.hashCode() : 0);
        result = 31 * result + (channelPdDob != null ? channelPdDob.hashCode() : 0);
        result = 31 * result + (channelPdMartialStatus != null ? channelPdMartialStatus.hashCode() : 0);
        result = 31 * result + (channelPdEmail != null ? channelPdEmail.hashCode() : 0);
        result = 31 * result + (channelPdPrimaryLanguageId != null ? channelPdPrimaryLanguageId.hashCode() : 0);
        result = 31 * result + (channelPdSecondryLanguageId != null ? channelPdSecondryLanguageId.hashCode() : 0);
        result = 31 * result + (channelPdLandlineNumber != null ? channelPdLandlineNumber.hashCode() : 0);
        result = 31 * result + (channelPdFaxNumber != null ? channelPdFaxNumber.hashCode() : 0);
        result = 31 * result + (channelPdFathersName != null ? channelPdFathersName.hashCode() : 0);
        result = 31 * result + (channelPdMothersName != null ? channelPdMothersName.hashCode() : 0);
        result = 31 * result + (channelPdSpouseName != null ? channelPdSpouseName.hashCode() : 0);
        result = 31 * result + (channelPdNomineeName != null ? channelPdNomineeName.hashCode() : 0);
        result = 31 * result + (channelPdNomineeIdType != null ? channelPdNomineeIdType.hashCode() : 0);
        result = 31 * result + (channelPdNomineeIdNumber != null ? channelPdNomineeIdNumber.hashCode() : 0);
        result = 31 * result + (channelAd1Unit != null ? channelAd1Unit.hashCode() : 0);
        result = 31 * result + (channelAd1Street != null ? channelAd1Street.hashCode() : 0);
        result = 31 * result + (channelAd1CountryId != null ? channelAd1CountryId.hashCode() : 0);
        result = 31 * result + (channelAd1StateId != null ? channelAd1StateId.hashCode() : 0);
        result = 31 * result + (channelAd1CityId != null ? channelAd1CityId.hashCode() : 0);
        result = 31 * result + (channelAd1ZipCode != null ? channelAd1ZipCode.hashCode() : 0);
        result = 31 * result + (channelAd2Unit != null ? channelAd2Unit.hashCode() : 0);
        result = 31 * result + (channelAd2Street != null ? channelAd2Street.hashCode() : 0);
        result = 31 * result + (channelAd2CountryId != null ? channelAd2CountryId.hashCode() : 0);
        result = 31 * result + (channelAd2StateId != null ? channelAd2StateId.hashCode() : 0);
        result = 31 * result + (channelAd2CityId != null ? channelAd2CityId.hashCode() : 0);
        result = 31 * result + (channelAd2ZipCode != null ? channelAd2ZipCode.hashCode() : 0);
        result = 31 * result + (channelSPlanId != null ? channelSPlanId.hashCode() : 0);
        result = 31 * result + (channelSWalletId != null ? channelSWalletId.hashCode() : 0);
        result = 31 * result + (channelSAid != null ? channelSAid.hashCode() : 0);
        result = 31 * result + (channelSSal != null ? channelSSal.hashCode() : 0);
        result = 31 * result + (channelSSme != null ? channelSSme.hashCode() : 0);
        result = 31 * result + (channelCreationTs != null ? channelCreationTs.hashCode() : 0);
        result = 31 * result + (channelBlockTs != null ? channelBlockTs.hashCode() : 0);
        result = 31 * result + (channelActivationTs != null ? channelActivationTs.hashCode() : 0);
        result = 31 * result + (channelCancelTs != null ? channelCancelTs.hashCode() : 0);
        result = 31 * result + channelStatusId;
        result = 31 * result + (channelCts != null ? channelCts.hashCode() : 0);
        return result;
    }
}
