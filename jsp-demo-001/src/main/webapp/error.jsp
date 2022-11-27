<%@ page contentType="text/html;charset=UTF-8" language="java"
         isErrorPage="true"
%>
<html>
<head>
    <title>error handling</title>
</head>
<body>
<h1 style="color: red"> Exception occurred due to
    <%
        out.println(exception.getMessage());
    %>
</h1>
</body>
</html>
