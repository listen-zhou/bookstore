<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String context = request.getContextPath();
    request.setAttribute("context", context);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<a href="<c:url value="/index.jsp"/>">首页</a>&nbsp;&nbsp;
<a href="<c:url value="/WEB-INF/views/register.jsp"/>">注册</a>

<c:if test="${!empty errorMsg}">
    <div style="color:red">${errorMsg}</div>
</c:if>
<form action="${context}/login/doLogin.html" method="post">
    <table border="1px">
        <tr>
            <td width="20%">用户名</td>
            <td width="80%"><input type="text" name="userName"/></td>
        </tr>
        <tr>
            <td width="20%">密码</td>
            <td width="80%"><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="登录">
                <input type="reset" value="重置">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
