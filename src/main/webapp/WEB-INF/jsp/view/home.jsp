<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"% >
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags " %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="css/default.css" type="text/css" />
<title>トップページ</title>
</head>
<body>
<a href="logout">ログアウト</a>
<br />

<sec:authorize ifAnyGranted="ROLE_ADMIN">
<a href="editUser.do">管理者のみがリンク表示されます</a><br />
</sec:authorize>


</body>
</html>