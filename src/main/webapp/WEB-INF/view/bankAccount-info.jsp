<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Bank Account Info</h2>
<br>

<form:form action="saveBankAccount" modelAttribute="bankAccount">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Department <form:input path="department"/>
    <br><br>
    SumOfMoney <form:input path="sumOfMoney"/>
    <br><br>
    <input type="submit" value="Ok">
</form:form>
</body>
</html>