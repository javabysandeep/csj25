<%@ page contentType="text/html;charset=UTF-8" language="java"
         errorPage="error.jsp" %>
<html>
<head>
    <title>calculator</title>
</head>
<body>
  <%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operation = request.getParameter("operation");
    int result = 0;
    switch (operation){
      case "+": result= number1+number2; break;
      case "-": result= number1-number2; break;
      case "*": result= number1*number2; break;
      case "/": result= number1/number2; break;
      case "%": result= number1%number2; break;
      default:
        out.println("Invalid Operation");
    }
    out.println("Result = "+result);

  %>
</body>
</html>
