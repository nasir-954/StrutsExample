<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<s:form method="Get" action="login.action">
		<table>
			<tr>
				<td>Enter Username:</td>
				<td><s:text name="userName"></s:text></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><s:password name="password"></s:password></td>
			</tr>
			<tr>
				<td></td><td><s:submit/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>