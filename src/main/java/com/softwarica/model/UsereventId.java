package com.softwarica.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UsereventId implements java.io.Serializable {

    private int userId;
    private int eventId;

    public UsereventId() {
    }

    public UsereventId(int userId, int eventId) {
        this.userId = userId;
        this.eventId = eventId;
    }

    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "eventId", nullable = false)
    public int getEventId() {
        return this.eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof UsereventId)) {
            return false;
        }
        UsereventId castOther = (UsereventId) other;

        return (this.getUserId() == castOther.getUserId())
                && (this.getEventId() == castOther.getEventId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getUserId();
        result = 37 * result + this.getEventId();
        return result;
    }

}
