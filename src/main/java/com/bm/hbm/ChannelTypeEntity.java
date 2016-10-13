package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "channel_type", schema = "", catalog = "brain")
public class ChannelTypeEntity {
    private int channelTypeId;
    private String channelTypeCode;
    private String channelTypeName;
    private int channelTypePrecidence;
    private int channelTypeStatusId;
    private Timestamp channelTypeCts;

    @Id
    @Column(name = "channel_type_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getChannelTypeId() {
        return channelTypeId;
    }

    public void setChannelTypeId(int channelTypeId) {
        this.channelTypeId = channelTypeId;
    }

    @Basic
    @Column(name = "channel_type_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getChannelTypeCode() {
        return channelTypeCode;
    }

    public void setChannelTypeCode(String channelTypeCode) {
        this.channelTypeCode = channelTypeCode;
    }

    @Basic
    @Column(name = "channel_type_name", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getChannelTypeName() {
        return channelTypeName;
    }

    public void setChannelTypeName(String channelTypeName) {
        this.channelTypeName = channelTypeName;
    }

    @Basic
    @Column(name = "channel_type_precidence", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getChannelTypePrecidence() {
        return channelTypePrecidence;
    }

    public void setChannelTypePrecidence(int channelTypePrecidence) {
        this.channelTypePrecidence = channelTypePrecidence;
    }

    @Basic
    @Column(name = "channel_type_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getChannelTypeStatusId() {
        return channelTypeStatusId;
    }

    public void setChannelTypeStatusId(int channelTypeStatusId) {
        this.channelTypeStatusId = channelTypeStatusId;
    }

    @Basic
    @Column(name = "channel_type_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getChannelTypeCts() {
        return channelTypeCts;
    }

    public void setChannelTypeCts(Timestamp channelTypeCts) {
        this.channelTypeCts = channelTypeCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChannelTypeEntity that = (ChannelTypeEntity) o;

        if (channelTypeId != that.channelTypeId) return false;
        if (channelTypePrecidence != that.channelTypePrecidence) return false;
        if (channelTypeStatusId != that.channelTypeStatusId) return false;
        if (channelTypeCode != null ? !channelTypeCode.equals(that.channelTypeCode) : that.channelTypeCode != null)
            return false;
        if (channelTypeCts != null ? !channelTypeCts.equals(that.channelTypeCts) : that.channelTypeCts != null)
            return false;
        if (channelTypeName != null ? !channelTypeName.equals(that.channelTypeName) : that.channelTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = channelTypeId;
        result = 31 * result + (channelTypeCode != null ? channelTypeCode.hashCode() : 0);
        result = 31 * result + (channelTypeName != null ? channelTypeName.hashCode() : 0);
        result = 31 * result + channelTypePrecidence;
        result = 31 * result + channelTypeStatusId;
        result = 31 * result + (channelTypeCts != null ? channelTypeCts.hashCode() : 0);
        return result;
    }
}
