<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />"
          rel="stylesheet">
    <link href="<c:url value="/css/table-style.css" />" rel="stylesheet">
    <script src="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js" />"></script>
    <script src="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" />"></script>
    <title>Title</title>
</head>
<body>
<table class="table">
    <c:forEach items="${requestScope.users}" var="user">
        <tr class="${user.style}">
            <td><c:out value="${user.id}"/></td>
            <td><c:out value="${user.name}"/></td>
            <td><c:out value="${user.age}"/></td>
            <td><c:out value="${user.height}"/></td>
        </tr>
    </c:forEach>
</table>
<div class="container">
    <form id="contact" action="/hello/users" method="post">
        <h3>New person</h3>
        <h4>Hello</h4>
        <fieldset>
            <input name="name" placeholder="Имя" type="text" tabindex="1" required autofocus>
        </fieldset>
        <fieldset>
            <input name="age" placeholder="Возраст" type="text" tabindex="2" required>
        </fieldset>
        <fieldset>
            <input name="height" placeholder="Рост" type="text" tabindex="3" required>
        </fieldset>
        <fieldset>
            <input name="style" placeholder="Стиль" type="text" tabindex="4" required>
        </fieldset>
        <fieldset>
            <button name="submit" type="submit">Submit</button>
        </fieldset>
        <p class="copyright">Designed by <a href="https://colorlib.com" target="_blank" title="Colorlib">Colorlib</a></p>
    </form>
</div>
</body>
</html>
