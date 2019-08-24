<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>Test</title>
</head>
<body>
<center>
    <select name="items">
        <c:forEach items="${itemses}" var="item">
            <option>${item}</option>
        </c:forEach>
    </select>
</center>

<table width="800px" border=1 align="center">
    <tr>
        <td>商品编号</td>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>商品描述</td>
        <td>商品修改</td>
        <td>商品删除</td>

    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td>${item.detail}</td>
            <td><a href="${pageContext.request.contextPath }/selectById.do?id=${item.id}">修改</a></td>
            <td><a href="${pageContext.request.contextPath }/del.do?id=${item.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<button onclick="window.location='add_list.jsp'" style="    width: 65px;
    height: 40px;
    font-size: 20px;
    border-radius: 10px;
    margin-top: 10px;
    margin-left: 50%;">添加
</button>
</body>
</html>