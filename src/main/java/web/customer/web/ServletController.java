package web.customer.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import web.customer.data.CustomerDao;
import web.customer.model.Customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

@WebServlet(name = "ServletController", urlPatterns = "/ServletController")
public class ServletController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = Optional.ofNullable(request.getParameter("action")).orElse("listCustomers");
        switch (action) {
            case "listCustomers" -> this.listCustomers(request, response);
            default -> this.listCustomers(request, response);
        }
    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        List<Customer> customers = new CustomerDao().listCustomers();
        System.out.println("customers = " + customers);
        // send request to JSP of customers
        request.getRequestDispatcher("customers.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
