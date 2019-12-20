<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 7/7/2019
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title> SIMPLE CALCULATOR</title>
  </head>
  <body>
  <h2>Calculator</h2>
  <form action="/calculate" method="post">
    <label>First Operand: </label>
    <input type="text" name="FirstOperand" placeholder="FirstOperand" /><br/></br>
    <label>Operator: </label>
    <select name="expression">
      <option value ="Addition">Addition</option>
    </select><br/></br>
    <label> Second Operand: </label>
    <input type="text" name="SecondOperand" placeholder="SecondOperand" />
    <button type="submit" name="Calculator" placeholder="Calculator">Calculate</button>
  </form>
  </body>
</html>
