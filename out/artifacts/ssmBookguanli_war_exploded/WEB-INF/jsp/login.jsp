<%@ page import="org.springframework.ui.Model" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>登录界面</title>
</head>
<body>
<center>
    <h1 style="color:red">登录</h1>
    <p>${msg}</p>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <table border="0">
            <tr>
                <td>账号：</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password">
                </td>
            </tr>
        </table>
        <br>
        <input type="submit" value="登录" style="color:#BC8F8F">
    </form>

    <form action="zhuce.jsp">
        <input type="submit" value="注册" style="color:#BC8F8F">
    </form>
</center>
</body>
</html>
