<%--
  Created by IntelliJ IDEA.
  User: mrrobot
  Date: 1/20/25
  Time: 8:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" data-bs-theme="dark">
<head>
    <title>Customers Control</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
<%-- HEADER --%>
<jsp:include page="/WEB-INF/pages/common/header.jsp" />
<%-- NAVIGATION BUTTONS --%>
<jsp:include page="WEB-INF/pages/common/navButtons.jsp" />
<%--CUSTOMERS LIST--%>
<jsp:include page="/WEB-INF/pages/customer/listCustommers.jsp" />
<%-- MODAL TO ADD NEW CLIENT--%>
<jsp:include page="WEB-INF/pages/customer/addCustomer.jsp" />
<%--FOOTER--%>
<jsp:include page="/WEB-INF/pages/common/footer.jsp" />


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
