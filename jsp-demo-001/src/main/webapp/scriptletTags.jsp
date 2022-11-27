<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scriptlet Tags</title>
</head>
<body>
<h2>Scriptlet Tag </h2>
<ul>
  <li>We can define variables in this</li>
  <li>this will be part of service method</li>
</ul>
  <%
    int variable = 30;
//    void method(){}
    for (int i = 1; i <=10 ; i++) {
      out.println(i);
    }
  %>
<hr/>
<h2>Statement or Expression Tag </h2>
<ul>
  <li>Expression tag is similar to System.out.println()</li>
  <li>We cannot define variables of methods inside the expression tag</li>
</ul>
  <%=(10+60*56)%>
<hr>

<h2>Declaration tag </h2>
<ul>
  <li>Declaration tag is used to define variables and methods</li>
  <li>Methods and variable will be of type instance</li>
</ul>
<%!
  int instanceVariable=100;
  void instanceMethod(){
    System.out.println("Instance method of generated servlet and we can call this method from service");
  }
%>
<hr/>
using variables and methods defined inside the declaration
<%
  out.println("Instance variables "+instanceVariable);
  instanceMethod();

%>

</body>
</html>
