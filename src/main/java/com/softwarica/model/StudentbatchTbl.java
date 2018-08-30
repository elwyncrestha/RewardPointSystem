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
@Table(name = "studentbatch_tbl", catalog = "rewardpointsystem")
public class StudentbatchTbl implements java.io.Serializable {

    private Integer batchId;
    private String batchName;
    private Set<UserTbl> userTbls;

    public StudentbatchTbl() {
    }

    public StudentbatchTbl(String batchName) {
        this.batchName = batchName;
    }

    public StudentbatchTbl(String batchName, Set<UserTbl> userTbls) {
        this.batchName = batchName;
        this.userTbls = userTbls;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "batchId", unique = true, nullable = false)
    public Integer getBatchId() {
        return this.batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    @Column(name = "batchName", nullable = false)
    public String getBatchName() {
        return this.batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "studentbatchTbl")
    public Set<UserTbl> getUserTbls() {
        return this.userTbls;
    }

    public void setUserTbls(Set<UserTbl> userTbls) {
        this.userTbls = userTbls;
    }

}
