<%--
  Created by IntelliJ IDEA.
  User: mrrobot
  Date: 1/20/25
  Time: 9:29 PM
  To change this template use File | Settings | File Templates.
--%>
<div class="modal fade" id="addCustomerModal" tabindex="-1" aria-labelledby="addCustomerLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title" id="addCustomerLabel">Add Customer</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
        <%-- Form to add new customer --%>
            <form action="${pageContext.request.contextPath}/ServletController?action=insert" method="post" class="was-validated">
                <div class="modal-body">
                    <div class="form-group mb-3">
                        <label for="name">Name</label>
                        <input type="text" class="form-control" id="name" name="name" required />
                    </div>
                    <div class="form-group mb-3">
                        <label for="surname">Surname</label>
                        <input type="text" class="form-control" id="surname" name="surname" required />
                    </div>
                    <div class="form-group mb-3">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" name="email" required />
                    </div>
                    <div class="form-group mb-3">
                        <label for="phone">Phone</label>
                        <input type="text" class="form-control" id="phone" name="phone" required />
                    </div>
                    <div class="form-group mb-3">
                        <label for="balance">Balance</label>
                        <input type="number" step="any" class="form-control" id="balance" name="balance" required />
                    </div>
                </div>
                <%-- MODAL FOOTER --%>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary ">Save</button>
                </div>
            </form>
        </div>
    </div>
</div>
