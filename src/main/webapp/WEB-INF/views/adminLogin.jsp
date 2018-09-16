<%-- 
    Document   : adminLogin
    Created on : Aug 31, 2018, 2:39:29 PM
    Author     : elwyn
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="adminPageHeader.jsp"></jsp:include>
        </head>
        <body class="login">
            <div>
                <a class="hiddenanchor" id="signup"></a>
                <a class="hiddenanchor" id="signin"></a>

                <div class="login_wrapper">
                    <div class="animate form login_form">
                        <section class="login_content">
                            <form action="<c:url value = '/perform_login' />" method="POST">
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                            <h1>Login Form</h1>
                            <div>
                                <input type="text" class="form-control" placeholder="Username" name="username" required="" autofocus />
                            </div>
                            <div>
                                <input type="password" class="form-control" placeholder="Password" name="password" required="" />
                            </div>
                            <div>
                                <input type="submit" class="btn btn-default submit" value="Log in">
                                <a class="reset_pass" href="#">Lost your password?</a>
                            </div>

                            <div class="clearfix"></div>

                            <div class="separator">
                                <p class="change_link">New to site?
                                    <a href="#signup" class="to_register"> Create Account </a>
                                </p>

                                <div class="clearfix"></div>
                                <br />

                                <div>
                                    <h1><i class="fa fa-graduation-cap"></i> Reward Point System</h1>
                                    <p>©2018 All Rights Reserved. Privacy and Terms</p>
                                </div>
                            </div>
                        </form>
                    </section>
                </div>

                <div id="register" class="animate form registration_form">
                    <section class="login_content">
                        <form action="${pageContext.request.contextPath}/register" method="POST">
                            <h1>Create Account</h1>
                            <div class="form-group">
                                <input type="text" class="form-control" name="userId" placeholder="Id" required="" />
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="userFName" placeholder="First name" required="" />
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="userMName" placeholder="Middle name" />
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="userLName" placeholder="Last name" required="" />
                            </div>
                            <div class="form-group">
                                <p class="help-block">Insert date of birth here</p>
                                <input type="date" class="form-control" name="userDOB" required="" />
                            </div>
                            <div class="form-group">
                                <p class="help-block">Choose gender</p>
                                <input type="radio" class="radio-inline" value="M" name="userGender"> Male &nbsp;
                                <input type="radio" class="radio-inline" value="F" name="userGender"> Female &nbsp;
                                <input type="radio" class="radio-inline" value="O" name="userGender"> Others &nbsp;
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="userPAddress" placeholder="Permanent address" required="">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="userTAddress" placeholder="Temporary address" required="">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="userUsername" placeholder="Username" required="" />
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="userPassword" placeholder="Password" required="" />
                            </div>
                            <div>
                                <input type="submit" class="btn btn-default submit" value="Submit">
                            </div>

                            <div class="clearfix"></div>

                            <div class="separator">
                                <p class="change_link">Already a member ?
                                    <a href="#signin" class="to_register"> Log in </a>
                                </p>

                                <div class="clearfix"></div>
                                <br />

                                <div>
                                    <h1><i class="fa fa-graduation-cap"></i> Reward Point System</h1>
                                    <p>©2018 All Rights Reserved. Privacy and Terms</p>
                                </div>
                            </div>
                        </form>
                    </section>
                </div>
            </div>
        </div>
    </body>
</html>
