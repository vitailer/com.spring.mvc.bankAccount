<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Employee Info</h2>
<br>
<%--мы заполняем данные о работнике, нажимаем на кнопку Ок и вызывается action="/saveEmployee", за который отвечает метод saveEmployee()--%>
<form:form action="saveEmployee" modelAttribute="employee">
<%--    создаём скрытую форму для  id--%>
    <form:hidden path="id"/>
<%--    теперь при изменении работника, мы передаём из базы данныз и его id, которое скрыто--%>
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Department <form:input path="department"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    <input type="submit" value="Ok">
</form:form>
</body>
</html>