package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "interface_type", schema = "", catalog = "brain")
public class InterfaceTypeEntity {
    private int interfaceTypeId;
    private String interfaceTypeCode;
    private String interfaceTypeName;
    private int interfaceTypeStatusId;
    private Timestamp interfaceTypeCts;

    @Id
    @Column(name = "interface_type_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getInterfaceTypeId() {
        return interfaceTypeId;
    }

    public void setInterfaceTypeId(int interfaceTypeId) {
        this.interfaceTypeId = interfaceTypeId;
    }

    @Basic
    @Column(name = "interface_type_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getInterfaceTypeCode() {
        return interfaceTypeCode;
    }

    public void setInterfaceTypeCode(String interfaceTypeCode) {
        this.interfaceTypeCode = interfaceTypeCode;
    }

    @Basic
    @Column(name = "interface_type_name", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getInterfaceTypeName() {
        return interfaceTypeName;
    }

    public void setInterfaceTypeName(String interfaceTypeName) {
        this.interfaceTypeName = interfaceTypeName;
    }

    @Basic
    @Column(name = "interface_type_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getInterfaceTypeStatusId() {
        return interfaceTypeStatusId;
    }

    public void setInterfaceTypeStatusId(int interfaceTypeStatusId) {
        this.interfaceTypeStatusId = interfaceTypeStatusId;
    }

    @Basic
    @Column(name = "interface_type_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getInterfaceTypeCts() {
        return interfaceTypeCts;
    }

    public void setInterfaceTypeCts(Timestamp interfaceTypeCts) {
        this.interfaceTypeCts = interfaceTypeCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InterfaceTypeEntity that = (InterfaceTypeEntity) o;

        if (interfaceTypeId != that.interfaceTypeId) return false;
        if (interfaceTypeStatusId != that.interfaceTypeStatusId) return false;
        if (interfaceTypeCode != null ? !interfaceTypeCode.equals(that.interfaceTypeCode) : that.interfaceTypeCode != null)
            return false;
        if (interfaceTypeCts != null ? !interfaceTypeCts.equals(that.interfaceTypeCts) : that.interfaceTypeCts != null)
            return false;
        if (interfaceTypeName != null ? !interfaceTypeName.equals(that.interfaceTypeName) : that.interfaceTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = interfaceTypeId;
        result = 31 * result + (interfaceTypeCode != null ? interfaceTypeCode.hashCode() : 0);
        result = 31 * result + (interfaceTypeName != null ? interfaceTypeName.hashCode() : 0);
        result = 31 * result + interfaceTypeStatusId;
        result = 31 * result + (interfaceTypeCts != null ? interfaceTypeCts.hashCode() : 0);
        return result;
    }
}
