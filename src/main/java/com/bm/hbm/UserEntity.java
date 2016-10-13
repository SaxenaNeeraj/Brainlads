package com.bm.hbm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by neeraj on 26/6/16.
 */
@Entity
@Table(name = "user", schema = "", catalog = "brain")
public class UserEntity {
    private int userId;
    private String userName;
    private String userPassword;
    private String userFirstName;
    private String userLastName;
    private String userMobileNo;
    private String userEmailId;
    private int userStatusId;
    private Timestamp userCts;

    @Id
    @Column(name = "user_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_password", nullable = false, insertable = true, updatable = true, length = 128, precision = 0)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "user_first_name", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    @Basic
    @Column(name = "user_last_name", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    @Basic
    @Column(name = "user_mobile_no", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getUserMobileNo() {
        return userMobileNo;
    }

    public void setUserMobileNo(String userMobileNo) {
        this.userMobileNo = userMobileNo;
    }

    @Basic
    @Column(name = "user_email_id", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    @Basic
    @Column(name = "user_status_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getUserStatusId() {
        return userStatusId;
    }

    public void setUserStatusId(int userStatusId) {
        this.userStatusId = userStatusId;
    }

    @Basic
    @Column(name = "user_cts", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getUserCts() {
        return userCts;
    }

    public void setUserCts(Timestamp userCts) {
        this.userCts = userCts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (userStatusId != that.userStatusId) return false;
        if (userCts != null ? !userCts.equals(that.userCts) : that.userCts != null) return false;
        if (userEmailId != null ? !userEmailId.equals(that.userEmailId) : that.userEmailId != null) return false;
        if (userFirstName != null ? !userFirstName.equals(that.userFirstName) : that.userFirstName != null)
            return false;
        if (userLastName != null ? !userLastName.equals(that.userLastName) : that.userLastName != null) return false;
        if (userMobileNo != null ? !userMobileNo.equals(that.userMobileNo) : that.userMobileNo != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPassword != null ? !userPassword.equals(that.userPassword) : that.userPassword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userFirstName != null ? userFirstName.hashCode() : 0);
        result = 31 * result + (userLastName != null ? userLastName.hashCode() : 0);
        result = 31 * result + (userMobileNo != null ? userMobileNo.hashCode() : 0);
        result = 31 * result + (userEmailId != null ? userEmailId.hashCode() : 0);
        result = 31 * result + userStatusId;
        result = 31 * result + (userCts != null ? userCts.hashCode() : 0);
        return result;
    }
}
