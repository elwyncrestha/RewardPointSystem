/* actual database */
use rewardpointsystem;
show tables;

/* database for hibernate reverse engineering */
create database pojodemo;
use pojodemo;

create table UserType_tbl
(
	userTypeId int not null primary key auto_increment,
    userTypeName varchar(255) not null
);

create table StudentBatch_tbl
(
	batchId int not null primary key auto_increment,
    batchName varchar(255) not null
);

create table User_tbl
(
	userId int not null primary key auto_increment,
    userFName varchar(255) not null,
    userMName varchar(255),
    userLName varchar(255) not null,
    userDOB date not null,
    userGender char not null,
    userPAddress varchar(255) not null,
    userTAddress varchar(255) not null,
    userUsername varchar(255) not null,
    userPassword varchar(255) not null,
    userTypeId int not null,
    batchId int not null,
    constraint fk_User_tbl_userTypeId foreign key (userTypeId) references UserType_tbl(userTypeId) on delete cascade,
    constraint fk_User_tbl_batchId foreign key (batchId) references StudentBatch_tbl(batchId) on delete cascade
);

create table Attendance_tbl
(
	userId int not null,
    totalPresent int not null,
	totalActiveDays int not null,
    attendanceDate date not null,
    constraint fk_Attendance_tbl_userId foreign key (userId) references User_tbl(userId) on delete cascade,
    constraint pk_Attendance_tbl primary key (userId,attendanceDate)
);

create table AcademicsAchievement_tbl
(
	userId int not null,
    marksObtained int not null,
    semester int not null,
    constraint fk_AcademicsAchievement_tbl_userId foreign key (userId) references User_tbl(userId) on delete cascade,
    constraint pk_AcademicsAchievement_tbl primary key (userId,semester)
);

create table OtherContribution_tbl
(
	userId int not null,
    contributionName varchar(255) not null,
    contributionDate date not null,
    constraint fk_OtherContribution_tbl_userId foreign key (userId) references User_tbl(userId) on delete cascade,
    constraint pk_OtherContribution_tbl primary key (userId,contributionName,contributionDate)
);

create table TeacherFeedback_tbl
(
	userId int not null,
    feedbackPoint int not null,
    constraint fk_TeacherFeedback_tbl_userId foreign key (userId) references User_tbl(userId) on delete cascade,
    constraint pk_TeacherFeedback_tbl primary key (userId)
);

create table Workshop_tbl
(
	workshopId int not null primary key auto_increment,
    workshopName varchar(255) not null,
    workshopStartDate date not null,
    workshopEndDate date,
    targetedSemester int not null,
    workshopType varchar(255) not null
);

create table Event_tbl
(
	eventId int not null primary key auto_increment,
    eventName varchar(255) not null,
    eventStartDate date not null,
    eventEndDate date not null,
    minRewardPoint int not null
);

create table SpecialPrivilege_tbl
(
	privilegeId int not null primary key auto_increment,
    privilegeName varchar(255) not null
);

create table UserWorkshop
(
	userId int not null,
    workshopId int not null,
    workshopPerformance int not null,
    constraint fk_UserWorkshop_userId foreign key (userId) references User_tbl(userId) on delete cascade,
    constraint fk_UserWorkshop_workshopId foreign key (workshopId) references Workshop_tbl(workshopId) on delete cascade,
    constraint pk_UserWorkshop primary key (userId, workshopId)
);

create table UserEvent
(
	userId int not null,
    eventId int not null,
    eventPerformance int not null,
    constraint fk_UserEvent_userId foreign key (userId) references User_tbl(userId) on delete cascade,
    constraint fk_UserEvent_eventId foreign key (eventId) references Event_tbl(eventId) on delete cascade,
    constraint pk_UserEvent primary key (userId,eventId)
);

create table UserPrivilege
(
	userId int not null,
    privilegeId int not null,
    constraint fk_UserPrivilege_userId foreign key (userId) references User_tbl(userId) on delete cascade,
    constraint fk_UserPrivilege_privilegeId foreign key (privilegeId) references SpecialPrivilege_tbl(privilegeId) on delete cascade,
    constraint pk_UserPrivilege primary key (userId,privilegeId)
);

show tables;