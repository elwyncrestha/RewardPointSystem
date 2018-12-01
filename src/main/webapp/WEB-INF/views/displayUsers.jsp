<%-- 
    Document   : displayUsers
    Created on : Dec 1, 2018, 4:04:40 PM
    Author     : elwyn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

                        <div class="">
                            <div class="row">
                                <div class="col-md-12 col-sm-12 col-xs-12">
                                    <div class="x_panel">
                                        <div class="x_title">
                                            <h2>List of Users<small>Display</small></h2>
                                            <ul class="nav navbar-right panel_toolbox">
                                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                                </li>
                                                <li><a class="close-link"><i class="fa fa-close"></i></a>
                                                </li>
                                            </ul>
                                            <div class="clearfix"></div>
                                        </div>
                                        <div class="x_content">
                                            <p class="text-muted font-13 m-b-30">
                                                This is a responsive Data Table. Results in the table have been optimised for different screen sizes through the dynamic insertion and removal of columns from the table. So, expand to view more details.
                                            </p>
                                        <c:if test="${not empty UserDetails}">
                                            <table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                                                <thead>
                                                    <tr>
                                                        <th>User Id</th>
                                                        <th>First name</th>
                                                        <th>Middle name</th>
                                                        <th>Last name</th>
                                                        <th>Gender</th>
                                                        <th>Date of Birth</th>
                                                        <th>Permanent address</th>
                                                        <th>Temporary address</th>
                                                        <th>Username</th>
                                                        <th>Password</th>
                                                        <th>Activation Status</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach items="${UserDetails}" var="ud">
                                                        <tr>
                                                            <td>${ud.userId}</td>
                                                            <td>${ud.userFname}</td>
                                                            <td>${ud.userMname}</td>
                                                            <td>${ud.userLname}</td>
                                                            <td>${ud.userGender}</td>
                                                            <td>${ud.userDob}</td>
                                                            <td>${ud.userPaddress}</td>
                                                            <td>${ud.userTaddress}</td>
                                                            <td>${ud.userUsername}</td>
                                                            <td>${ud.userPassword}</td>
                                                            <td>${ud.active}</td>
                                                        </tr>
                                                    </c:forEach>
                                                </tbody>
                                            </table>
                                        </c:if>
                                        <c:if test="${empty UserDetails}">
                                            <h1>No data</h1>
                                        </c:if>
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

