package com.softwarica.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attendance_tbl", catalog = "rewardpointsystem")
public class AttendanceTbl implements java.io.Serializable {

    private AttendanceTblId id;
    private UserTbl userTbl;
    private int totalPresent;
    private int totalActiveDays;

    public AttendanceTbl() {
    }

    public AttendanceTbl(AttendanceTblId id, UserTbl userTbl, int totalPresent, int totalActiveDays) {
        this.id = id;
        this.userTbl = userTbl;
        this.totalPresent = totalPresent;
        this.totalActiveDays = totalActiveDays;
    }

    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "userId", column = @Column(name = "userId", nullable = false))
        , 
        @AttributeOverride(name = "attendanceDate", column = @Column(name = "attendanceDate", nullable = false, length = 10))})
    public AttendanceTblId getId() {
        return this.id;
    }

    public void setId(AttendanceTblId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false, insertable = false, updatable = false)
    public UserTbl getUserTbl() {
        return this.userTbl;
    }

    public void setUserTbl(UserTbl userTbl) {
        this.userTbl = userTbl;
    }

    @Column(name = "totalPresent", nullable = false)
    public int getTotalPresent() {
        return this.totalPresent;
    }

    public void setTotalPresent(int totalPresent) {
        this.totalPresent = totalPresent;
    }

    @Column(name = "totalActiveDays", nullable = false)
    public int getTotalActiveDays() {
        return this.totalActiveDays;
    }

    public void setTotalActiveDays(int totalActiveDays) {
        this.totalActiveDays = totalActiveDays;
    }

}
