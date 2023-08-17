<%--
  Created by IntelliJ IDEA.
  User: jianrui
  Date: 2023/8/15
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <form action="/upload" method="post" enctype="multipart/form-data">
     <input type='file' name="file"/>
     <input type='submit' name="upload"/>
 </form>
</body>
</html>
