<!doctype HTML>
<html xmlns:th="http://www.thymeleaf.org">
<title>Euromil generator</title>
<head>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Comfortaa&display=swap" rel="stylesheet">
	<link rel="stylesheet" th:href="@{/css/style.css}">
</head>
<body>
<div class="title">
	<h1>Euromilhões</h1>
</div>
<div th:class="column" id="numeros">
	<div th:each="index,initSeq : ${#numbers.sequence(1,50)}" th:text="${index}">
	</div>
</div>
<div th:class="column" id="estrelas">
	<div th:each="index,initSeq : ${#numbers.sequence(1,12)}" th:text="${index}">
	</div>
</div>
<div class="column mt">
	<button id="generate-btn" th:class="button" th:text="Generate"></button>
</div>
<script th:src="@{/js/scripts.js}" type="text/javascript"></script>
</body>
</html>