<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 7/15/2019
  Time: 8:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Spring MVC 5 - form handling | Java Guides</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />"
          rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
<div class="container">
    <div class="col-md-offset-2 col-md-7">
        <h3 class="text-center">Spring MVC 5 + Spring Data JPA 2 + JSP + MySQL
            Example - BLOG Management</h3>
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Add BLOG</div>
            </div>
            <div class="panel-body">
                <form:form action="saveBlog" cssClass="form-horizontal"
                           method="post" modelAttribute="blog">

                    <form:hidden path="id" />

                    <div class="form-group">
                        <label for="name_blog" class="col-md-3 control-label">
                            name_blog</label>
                        <div class="col-md-9">
                            <form:input path="name_blog" cssClass="form-control" />
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="content" class="col-md-3 control-label">Content</label>
                        <div class="col-md-9">
                            <form:input path="content" cssClass="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="author" class="col-md-3 control-label">author</label>
                        <div class="col-md-9">
                            <form:input path="author" cssClass="form-control" />
                        </div>
                    </div>

                    <div class="form-group">
                        <!-- Button -->
                        <div class="col-md-offset-3 col-md-9">
                            <form:button cssClass="btn btn-primary">Submit</form:button>
                        </div>
                    </div>

                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>