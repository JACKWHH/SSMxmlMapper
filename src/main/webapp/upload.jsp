<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action= "${pageContext.request.contextPath }/upload.do" method="post" enctype="multipart/form-data" >
    <input type="file" name="files">
    <input type="submit" value="提交">
</form>

</body>
</html>
