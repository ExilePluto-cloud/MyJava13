<%--
  Created by IntelliJ IDEA.
  User: dd
  Date: 2020/11/2
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <link rel="stylesheet" type="text/css" href="src/css/admin_login.css"/>
</head>
<body>
<div class="admin_login_wrap">
    <h1>登录</h1>
    <div class="adming_login_border">
        <div class="admin_input">
            <form action="/bookstore_war_exploded/configDemo.do3" method="post">
                <ul class="admin_items">
                    <li>
                        <label for="user">姓名：</label>
                        <input type="text" name="username" value="admin" id="user" size="40" class="admin_input_style" />
                    </li>
                    <li>
                        <label for="pwd">学号：</label>
                        <input type="password" name="id" value="admin" id="pwd" size="40" class="admin_input_style" />
                    </li>
                    <li>
                        <input type="submit" tabindex="3" value="提交" class="btn btn-primary" />
                        <input type="reset"  value="重置" class="btn btn-primary" />
                    </li>
                </ul>
            </form>
        </div>
    </div>
</div>

</body>
</html>
<!DOCTYPE html>