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
@Table(name = "academicsachievement_tbl", catalog = "rewardpointsystem")
public class AcademicsachievementTbl implements java.io.Serializable {

    private AcademicsachievementTblId id;
    private UserTbl userTbl;
    private int marksObtained;

    public AcademicsachievementTbl() {
    }

    public AcademicsachievementTbl(AcademicsachievementTblId id, UserTbl userTbl, int marksObtained) {
        this.id = id;
        this.userTbl = userTbl;
        this.marksObtained = marksObtained;
    }

    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "userId", column = @Column(name = "userId", nullable = false))
        , 
        @AttributeOverride(name = "semester", column = @Column(name = "semester", nullable = false))})
    public AcademicsachievementTblId getId() {
        return this.id;
    }

    public void setId(AcademicsachievementTblId id) {
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

    @Column(name = "marksObtained", nullable = false)
    public int getMarksObtained() {
        return this.marksObtained;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }
}
