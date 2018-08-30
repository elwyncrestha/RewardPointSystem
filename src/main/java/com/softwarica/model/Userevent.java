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
@Table(name = "userevent", catalog = "rewardpointsystem")
public class Userevent implements java.io.Serializable {

    private UsereventId id;
    private EventTbl eventTbl;
    private UserTbl userTbl;
    private int eventPerformance;

    public Userevent() {
    }

    public Userevent(UsereventId id, EventTbl eventTbl, UserTbl userTbl, int eventPerformance) {
        this.id = id;
        this.eventTbl = eventTbl;
        this.userTbl = userTbl;
        this.eventPerformance = eventPerformance;
    }

    @EmbeddedId

    @AttributeOverrides({
        @AttributeOverride(name = "userId", column = @Column(name = "userId", nullable = false))
        , 
        @AttributeOverride(name = "eventId", column = @Column(name = "eventId", nullable = false))})
    public UsereventId getId() {
        return this.id;
    }

    public void setId(UsereventId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eventId", nullable = false, insertable = false, updatable = false)
    public EventTbl getEventTbl() {
        return this.eventTbl;
    }

    public void setEventTbl(EventTbl eventTbl) {
        this.eventTbl = eventTbl;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false, insertable = false, updatable = false)
    public UserTbl getUserTbl() {
        return this.userTbl;
    }

    public void setUserTbl(UserTbl userTbl) {
        this.userTbl = userTbl;
    }

    @Column(name = "eventPerformance", nullable = false)
    public int getEventPerformance() {
        return this.eventPerformance;
    }

    public void setEventPerformance(int eventPerformance) {
        this.eventPerformance = eventPerformance;
    }

}
