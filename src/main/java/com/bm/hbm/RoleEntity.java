package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "role", schema = "", catalog = "brain")
public class RoleEntity {
    private int roleId;
    private String roleCode;
    private String roleName;
    private int roleStatusId;
    private Timestamp roleCts;

    @Id
    @Column(name = "role_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "role_code", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Basic
    @Column(name = "role_name", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "role_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getRoleStatusId() {
        return roleStatusId;
    }

    public void setRoleStatusId(int roleStatusId) {
        this.roleStatusId = roleStatusId;
    }

    @Basic
    @Column(name = "role_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getRoleCts() {
        return roleCts;
    }

    public void setRoleCts(Timestamp roleCts) {
        this.roleCts = roleCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (roleId != that.roleId) return false;
        if (roleStatusId != that.roleStatusId) return false;
        if (roleCode != null ? !roleCode.equals(that.roleCode) : that.roleCode != null) return false;
        if (roleCts != null ? !roleCts.equals(that.roleCts) : that.roleCts != null) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (roleCode != null ? roleCode.hashCode() : 0);
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + roleStatusId;
        result = 31 * result + (roleCts != null ? roleCts.hashCode() : 0);
        return result;
    }
}
