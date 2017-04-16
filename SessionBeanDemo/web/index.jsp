<%-- 
    Document   : index.jsp
    Created on : 8 Apr, 2017, 11:44:35 AM
    Author     : arjun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Say Hello</title>
    </head>
    <body>
        <h1>Say Hello</h1>
        <form  method="post" action="SayHelloServlet">
            Enter Your Name: <input type="text" name="name">
            <input type="submit" value="OK">
     </form>
    </body>
</html>
