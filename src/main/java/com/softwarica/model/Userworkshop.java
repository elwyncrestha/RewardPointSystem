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
@Table(name = "userworkshop", catalog = "rewardpointsystem")
public class Userworkshop implements java.io.Serializable {

    private UserworkshopId id;
    private UserTbl userTbl;
    private WorkshopTbl workshopTbl;
    private int workshopPerformance;

    public Userworkshop() {
    }

    public Userworkshop(UserworkshopId id, UserTbl userTbl, WorkshopTbl workshopTbl, int workshopPerformance) {
        this.id = id;
        this.userTbl = userTbl;
        this.workshopTbl = workshopTbl;
        this.workshopPerformance = workshopPerformance;
    }

    @EmbeddedId

    @AttributeOverrides({
        @AttributeOverride(name = "userId", column = @Column(name = "userId", nullable = false))
        , 
        @AttributeOverride(name = "workshopId", column = @Column(name = "workshopId", nullable = false))})
    public UserworkshopId getId() {
        return this.id;
    }

    public void setId(UserworkshopId id) {
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workshopId", nullable = false, insertable = false, updatable = false)
    public WorkshopTbl getWorkshopTbl() {
        return this.workshopTbl;
    }

    public void setWorkshopTbl(WorkshopTbl workshopTbl) {
        this.workshopTbl = workshopTbl;
    }

    @Column(name = "workshopPerformance", nullable = false)
    public int getWorkshopPerformance() {
        return this.workshopPerformance;
    }

    public void setWorkshopPerformance(int workshopPerformance) {
        this.workshopPerformance = workshopPerformance;
    }

}
