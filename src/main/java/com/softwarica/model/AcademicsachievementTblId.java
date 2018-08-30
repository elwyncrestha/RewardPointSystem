package com.softwarica.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AcademicsachievementTblId implements java.io.Serializable {

    private int userId;
    private int semester;

    public AcademicsachievementTblId() {
    }

    public AcademicsachievementTblId(int userId, int semester) {
        this.userId = userId;
        this.semester = semester;
    }

    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "semester", nullable = false)
    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof AcademicsachievementTblId)) {
            return false;
        }
        AcademicsachievementTblId castOther = (AcademicsachievementTblId) other;

        return (this.getUserId() == castOther.getUserId())
                && (this.getSemester() == castOther.getSemester());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getUserId();
        result = 37 * result + this.getSemester();
        return result;
    }

}
