<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 7/10/2019
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SANDWICH CONDIMENTS</title>
</head>
<body>

<form action="/save" method=get>
    <h1>SANDWICH CONDIMENTS</h1>
    <h2>Please choose condiments</h2>

    <input type="checkbox" name="condiments" value="Lettuce">Lettuce
    <input type="checkbox" name="condiments" value="Tomato">Tomato
    <input type="checkbox" name="condiments" value="Mustard">Mustard
    <input type="checkbox" name="condiments" value="Sprouts">Sprouts </br>
    <button type="submit"  value="Save">Save</button>
</form>
</body>
</html>
