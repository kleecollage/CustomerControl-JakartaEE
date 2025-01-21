<%--
  Created by IntelliJ IDEA.
  User: mrrobot
  Date: 1/20/25
  Time: 8:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--CUSTOMER LIST--%>
<section id="customers">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Customer List</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                        <tr>
                            <th>#</th>
                            <th>Name</th>
                            <th>Balance</th>
                            <th>Actions</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="customer" items="${customers}" varStatus="status" >
                            <tr>
                                <td>${status.count}</td>
                                <td>${customer.name} ${customer.surname}</td>
                                <td><fmt:formatNumber value="${customer.balance}" type="currency" /></td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/ServletController?action=edit&idClient=${customer.id_customer}"
                                        class="btn btn-secondary btn-sm">
                                        <i class="bi bi-pencil"></i>&nbsp;Edit
                                    </a>
                                    <a href="${pageContext.request.contextPath}/ServletController?action=delete&idCustomer=${customer.id_customer}"
                                        class="btn btn-danger btn-sm">
                                        <i class="bi bi-trash"></i>&nbsp;Delete
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>