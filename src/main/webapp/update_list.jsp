<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>修改</title>
</head>
<body>
<form action="update.do" method="post" >
    <table width="800px" border=1 align="center">
        <tr>

            <td>商品编号</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>商品描述</td>


        </tr>
        <tr>
            <td><input type="hidden" name="id" value="${itemb.id }">${itemb.id }</td>
            <td><input type="text" name="name" value="${itemb.name }"></td>
            <td><input type="text" name="price" value="${itemb.price }"></td>
            <td><input type="text" name="detail" value="${itemb.detail}"></td>

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