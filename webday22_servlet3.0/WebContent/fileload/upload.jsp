<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>文件上传页面</h1>
<form action="${pageContext.request.contextPath }/FileUploadServlet" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td>文件描述:</td>
			<td><input type="text" name="filedesc"></td>
		</tr>
		<tr>
			<td>选择文件</td>
			<td><input type="file" name="upload"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="上传"></td>
		</tr>
	</table>
</form>
</body>
</html>