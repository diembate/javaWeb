<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 7/10/2019
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>SANDWICH CONDIMENTS</title>
</head>
<body>
<c:forEach var="condiment" items="${condiments}"><h2>${condiment}</h2></c:forEach>

</body>
</html>
