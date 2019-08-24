<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<form action="add.do" method="post">
    <table width="800px" border=1 align="center">
        <tr>

            <td>商品名称</td>
            <td>商品价格</td>
            <td>商品描述</td>


        </tr>

            <tr>
                <td><input type="text" name="name"></td>
                <td><input type="text" name="price"></td>
                <td><input type="text" name="detail"></td>
            </tr>
    </table>
    <input type="submit" value="提交" style="width: 65px;
    height: 40px;
    font-size: 20px;
    border-radius: 10px;
    margin-top: 10px;
    margin-left: 50%;">
</form>

</body>
</html>
