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
</head>
<body>
    <div>${name}</div>
    <div>springmvc,ts<%=System.currentTimeMillis()%></div>

    <div>
        <ul>
            <li>
                <img src="<%=request.getContextPath()%>/images/1.jpg">
            </li>
            <li>
                <img src="<%=request.getContextPath()%>/img/2.jpg">
            </li>
        </ul>
    </div>
</body>
</html>
