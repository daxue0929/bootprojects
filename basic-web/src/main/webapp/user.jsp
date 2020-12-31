<%@ page import="com.wang.pojo.SysUser" %>
<%@ page import="java.io.PrintWriter" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User</title>
    <script src="/js/jquery.min.js"></script>
</head>
<body>

<%
    SysUser user = (SysUser) request.getAttribute("user");

%>
    <h1>hello world</h1>
    <h2>name:<%out.print(user.getName());%>
    </h2>
<script type="module">
    import {baseUrl} from "./js/config.js"
    console.log(baseUrl)
    // const baseUrl = "http://localhost:8089";
    const url = "/user?id=1";

    let post = $.post(baseUrl + url, function(json) {
        console.log("json: " + json.account);
    });


</script>
</body>
</html>
