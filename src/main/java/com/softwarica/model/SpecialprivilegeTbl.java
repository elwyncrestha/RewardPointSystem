package com.softwarica.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "specialprivilege_tbl", catalog = "rewardpointsystem")
public class SpecialprivilegeTbl implements java.io.Serializable {

    private Integer privilegeId;
    private String privilegeName;
    private Set<UserTbl> userTbls;

    public SpecialprivilegeTbl() {
    }

    public SpecialprivilegeTbl(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public SpecialprivilegeTbl(String privilegeName, Set<UserTbl> userTbls) {
        this.privilegeName = privilegeName;
        this.userTbls = userTbls;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "privilegeId", unique = true, nullable = false)
    public Integer getPrivilegeId() {
        return this.privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Column(name = "privilegeName", nullable = false)
    public String getPrivilegeName() {
        return this.privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "specialprivilegeTbls")
    public Set<UserTbl> getUserTbls() {
        return this.userTbls;
    }

    public void setUserTbls(Set<UserTbl> userTbls) {
        this.userTbls = userTbls;
    }

}
