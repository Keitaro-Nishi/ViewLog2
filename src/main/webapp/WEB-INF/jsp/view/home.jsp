<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
</head>
<body>
    <div id="wrapper">
        <h1>Account Information</h1>
        <table>
            <tr>
                <th>Username</th>
                <td>${f:h(account.username)}</td>
            </tr>
            <tr>
                <th>First name</th>
                <td>${f:h(account.firstName)}</td>
            </tr>
            <tr>
                <th>Last name</th>
                <td>${f:h(account.lastName)}</td>
            </tr>
        </table>
    </div>
</body>
</html>
