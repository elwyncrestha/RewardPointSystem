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
@Table(name = "workshop_tbl", catalog = "rewardpointsystem")
public class WorkshopTbl implements java.io.Serializable {

    private Integer workshopId;
    private String workshopName;
    private Date workshopStartDate;
    private Date workshopEndDate;
    private int targetedSemester;
    private String workshopType;
    private Set<Userworkshop> userworkshops;

    public WorkshopTbl() {
    }

    public WorkshopTbl(String workshopName, Date workshopStartDate, int targetedSemester, String workshopType) {
        this.workshopName = workshopName;
        this.workshopStartDate = workshopStartDate;
        this.targetedSemester = targetedSemester;
        this.workshopType = workshopType;
    }

    public WorkshopTbl(String workshopName, Date workshopStartDate, Date workshopEndDate, int targetedSemester, String workshopType, Set<Userworkshop> userworkshops) {
        this.workshopName = workshopName;
        this.workshopStartDate = workshopStartDate;
        this.workshopEndDate = workshopEndDate;
        this.targetedSemester = targetedSemester;
        this.workshopType = workshopType;
        this.userworkshops = userworkshops;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "workshopId", unique = true, nullable = false)
    public Integer getWorkshopId() {
        return this.workshopId;
    }

    public void setWorkshopId(Integer workshopId) {
        this.workshopId = workshopId;
    }

    @Column(name = "workshopName", nullable = false)
    public String getWorkshopName() {
        return this.workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "workshopStartDate", nullable = false, length = 10)
    public Date getWorkshopStartDate() {
        return this.workshopStartDate;
    }

    public void setWorkshopStartDate(Date workshopStartDate) {
        this.workshopStartDate = workshopStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "workshopEndDate", length = 10)
    public Date getWorkshopEndDate() {
        return this.workshopEndDate;
    }

    public void setWorkshopEndDate(Date workshopEndDate) {
        this.workshopEndDate = workshopEndDate;
    }

    @Column(name = "targetedSemester", nullable = false)
    public int getTargetedSemester() {
        return this.targetedSemester;
    }

    public void setTargetedSemester(int targetedSemester) {
        this.targetedSemester = targetedSemester;
    }

    @Column(name = "workshopType", nullable = false)
    public String getWorkshopType() {
        return this.workshopType;
    }

    public void setWorkshopType(String workshopType) {
        this.workshopType = workshopType;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "workshopTbl")
    public Set<Userworkshop> getUserworkshops() {
        return this.userworkshops;
    }

    public void setUserworkshops(Set<Userworkshop> userworkshops) {
        this.userworkshops = userworkshops;
    }

}
