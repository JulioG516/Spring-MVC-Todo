<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
<div class="container">
    <h1>Login</h1>
    <form method="post">
        <label for="username">Username </label><input type="text" name="name" id="name">
        <label for="password">Password </label><input type="password" name="password" id="password">
        <button type="submit">Login</button>
    </form>
</div>


<script src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
<script src="webjars\jquery\3.6.0\jquery.min.js"></script>
</body>
</html>