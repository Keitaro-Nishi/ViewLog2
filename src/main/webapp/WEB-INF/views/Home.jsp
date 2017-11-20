<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/layout2 :: base_header(~{::link},'index')">
<link href="/stylesheets/jquery.bootgrid.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="/stylesheets/Buttons.css" />

<style>
.myform {
	width: 730px;
	margin: 0 auto;
}
</style>

</head>
<body>
	<div th:replace="fragments/layout :: header"></div>
	<div align="center">
	<br>
	<br>
	<br>
	<br>
		<button onclick="location.href='/logview'" class="button5" type="submit">チャットボットログ</button>
		<br>
		<br>
		<br>
		<button onclick="location.href='/logview'" class="button5" type="submit">フォトログ</button>
		<br>
		<br>
		<br>
		<button onclick="location.href='/viewlog/logout'" class="button5" type="submit">ランキング</button>
		<br>
		<br>
		<br>
		<button onclick="location.href='/Account'" class="button5 chrome Safari" type="submit">アカウント管理</button>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="/js/jquery.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>