<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String contextPath = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + contextPath;
    request.setAttribute("context", contextPath);
    request.setAttribute("basePath", basePath);
%>
<html>
    <body>
        <h3>Welcome to bookstore!</h3>
        <div id="content">
            <p>畅销书排行榜：</p>
            <table>
                <thead>
                    <td>书名</td>
                    <td>原价</td>
                    <td>折后价</td>
                    <td>VIP价格</td>
                </thead>
                <tbody>
                    <c:if test="pupolarBooks != null && pupolarBooks.size() > 0">
                        <c:forEach items="${pupolarBooks}" var="b">
                            <tr>
                                <td>${b.name}</td>
                                <td>${b.originalPrice}</td>
                                <td>${b.discountPrice}</td>
                                <td>${b.vipPrice}</td>
                            </tr>
                        </c:forEach>
                    </c:if>
                </tbody>
            </table>
            <h4>-----------------分割线-----------------------</h4>
            <p>新书排行榜：</p>
            <table>
                <thead>
                    <td>书名</td>
                    <td>原价</td>
                    <td>折后价</td>
                    <td>VIP价格</td>
                </thead>
                <tbody>
                    <c:if test="newestBooks != null && newestBooks.size() > 0">
                        <c:forEach items="${newestBooks}" var="b">
                            <tr>
                                <td>${b.name}</td>
                                <td>${b.originalPrice}</td>
                                <td>${b.discountPrice}</td>
                                <td>${b.vipPrice}</td>
                            </tr>
                        </c:forEach>
                    </c:if>
                </tbody>
            </table>
        </div>

    </body>
</html>