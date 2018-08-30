package com.softwarica.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserworkshopId implements java.io.Serializable {

    private int userId;
    private int workshopId;

    public UserworkshopId() {
    }

    public UserworkshopId(int userId, int workshopId) {
        this.userId = userId;
        this.workshopId = workshopId;
    }

    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "workshopId", nullable = false)
    public int getWorkshopId() {
        return this.workshopId;
    }

    public void setWorkshopId(int workshopId) {
        this.workshopId = workshopId;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof UserworkshopId)) {
            return false;
        }
        UserworkshopId castOther = (UserworkshopId) other;

        return (this.getUserId() == castOther.getUserId())
                && (this.getWorkshopId() == castOther.getWorkshopId());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getUserId();
        result = 37 * result + this.getWorkshopId();
        return result;
    }

}
