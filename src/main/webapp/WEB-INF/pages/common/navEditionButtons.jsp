<%--
  Created by IntelliJ IDEA.
  User: mrrobot
  Date: 1/20/25
  Time: 9:55 PM
  To change this template use File | Settings | File Templates.
--%>
<section id="editActions" class="my-4 mb-4">
  <div class="container">
    <div class="row">
      <div class="col-md-3">
        <a href="${pageContext.request.contextPath}/" class="btn btn-secondary btn-block w-100">
          <i class="bi bi-arrow-left"></i>&nbsp;Back to Home
        </a>
      </div>
      <div class="col-md-3">
        <button type="submit" class="btn btn-success btn-block w-100">
          <i class="bi bi-check-lg"></i>&nbsp;Save Customer
        </button>
      </div>
      <div class="col-md-3">
        <a href="${pageContext.request.contextPath}/ServletController?action=delete&idCustomer=${customer.id_customer}"
           class="btn btn-danger btn-block w-100">
          <i class="bi bi-trash"></i>&nbsp;Delete Customer
        </a>
      </div>
    </div>
  </div>
</section>