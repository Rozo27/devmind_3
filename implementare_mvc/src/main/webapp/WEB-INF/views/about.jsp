<%--
  Created by IntelliJ IDEA.
  User: Rozoleanu Andreea
  Date: 3/23/2022
  Time: 8:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>About my page</title>
</head>
<body>
<p>Descrierea este: ${description}.</p><br>
<p>Proprietarul este: ${owner}.</p>
<p>Adresa este: ${address}.</p>
<p>${pageContext.request.contextPath}</p>
<img src="${pageContext.request.contextPath}/images/about-text.png">
<img src="/images/about-text.png">
<p>Ana are mere</p>
</body>
</html>
