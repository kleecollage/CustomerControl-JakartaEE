package web.customer.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import web.customer.data.CustomerDao;
import web.customer.model.Customer;
import java.io.IOException;
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
        // GET SESSION
        HttpSession session = request.getSession();
        session.setAttribute("customers", customers);
        session.setAttribute("totalCustomers", customers.size());
        session.setAttribute("totalBalance", this.calcTotalBalance(customers));
        // send request to JSP of customers
        request.getRequestDispatcher("customers.jsp").forward(request, response);
    }

    private double calcTotalBalance(List<Customer> customers) {
        /* TRADITIONAL CODE
        double totalBalance = 0.0;
        for (Customer customer : customers) {
            totalBalance += customer.getBalance();
        }
        return totalBalance; */
        // MODERN CODE (1 line) //
        return customers.stream().mapToDouble(Customer::getBalance).sum();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
