<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/WEB-INF/view/include/page.jsp"%>
<html>
<head>
    <title>Grepp</title>
    <%@include file="/WEB-INF/view/include/static.jsp"%>
</head>
<body>
<%@include file="/WEB-INF/view/include/header.jsp"%>
    <%@include file="/WEB-INF/view/include/sidenav.jsp"%>
<main class="container" >
    <c:if test="${not empty param.attr and param.attr eq 'signup'}">
        <div class="card-panel deep-purple lighten-3 white-text">회원가입을 환영합니다!!</div>
    </c:if>

    <c:if test="${not empty param.error}">
        <div class="card-panel red darken-3 lighten-3 white-text"><%= request.getParameter("error")%></div>
    </c:if>

    <ul class="collection with-header">
        <li class="collection-header"><h4>Welcome JSP</h4></li>
        <li class="collection-item">
            <div>el-base<a href="${context}/el/base" class="secondary-content"><i class="material-icons">send</i></a>
            </div>
        </li>
        <li class="collection-item">
            <div>el-exam<a href="${context}/el/exam" class="secondary-content"><i class="material-icons">send</i></a>
            </div>
        </li>
        <li class="collection-item">
            <div>jstl-base<a href="${context}/jstl/page" class="secondary-content"><i class="material-icons">send</i></a>
            </div>
        </li>
    </ul>
</main>
<%@include file="/WEB-INF/view/include/footer.jsp"%>
</body>
</html>