<%-- 
    Document   : home
    Created on : Aug 27, 2018, 11:45:20 AM
    Author     : elwyn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="adminPageHeader.jsp"></jsp:include>
        </head>
        <body class="nav-md">
            <div class="container body">
                <div class="main_container">
                    <!-- side navigation -->
                <jsp:include page="adminSideNav.jsp"></jsp:include>
                    <!-- /side navigation -->

                    <!-- top navigation -->
                <jsp:include page="adminTopNav.jsp"></jsp:include>
                    <!-- /top navigation -->

                    <!-- page content -->
                    <div class="right_col" role="main">
                        <!-- top tiles -->
                        <div class="row tile_count">
                            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
                                <span class="count_top"><i class="fa fa-users"></i> Total Students</span>
                                <div class="count">2500</div>
                                <span class="count_bottom"><i class="green">4% </i> From last Week</span>
                            </div>
                            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
                                <span class="count_top"><i class="fa fa-male"></i> Total Males</span>
                                <div class="count green">2,500</div>
                                <span class="count_bottom"><i class="green"><i class="fa fa-sort-asc"></i>34% </i> From last Week</span>
                            </div>
                            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
                                <span class="count_top"><i class="fa fa-female"></i> Total Females</span>
                                <div class="count">4,567</div>
                                <span class="count_bottom"><i class="red"><i class="fa fa-sort-desc"></i>12% </i> From last Week</span>
                            </div>
                            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
                                <span class="count_top"><i class="fa fa-laptop"></i> Total Workshops</span>
                                <div class="count">123.50</div>
                                <span class="count_bottom"><i class="green"><i class="fa fa-sort-asc"></i>3% </i> From last Week</span>
                            </div>
                            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
                                <span class="count_top"><i class="fa fa-calendar-check-o"></i> Total Events</span>
                                <div class="count">2,315</div>
                                <span class="count_bottom"><i class="green"><i class="fa fa-sort-asc"></i>34% </i> From last Week</span>
                            </div>
                            <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
                                <span class="count_top"><i class="fa fa-line-chart"></i> Total Student Login</span>
                                <div class="count">7,325</div>
                                <span class="count_bottom"><i class="green"><i class="fa fa-sort-asc"></i>34% </i> From last Week</span>
                            </div>
                        </div>
                        <!-- /top tiles -->
                        <div class="">
                            <div class="row">
                                <div class="col-md-12 col-sm-12 col-xs-12">
                                    <div class="x_panel">
                                        <div class="x_title">
                                            <h2>Plain Page</h2>
                                            <ul class="nav navbar-right panel_toolbox">
                                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                                </li>
                                                <li class="dropdown">
                                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                                                    <ul class="dropdown-menu" role="menu">
                                                        <li><a href="#">Settings 1</a>
                                                        </li>
                                                        <li><a href="#">Settings 2</a>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li><a class="close-link"><i class="fa fa-close"></i></a>
                                                </li>
                                            </ul>
                                            <div class="clearfix"></div>
                                        </div>
                                        <div class="x_content">
                                            Add content to the page ...
                                            <a href="${pageContext.request.contextPath}/admin/test/usertype">TEST</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /page content -->

                    <!-- footer content -->
                <jsp:include page="adminFooter.jsp"></jsp:include>
                    <!-- /footer content -->
                </div>
            </div>

        <jsp:include page="adminPageFooter.jsp"></jsp:include>
    </body>
</html>
