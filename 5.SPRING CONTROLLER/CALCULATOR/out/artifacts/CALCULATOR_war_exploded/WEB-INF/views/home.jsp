<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 7/11/2019
  Time: 8:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CALCULATOR</title>
</head>
<body>
<form action="calculate" method="get">
    <label>First Operand: </label>
    <input type="text" name="FirstOperand" placeholder="FirstOperand" /><br/></br>
    <label> Second Operand: </label>
    <input type="text" name="SecondOperand" placeholder="SecondOperand" />

    <label>Operator: </label>
        <input type="submit" name = "Operator" value ="Addition">Addition</input>
        <input type="submit" name = "Operator" value ="Subtraction">Subtraction</input>
        <input type="submit" name = "Operator" value ="Multiplication">Multiplication</input>
        <input type="submit" name = "Operator"  value ="Division">Division</input>
    <br/></br>

    <h1>RESULT: ${result}</h1>
</form>

</body>
</html>
