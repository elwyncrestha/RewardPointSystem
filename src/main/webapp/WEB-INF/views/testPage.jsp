<%-- 
    Document   : 403
    Created on : Sep 2, 2018, 11:59:05 AM
    Author     : elwyn
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="adminPageHeader.jsp"></jsp:include>
        </head>

        <body class="nav-md">
            <div class="container body">
                <div class="main_container">
                    <!-- page content -->
                    <div class="col-md-12">
                        <div class="col-middle">
                            <div class="text-center text-center">
                                <h1 class="error-number">Test</h1>
                            <c:if test="${not empty TestAttribute}"> <h2>Successful</h2></c:if>
                            <c:if test="${empty TestAttribute}"> <h2>Unsuccessful</h2></c:if>
                                <p>Back to Admin Home page. <a href="${pageContext.request.contextPath}/admin/display/home">Click here.</a>
                            </div>
                        </div>
                    </div>
                    <!-- /page content -->
                </div>
            </div>

        <jsp:include page="adminPageFooter.jsp"></jsp:include>
    </body>
</html>