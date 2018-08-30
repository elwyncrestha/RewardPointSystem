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
@Table(name = "othercontribution_tbl", catalog = "rewardpointsystem")
public class OthercontributionTbl implements java.io.Serializable {

    private OthercontributionTblId id;
    private UserTbl userTbl;

    public OthercontributionTbl() {
    }

    public OthercontributionTbl(OthercontributionTblId id, UserTbl userTbl) {
        this.id = id;
        this.userTbl = userTbl;
    }

    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "userId", column = @Column(name = "userId", nullable = false))
        , 
        @AttributeOverride(name = "contributionName", column = @Column(name = "contributionName", nullable = false))
        , 
        @AttributeOverride(name = "contributionDate", column = @Column(name = "contributionDate", nullable = false, length = 10))})
    public OthercontributionTblId getId() {
        return this.id;
    }

    public void setId(OthercontributionTblId id) {
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

}
