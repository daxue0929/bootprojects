<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    out.println(request.getAttribute("currentTime"));

%>
    <h1>hello world</h1>
    <h2>${requestScope.currentTime}</h2>
</body>
</html>
