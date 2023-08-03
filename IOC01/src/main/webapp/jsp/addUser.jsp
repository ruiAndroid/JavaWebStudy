<%@ page contentType="text/html;charset=utf-8" pageEncoding="UTF-8"%>
<html>
<body>
<form action="/user/adduser" method="post">
    <table>

        <tr>
            <td>用户名:</td>
            <td><input type="text" name="userName"></td>

        </tr>
        <tr>
            <td>性别:</td>
            <td><input type="text" name="gender"></td>

        </tr>
        <tr>
            <td><input type="submit" value="添加"></td>

        </tr>
    </table>

</form>
</body>
</html>
