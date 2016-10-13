package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "interface", schema = "", catalog = "brain")
public class InterfaceEntity {
    private int interfaceId;
    private int interfaceChannelId;
    private int interfaceTypeId;
    private String interfaceMobileNo;
    private String interfaceImei;
    private String interfacePassword;
    private String interfaceIp;
    private String interfaceMac;
    private String interfaceAutoSync;
    private String interfaceSrv;
    private Timestamp interfaceActivation;
    private Timestamp interfaceBlock;
    private Timestamp interfaceInactive;
    private Timestamp interfaceCancel;
    private Integer interfaceAttemptCtr;
    private int interfaceStatusId;
    private Timestamp interfaceCts;

    @Id
    @Column(name = "interface_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(int interfaceId) {
        this.interfaceId = interfaceId;
    }

    @Basic
    @Column(name = "interface_channel_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getInterfaceChannelId() {
        return interfaceChannelId;
    }

    public void setInterfaceChannelId(int interfaceChannelId) {
        this.interfaceChannelId = interfaceChannelId;
    }

    @Basic
    @Column(name = "interface_type_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getInterfaceTypeId() {
        return interfaceTypeId;
    }

    public void setInterfaceTypeId(int interfaceTypeId) {
        this.interfaceTypeId = interfaceTypeId;
    }

