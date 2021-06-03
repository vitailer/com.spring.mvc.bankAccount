<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>
    All Bank Accounts
</h2>
<br>

<table>
    <tr>

        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>SumOfMoney</th>
        <th>Operations</th>

    </tr>
    <c:forEach var="account" items="${allAccounts}">
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="bank_accountId" value="${account.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/deleteBankAccount">

            <c:param name="bank_accountId" value="${account.id}"/>
        </c:url>
        <tr>
            <td>${account.name}</td>
            <td>${account.surname}</td>
            <td>${account.department}</td>
            <td>${account.sumOfMoney}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href= '${updateButton}' "/>

        <input type="button" value="Delete"
               onclick="window.location.href= '${deleteButton}' "/>
    </td>
        </tr>
    </c:forEach>
</table>
<br>

<input type="button" value="Add"
onclick="window.location.href= 'addNewBankAccount'"/>
</body>
</html>