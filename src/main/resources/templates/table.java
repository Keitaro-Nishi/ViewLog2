<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/layout :: base_header(~{::link},'Table')">
<link href="/stylesheets/jquery.bootgrid.css" rel="stylesheet" />
</head>

<body>

	<div th:replace="fragments/layout :: header"></div>
<!-- 一覧結果 -->
<table class="table table-striped">
    <thead>
        <tr>
            <th>#</th>
            <th>タスク名</th>
            <th>登録日</th>
            <th>ステータス</th>
        </tr>
    </thead>
    <tbody th:remove="all-but-first" th:each="result : ${action.resultList}">
        <tr th:class="${result['limitdate']} &lt; ${action.systemDate} ? 'danger' : ''">
            <td th:text="${result['id']}">1</td>
            <td><a href="update.html" th:href="@{display(vo.id=${result['id']})}" th:text="${result['name']}">タスク1</a></td>
            <td th:text="${#dates.format(result['writedate'], 'yyyy/MM/dd')}">3/5</td>
            <td th:text="${beans.master.getValue('status',result['status'])}">Open</td>
        </tr>
        <tr>
            <td>2</td>
            <td>タスク2</td>
            <td>3/7</td>
            <td>Close</td>
        </tr>
        <tr>
            <td>3</td>
            <td>タスク3</td>
            <td>1/9</td>
            <td>NotOpen</td>
        </tr>
    </tbody>
</table
