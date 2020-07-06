<%--
  Created by IntelliJ IDEA.
  User: 13294
  Date: 2020/4/22
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <h3>查询成功了</h3>
<c:forEach items="${list}" var="account">
   ${account.name}
</c:forEach>

</body>
</html>
