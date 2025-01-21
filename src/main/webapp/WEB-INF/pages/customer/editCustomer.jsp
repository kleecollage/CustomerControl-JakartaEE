<%--
  Created by IntelliJ IDEA.
  User: mrrobot
  Date: 1/20/25
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
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
    <title>Edit Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
<%-- HEADER --%>
<jsp:include page="/WEB-INF/pages/common/header.jsp" />
<%--UPDATE CUSTOMER FORM--%>
<form action="${pageContext.request.contextPath}/ServletController?action=edit&idCustomer=${customer.id_customer}"
      method="post" class="was-validated">
    <%-- EDITION NAV BUTTONS --%>
    <jsp:include page="/WEB-INF/pages/common/navEditionButtons.jsp" />
    <%-- CARD --%>
    <div class="container my-4">
        <div class="card">
            <div class="card-header bg-primary text-white">
                <h4>Update Customer</h4>
            </div>
            <div class="card-body">
                <div class="form-group mb-3">
                    <label for="name">Name</label>
                    <input type="text" class="form-control" id="name" name="name" required
                        value="${customer.name}">
                </div>
                <div class="form-group mb-3">
                    <label for="surname">Surname</label>
                    <input type="text" class="form-control" id="surname" name="surname" required
                        value="${customer.surname}">
                </div>
                <div class="form-group mb-3">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email" name="email" required
                        value="${customer.email}">
                </div>
                <div class="form-group mb-3">
                    <label for="phone">Phone</label>
                    <input type="text" class="form-control" id="phone" name="phone" required
                        value="${customer.phone}">
                </div>
                <div class="form-group mb-3">
                    <label for="balance">Balance</label>
                    <input type="number" step="any" class="form-control" id="balance" name="balance" required
                        value="${customer.balance}">
                </div>
                <button type="submit" class="btn btn-success me-3">Save Changes</button>
                <a href="${pageContext.request.contextPath}/ServletController?action=delete&idCustomer=${customer.id_customer}"
                   class="btn btn-danger">
                    <i class="bi bi-trash"></i>&nbsp;Delete Customer
                </a>
            </div>
        </div>
    </div>
</form>
<%--FOOTER--%>
<jsp:include page="/WEB-INF/pages/common/footer.jsp" />


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
