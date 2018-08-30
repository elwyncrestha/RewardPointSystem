package com.softwarica.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class OthercontributionTblId implements java.io.Serializable {

    private int userId;
    private String contributionName;
    private Date contributionDate;

    public OthercontributionTblId() {
    }

    public OthercontributionTblId(int userId, String contributionName, Date contributionDate) {
        this.userId = userId;
        this.contributionName = contributionName;
        this.contributionDate = contributionDate;
    }

    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "contributionName", nullable = false)
    public String getContributionName() {
        return this.contributionName;
    }

    public void setContributionName(String contributionName) {
        this.contributionName = contributionName;
    }

    @Column(name = "contributionDate", nullable = false, length = 10)
    @Temporal(TemporalType.DATE)
    public Date getContributionDate() {
        return this.contributionDate;
    }

    public void setContributionDate(Date contributionDate) {
        this.contributionDate = contributionDate;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof OthercontributionTblId)) {
            return false;
        }
        OthercontributionTblId castOther = (OthercontributionTblId) other;

        return (this.getUserId() == castOther.getUserId())
                && ((this.getContributionName() == castOther.getContributionName()) || (this.getContributionName() != null && castOther.getContributionName() != null && this.getContributionName().equals(castOther.getContributionName())))
                && ((this.getContributionDate() == castOther.getContributionDate()) || (this.getContributionDate() != null && castOther.getContributionDate() != null && this.getContributionDate().equals(castOther.getContributionDate())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getUserId();
        result = 37 * result + (getContributionName() == null ? 0 : this.getContributionName().hashCode());
        result = 37 * result + (getContributionDate() == null ? 0 : this.getContributionDate().hashCode());
        return result;
    }

}
