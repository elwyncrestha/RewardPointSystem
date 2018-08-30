package com.softwarica.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "event_tbl", catalog = "rewardpointsystem")
public class EventTbl implements java.io.Serializable {

    private Integer eventId;
    private String eventName;
    private Date eventStartDate;
    private Date eventEndDate;
    private int minRewardPoint;
    private Set<Userevent> userevents;

    public EventTbl() {
    }

    public EventTbl(String eventName, Date eventStartDate, Date eventEndDate, int minRewardPoint) {
        this.eventName = eventName;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.minRewardPoint = minRewardPoint;
    }

    public EventTbl(String eventName, Date eventStartDate, Date eventEndDate, int minRewardPoint, Set<Userevent> userevents) {
        this.eventName = eventName;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.minRewardPoint = minRewardPoint;
        this.userevents = userevents;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "eventId", unique = true, nullable = false)
    public Integer getEventId() {
        return this.eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @Column(name = "eventName", nullable = false)
    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "eventStartDate", nullable = false, length = 10)
    public Date getEventStartDate() {
        return this.eventStartDate;
    }

    public void setEventStartDate(Date eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "eventEndDate", nullable = false, length = 10)
    public Date getEventEndDate() {
        return this.eventEndDate;
    }

    public void setEventEndDate(Date eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    @Column(name = "minRewardPoint", nullable = false)
    public int getMinRewardPoint() {
        return this.minRewardPoint;
    }

    public void setMinRewardPoint(int minRewardPoint) {
        this.minRewardPoint = minRewardPoint;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "eventTbl")
    public Set<Userevent> getUserevents() {
        return this.userevents;
    }

    public void setUserevents(Set<Userevent> userevents) {
        this.userevents = userevents;
    }

}
