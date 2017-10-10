<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/layout :: base_header(~{::link},'index')">
<link href="/stylesheets/jquery.bootgrid.css" rel="stylesheet" />
</head>
<body>
	<div th:replace="fragments/layout :: header"></div>
	<div id="disp">この文章を表示したり消したりします。</div>

	<form>
		<input type="button" value="表示" onclick="hyoji1(0)"> <input
			type="button" value="非表示" onclick="hyoji1(1)">
	</form>

	<script>
		function hyoji1(num) {
			if (num == 0) {
				document.getElementById("disp").style.display = "block";
			} else {
				document.getElementById("disp").style.display = "none";
			}
		}
	</script>
</body>
</html>