    @Basic
    @Column(name = "interface_mobile_no", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getInterfaceMobileNo() {
        return interfaceMobileNo;
    }

    public void setInterfaceMobileNo(String interfaceMobileNo) {
        this.interfaceMobileNo = interfaceMobileNo;
    }

    @Basic
    @Column(name = "interface_imei", nullable = true, insertable = true, updatable = true, length = 25, precision = 0)
    public String getInterfaceImei() {
        return interfaceImei;
    }

    public void setInterfaceImei(String interfaceImei) {
        this.interfaceImei = interfaceImei;
    }

    @Basic
    @Column(name = "interface_password", nullable = true, insertable = true, updatable = true, length = 128, precision = 0)
    public String getInterfacePassword() {
        return interfacePassword;
    }

    public void setInterfacePassword(String interfacePassword) {
        this.interfacePassword = interfacePassword;
    }

    @Basic
    @Column(name = "interface_ip", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getInterfaceIp() {
        return interfaceIp;
    }

    public void setInterfaceIp(String interfaceIp) {
        this.interfaceIp = interfaceIp;
    }

    @Basic
    @Column(name = "interface_mac", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getInterfaceMac() {
        return interfaceMac;
    }

    public void setInterfaceMac(String interfaceMac) {
        this.interfaceMac = interfaceMac;
    }

    @Basic
    @Column(name = "interface_auto_sync", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public String getInterfaceAutoSync() {
        return interfaceAutoSync;
    }

    public void setInterfaceAutoSync(String interfaceAutoSync) {
        this.interfaceAutoSync = interfaceAutoSync;
    }

    @Basic
    @Column(name = "interface_srv", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public String getInterfaceSrv() {
        return interfaceSrv;
    }

    public void setInterfaceSrv(String interfaceSrv) {
        this.interfaceSrv = interfaceSrv;
    }

    @Basic
    @Column(name = "interface_activation", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getInterfaceActivation() {
        return interfaceActivation;
    }

    public void setInterfaceActivation(Timestamp interfaceActivation) {
        this.interfaceActivation = interfaceActivation;
    }

    @Basic
    @Column(name = "interface_block", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getInterfaceBlock() {
        return interfaceBlock;
    }

    public void setInterfaceBlock(Timestamp interfaceBlock) {
        this.interfaceBlock = interfaceBlock;
    }

    @Basic
    @Column(name = "interface_inactive", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getInterfaceInactive() {
        return interfaceInactive;
    }

    public void setInterfaceInactive(Timestamp interfaceInactive) {
        this.interfaceInactive = interfaceInactive;
    }

    @Basic
    @Column(name = "interface_cancel", nullable = true, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getInterfaceCancel() {
        return interfaceCancel;
    }

    public void setInterfaceCancel(Timestamp interfaceCancel) {
        this.interfaceCancel = interfaceCancel;
    }

    @Basic
    @Column(name = "interface_attempt_ctr", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getInterfaceAttemptCtr() {
        return interfaceAttemptCtr;
    }

    public void setInterfaceAttemptCtr(Integer interfaceAttemptCtr) {
        this.interfaceAttemptCtr = interfaceAttemptCtr;
    }

    @Basic
    @Column(name = "interface_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getInterfaceStatusId() {
        return interfaceStatusId;
    }

    public void setInterfaceStatusId(int interfaceStatusId) {
        this.interfaceStatusId = interfaceStatusId;
    }

    @Basic
    @Column(name = "interface_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getInterfaceCts() {
        return interfaceCts;
    }

    public void setInterfaceCts(Timestamp interfaceCts) {
        this.interfaceCts = interfaceCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InterfaceEntity that = (InterfaceEntity) o;

        if (interfaceChannelId != that.interfaceChannelId) return false;
        if (interfaceId != that.interfaceId) return false;
        if (interfaceStatusId != that.interfaceStatusId) return false;
        if (interfaceTypeId != that.interfaceTypeId) return false;
        if (interfaceActivation != null ? !interfaceActivation.equals(that.interfaceActivation) : that.interfaceActivation != null)
            return false;
        if (interfaceAttemptCtr != null ? !interfaceAttemptCtr.equals(that.interfaceAttemptCtr) : that.interfaceAttemptCtr != null)
            return false;
        if (interfaceAutoSync != null ? !interfaceAutoSync.equals(that.interfaceAutoSync) : that.interfaceAutoSync != null)
            return false;
        if (interfaceBlock != null ? !interfaceBlock.equals(that.interfaceBlock) : that.interfaceBlock != null)
            return false;
        if (interfaceCancel != null ? !interfaceCancel.equals(that.interfaceCancel) : that.interfaceCancel != null)
            return false;
        if (interfaceCts != null ? !interfaceCts.equals(that.interfaceCts) : that.interfaceCts != null) return false;
        if (interfaceImei != null ? !interfaceImei.equals(that.interfaceImei) : that.interfaceImei != null)
            return false;
        if (interfaceInactive != null ? !interfaceInactive.equals(that.interfaceInactive) : that.interfaceInactive != null)
            return false;
        if (interfaceIp != null ? !interfaceIp.equals(that.interfaceIp) : that.interfaceIp != null) return false;
        if (interfaceMac != null ? !interfaceMac.equals(that.interfaceMac) : that.interfaceMac != null) return false;
        if (interfaceMobileNo != null ? !interfaceMobileNo.equals(that.interfaceMobileNo) : that.interfaceMobileNo != null)
            return false;
        if (interfacePassword != null ? !interfacePassword.equals(that.interfacePassword) : that.interfacePassword != null)
            return false;
        if (interfaceSrv != null ? !interfaceSrv.equals(that.interfaceSrv) : that.interfaceSrv != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = interfaceId;
        result = 31 * result + interfaceChannelId;
        result = 31 * result + interfaceTypeId;
        result = 31 * result + (interfaceMobileNo != null ? interfaceMobileNo.hashCode() : 0);
        result = 31 * result + (interfaceImei != null ? interfaceImei.hashCode() : 0);
        result = 31 * result + (interfacePassword != null ? interfacePassword.hashCode() : 0);
        result = 31 * result + (interfaceIp != null ? interfaceIp.hashCode() : 0);
        result = 31 * result + (interfaceMac != null ? interfaceMac.hashCode() : 0);
        result = 31 * result + (interfaceAutoSync != null ? interfaceAutoSync.hashCode() : 0);
        result = 31 * result + (interfaceSrv != null ? interfaceSrv.hashCode() : 0);
        result = 31 * result + (interfaceActivation != null ? interfaceActivation.hashCode() : 0);
        result = 31 * result + (interfaceBlock != null ? interfaceBlock.hashCode() : 0);
        result = 31 * result + (interfaceInactive != null ? interfaceInactive.hashCode() : 0);
        result = 31 * result + (interfaceCancel != null ? interfaceCancel.hashCode() : 0);
        result = 31 * result + (interfaceAttemptCtr != null ? interfaceAttemptCtr.hashCode() : 0);
        result = 31 * result + interfaceStatusId;
        result = 31 * result + (interfaceCts != null ? interfaceCts.hashCode() : 0);
        return result;
    }
}
