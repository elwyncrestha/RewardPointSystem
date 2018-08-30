package com.softwarica.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usertype_tbl", catalog = "rewardpointsystem")
public class UsertypeTbl implements java.io.Serializable {

    private Integer userTypeId;
    private String userTypeName;
    private Set<UserTbl> userTbls;

    public UsertypeTbl() {
    }

    public UsertypeTbl(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public UsertypeTbl(String userTypeName, Set<UserTbl> userTbls) {
        this.userTypeName = userTypeName;
        this.userTbls = userTbls;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "userTypeId", unique = true, nullable = false)
    public Integer getUserTypeId() {
        return this.userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Column(name = "userTypeName", nullable = false)
    public String getUserTypeName() {
        return this.userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usertypeTbl")
    public Set<UserTbl> getUserTbls() {
        return this.userTbls;
    }

    public void setUserTbls(Set<UserTbl> userTbls) {
        this.userTbls = userTbls;
    }

}
