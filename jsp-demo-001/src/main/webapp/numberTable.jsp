<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table of Numbers</title>
</head>
<body>
<table border="10px" bgcolor="#faebd7" >
    <%
        for (int i = 1; i <= 10; i++) {


    %>
    <tr>
        <%
            for (int j = 1; j <= 30; j++) {

        %>
        <td><%=i * j%></td>
        page
        <%}%>
    </tr>

    <%
        }
    %>

</table>

</body>
</html>
