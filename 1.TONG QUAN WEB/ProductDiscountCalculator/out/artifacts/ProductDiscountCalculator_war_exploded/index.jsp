<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 7/5/2019
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
</head>
<body>
<h1>Product Discount Calculator </h1>
<form action="/convert" method="post">
  <label>Product Description: </label><br/>
  <input type="text" name="Description" placeholder="Description" /><br/>
  <label>List Price: </label><br/>
  <input type="text" name="Price" placeholder="Price" /><br/>
  <label>Discount Percent: </label><br/>
  <input type = "text" id = "Discount Percent:" value = "Discount Percent:" name="DiscountPercent"/>
  <input type = "submit" id = "DiscountAmount" value = "DiscountAmount"/><h3>%</h3>
</form>
</body>
</html>
