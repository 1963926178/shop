<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/10/23
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <jsp:include page="/common/head.jsp"></jsp:include>
    <title><t:message code="lable.title"></t:message></title>
</head>
<body>
    <h1><t:message code="lable.title"></t:message></h1>
    <div>
        <a href="${ctx}/sys/i18n?local=zh">中文</a>
        <a href="${ctx}/sys/i18n?local=en">英文</a>
    </div>
    <a href="${ctx}/book/add"><t:message code="lable.msg1"></t:message></a>
    <a href="${ctx}/book/load"><t:message code="lable.msg2"></t:message></a>
    <br>
<a href="${ctx}/file/toUpload">上传图片</a>
</body>
</html>
