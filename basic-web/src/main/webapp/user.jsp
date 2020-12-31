<%@ page import="com.wang.pojo.SysUser" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User</title>
</head>
<body>

<%
    SysUser user = (SysUser) request.getAttribute("user");
%>
    <h1>hello world</h1>
    <h2>name:<%out.print(user.getName());%>
    </h2>
</body>
</html>
