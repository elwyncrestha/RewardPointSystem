package com.softwarica.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class AttendanceTblId implements java.io.Serializable {

    private int userId;
    private Date attendanceDate;

    public AttendanceTblId() {
    }

    public AttendanceTblId(int userId, Date attendanceDate) {
        this.userId = userId;
        this.attendanceDate = attendanceDate;
    }

    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "attendanceDate", nullable = false, length = 10)
    @Temporal(TemporalType.DATE)
    public Date getAttendanceDate() {
        return this.attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof AttendanceTblId)) {
            return false;
        }
        AttendanceTblId castOther = (AttendanceTblId) other;

        return (this.getUserId() == castOther.getUserId())
                && ((this.getAttendanceDate() == castOther.getAttendanceDate()) || (this.getAttendanceDate() != null && castOther.getAttendanceDate() != null && this.getAttendanceDate().equals(castOther.getAttendanceDate())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getUserId();
        result = 37 * result + (getAttendanceDate() == null ? 0 : this.getAttendanceDate().hashCode());
        return result;
    }

}
