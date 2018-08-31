package com.softwarica.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "user_tbl", catalog = "rewardpointsystem")
public class UserTbl implements java.io.Serializable {

    private Integer userId;
    private StudentbatchTbl studentbatchTbl;
    private UsertypeTbl usertypeTbl;
    private String userFname;
    private String userMname;
    private String userLname;
    private Date userDob;
    private char userGender;
    private String userPaddress;
    private String userTaddress;
    private String userUsername;
    private String userPassword;
    private byte active;
    private Set<SpecialprivilegeTbl> specialprivilegeTbls;
    private Set<Userworkshop> userworkshops;
    private Set<AcademicsachievementTbl> academicsachievementTbls;
    private Set<AttendanceTbl> attendanceTbls;
    private TeacherfeedbackTbl teacherfeedbackTbl;
    private Set<OthercontributionTbl> othercontributionTbls;
    private Set<Userevent> userevents;

    public UserTbl() {
    }

    public UserTbl(StudentbatchTbl studentbatchTbl, UsertypeTbl usertypeTbl, String userFname, String userLname, Date userDob, char userGender, String userPaddress, String userTaddress, String userUsername, String userPassword, byte active) {
        this.studentbatchTbl = studentbatchTbl;
        this.usertypeTbl = usertypeTbl;
        this.userFname = userFname;
        this.userLname = userLname;
        this.userDob = userDob;
        this.userGender = userGender;
        this.userPaddress = userPaddress;
        this.userTaddress = userTaddress;
        this.userUsername = userUsername;
        this.userPassword = userPassword;
        this.active = active;
    }

    public UserTbl(StudentbatchTbl studentbatchTbl, UsertypeTbl usertypeTbl, String userFname, String userMname, String userLname, Date userDob, char userGender, String userPaddress, String userTaddress, String userUsername, String userPassword, byte active, Set<SpecialprivilegeTbl> specialprivilegeTbls, Set<Userworkshop> userworkshops, Set<AcademicsachievementTbl> academicsachievementTbls, Set<AttendanceTbl> attendanceTbls, TeacherfeedbackTbl teacherfeedbackTbl, Set<OthercontributionTbl> othercontributionTbls, Set<Userevent> userevents) {
        this.studentbatchTbl = studentbatchTbl;
        this.usertypeTbl = usertypeTbl;
        this.userFname = userFname;
        this.userMname = userMname;
        this.userLname = userLname;
        this.userDob = userDob;
        this.userGender = userGender;
        this.userPaddress = userPaddress;
        this.userTaddress = userTaddress;
        this.userUsername = userUsername;
        this.userPassword = userPassword;
        this.active = active;
        this.specialprivilegeTbls = specialprivilegeTbls;
        this.userworkshops = userworkshops;
        this.academicsachievementTbls = academicsachievementTbls;
        this.attendanceTbls = attendanceTbls;
        this.teacherfeedbackTbl = teacherfeedbackTbl;
        this.othercontributionTbls = othercontributionTbls;
        this.userevents = userevents;
    }

    @Id
    @Column(name = "userId", unique = true, nullable = false)
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batchId", nullable = true)
    public StudentbatchTbl getStudentbatchTbl() {
        return this.studentbatchTbl;
    }

    public void setStudentbatchTbl(StudentbatchTbl studentbatchTbl) {
        this.studentbatchTbl = studentbatchTbl;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userTypeId", nullable = false)
    public UsertypeTbl getUsertypeTbl() {
        return this.usertypeTbl;
    }

    public void setUsertypeTbl(UsertypeTbl usertypeTbl) {
        this.usertypeTbl = usertypeTbl;
    }

    @Column(name = "userFName", nullable = false)
    public String getUserFname() {
        return this.userFname;
    }

    public void setUserFname(String userFname) {
        this.userFname = userFname;
    }

    @Column(name = "userMName")
    public String getUserMname() {
        return this.userMname;
    }

    public void setUserMname(String userMname) {
        this.userMname = userMname;
    }

    @Column(name = "userLName", nullable = false)
    public String getUserLname() {
        return this.userLname;
    }

    public void setUserLname(String userLname) {
        this.userLname = userLname;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "userDOB", nullable = false, length = 10)
    public Date getUserDob() {
        return this.userDob;
    }

    public void setUserDob(Date userDob) {
        this.userDob = userDob;
    }

    @Column(name = "userGender", nullable = false, length = 1)
    public char getUserGender() {
        return this.userGender;
    }

    public void setUserGender(char userGender) {
        this.userGender = userGender;
    }

    @Column(name = "userPAddress", nullable = false)
    public String getUserPaddress() {
        return this.userPaddress;
    }

    public void setUserPaddress(String userPaddress) {
        this.userPaddress = userPaddress;
    }

    @Column(name = "userTAddress", nullable = false)
    public String getUserTaddress() {
        return this.userTaddress;
    }

    public void setUserTaddress(String userTaddress) {
        this.userTaddress = userTaddress;
    }

    @Column(name = "userUsername", nullable = false)
    public String getUserUsername() {
        return this.userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    @Column(name = "userPassword", nullable = false)
    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Column(name = "active", nullable = false)
    public byte getActive() {
        return this.active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "userprivilege", catalog = "rewardpointsystem", joinColumns = {
        @JoinColumn(name = "userId", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "privilegeId", nullable = false, updatable = false)})
    public Set<SpecialprivilegeTbl> getSpecialprivilegeTbls() {
        return this.specialprivilegeTbls;
    }

    public void setSpecialprivilegeTbls(Set<SpecialprivilegeTbl> specialprivilegeTbls) {
        this.specialprivilegeTbls = specialprivilegeTbls;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userTbl")
    public Set<Userworkshop> getUserworkshops() {
        return this.userworkshops;
    }

    public void setUserworkshops(Set<Userworkshop> userworkshops) {
        this.userworkshops = userworkshops;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userTbl")
    public Set<AcademicsachievementTbl> getAcademicsachievementTbls() {
        return this.academicsachievementTbls;
    }

    public void setAcademicsachievementTbls(Set<AcademicsachievementTbl> academicsachievementTbls) {
        this.academicsachievementTbls = academicsachievementTbls;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userTbl")
    public Set<AttendanceTbl> getAttendanceTbls() {
        return this.attendanceTbls;
    }

    public void setAttendanceTbls(Set<AttendanceTbl> attendanceTbls) {
        this.attendanceTbls = attendanceTbls;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "userTbl")
    public TeacherfeedbackTbl getTeacherfeedbackTbl() {
        return this.teacherfeedbackTbl;
    }

    public void setTeacherfeedbackTbl(TeacherfeedbackTbl teacherfeedbackTbl) {
        this.teacherfeedbackTbl = teacherfeedbackTbl;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userTbl")
    public Set<OthercontributionTbl> getOthercontributionTbls() {
        return this.othercontributionTbls;
    }

    public void setOthercontributionTbls(Set<OthercontributionTbl> othercontributionTbls) {
        this.othercontributionTbls = othercontributionTbls;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userTbl")
    public Set<Userevent> getUserevents() {
        return this.userevents;
    }

    public void setUserevents(Set<Userevent> userevents) {
        this.userevents = userevents;
    }

}
