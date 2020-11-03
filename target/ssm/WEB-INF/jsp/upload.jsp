<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/10/23
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="/common/head.jsp"></jsp:include>
</head>
<body>
    <div>${name}</div>
    <div><h1>图片上传,ts<%=System.currentTimeMillis()%></h1></div>

    <form action="${ctx}/file/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="img">
        <input type="submit" value="提交">
    </form>
</body>
</html>
