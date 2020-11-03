<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/10/23
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/common/head.jsp"></jsp:include>
    <title>注册</title>
</head>
<body>
    <h1>用户注册,ts=<%=System.currentTimeMillis()%></h1>
    <f:form modelAttribute="user" action="${ctx}/user/toReg">
        用户名:<f:input path="userName"/><f:errors path="userName"/> <br>
        密码:<f:input path="password"/><f:errors path="password"/><br>
        密码:<f:input path="password2"/><f:errors path="password2"/><br>
        <input type="submit" value="提交">
    </f:form>
</body>
</html>
