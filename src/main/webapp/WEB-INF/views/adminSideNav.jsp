<%-- 
    Document   : adminNav
    Created on : Aug 31, 2018, 8:30:38 AM
    Author     : elwyn
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"></c:set>

    <div class="col-md-3 left_col menu_fixed">
        <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
                <a href="${cp}/admin/display/home" class="site_title"><i class="fa fa-graduation-cap"></i> <span>Reward Point System</span></a>
        </div>

        <div class="clearfix"></div>

        <!-- menu profile quick info -->
        <div class="profile clearfix">
            <div class="profile_pic">
                <img src="<c:url value="/resources/production/images/img.jpg"></c:url>" alt="..." class="img-circle profile_img">
                </div>
                <div class="profile_info">
                    <span>Welcome,</span>
                    <h2>John Doe</h2>
                </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                <div class="menu_section">
                    <h3>General</h3>
                    <ul class="nav side-menu">
                        <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                            <ul class="nav child_menu">
                                <li><a href="${cp}/admin/display/home">Dashboard</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-users"></i> Students <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="#">Add Student</a></li>
                            <li><a href="#">Display Students</a></li>
                            <li><a href="#">Add Student's Batch</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-calendar"></i> Attendance <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="#">Add attendance</a></li>
                            <li><a href="#">Display attendance</a></li>
                            <li><a href="#">Edit attendance</a></li>
                            <li><a href="#">Delete attendance</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-book"></i> Academics <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="#">Display results</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-pencil-square-o"></i> Teacher Feedback <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="#">Add Feedback</a></li>
                            <li><a href="#">Display Feedbacks</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-laptop"></i> Workshops <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="#">Display Performance</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-calendar-check-o"></i> Events <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="#">Display Performance</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-wheelchair"></i> Special Privilege <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="#">Display Performance</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <div class="menu_section">
                <h3>Management</h3>
                <ul class="nav side-menu">
                    <li><a><i class="fa fa-user-secret"></i> Users <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a>User Details<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li class="sub_menu"><a href="#">Display Users</a></li>
                                    <li><a href="#">Edit Users</a></li>
                                </ul>
                            </li>
                            <li><a>User Type<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li class="sub_menu"><a href="#">Add User Type</a></li>
                                    <li class="sub_menu"><a href="#level2_1">Display User Types</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-desktop"></i> Manage Workshops <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="#">Add Workshop</a></li>
                            <li><a href="#">Display Workshops</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-calendar-plus-o"></i> Manage Events <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="#">Add Event</a></li>
                            <li><a href="#">Display Events</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-wheelchair-alt"></i> Manage Privileges <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="#">Add Privilege</a></li>
                            <li><a href="#">Display Privileges</a></li>
                        </ul>
                    </li>
                    <li><a href="javascript:void(0)"><i class="fa fa-archive"></i> Archive <span class="label label-success pull-right">Coming Soon</span></a></li>
                </ul>
            </div>

        </div>
        <!-- /sidebar menu -->

        <!-- /menu footer buttons -->
        <div class="sidebar-footer hidden-small">
            <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
            </a>
            <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
            </a>
            <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
            </a>
            <a data-toggle="tooltip" data-placement="top" title="Logout" href="#" onclick="document.forms.namedItem('logoutForm').submit()">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
            </a>
        </div>
        <!-- /menu footer buttons -->
    </div>
</div>