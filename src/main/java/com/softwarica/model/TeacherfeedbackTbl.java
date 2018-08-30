package com.softwarica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "teacherfeedback_tbl", catalog = "rewardpointsystem")
public class TeacherfeedbackTbl implements java.io.Serializable {

    private int userId;
    private UserTbl userTbl;
    private int feedbackPoint;

    public TeacherfeedbackTbl() {
    }

    public TeacherfeedbackTbl(UserTbl userTbl, int feedbackPoint) {
        this.userTbl = userTbl;
        this.feedbackPoint = feedbackPoint;
    }

    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "userTbl"))
    @Id
    @GeneratedValue(generator = "generator")

    @Column(name = "userId", unique = true, nullable = false)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public UserTbl getUserTbl() {
        return this.userTbl;
    }

    public void setUserTbl(UserTbl userTbl) {
        this.userTbl = userTbl;
    }

    @Column(name = "feedbackPoint", nullable = false)
    public int getFeedbackPoint() {
        return this.feedbackPoint;
    }

    public void setFeedbackPoint(int feedbackPoint) {
        this.feedbackPoint = feedbackPoint;
    }

}
