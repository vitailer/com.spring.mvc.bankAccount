<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>
    All Employees
</h2>
<br>

<table>
<%--    // создаём таблицу--%>
    <tr>
<%--    <tr>   // новая строка--%>
<%--        <th> // шапка таблицы--%>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>

    </tr>
    <c:forEach var="emp" items="${allEmps}">
<%--        // с помощью лупа выводим всю информацию о работниках--%>
        <c:url var="updateButton" value="/updateInfo">
<%--            внутри этого url мы добавляем информацию о id  работника--%>
            <c:param name="empId" value="${emp.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/deleteEmployee">

            <c:param name="empId" value="${emp.id}"/>
        </c:url>
        <tr>
<%--            <td> Ячейка в таблице--%>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href= '${updateButton}' "/>
<%--                создали кнопку Update для каждого работника, при нажатии на кнопку будем переходить по ссылке updateButton и ссылка содержит в себе id  работника--%>

        <input type="button" value="Delete"
               onclick="window.location.href= '${deleteButton}' "/>
<%--   создали кнопку Delete для каждого работника, при нажатии на кнопку будем переходить по ссылке deleteButton и ссылка содержит в себе id  работника, т.е. будет вызван метод /deleteEmployee--%>
    </td>
        </tr>
    </c:forEach>
</table>
<br>
<%--    будем добавлять кнопку добавления работника
при нажатии кнопки будет вызываться метод addNewEmployee из контроллера
который будет возвращать view "employee-info"--%>
<input type="button" value="Add"
onclick="window.location.href= 'addNewEmployee'"/>
</body>
</html>