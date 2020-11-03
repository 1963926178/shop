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
    <title>新增书本</title>
</head>
<body>
    <h1>书本新增.ts=<%=System.currentTimeMillis()%></h1>
    <c:if test="${msg != null}">
        ${msg}
        <c:remove var="msg"></c:remove>
    </c:if>
    <f:form modelAttribute="book" action="${ctx}/book/add">
        书名:<f:input path="bookName"/><br>
        价格:<f:input path="price"/><br>
        <input type="submit" value="提交">
    </f:form>
</body>
</html>
