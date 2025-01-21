package web.customer.data;

import web.customer.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
    // CRUD
    private static final String SQL_SELECT =
            "SELECT id_customer, name, surname, email, phone, balance FROM customers";

    public List<Customer> listCustomers() {
        List<Customer> customers = new ArrayList<>();
        try (Connection connection = DbConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_SELECT);
            ResultSet resultSet = statement.executeQuery()) {
            // Iterate over customers on Db
            while (resultSet.next()) {
                Customer customer = new Customer(
                        resultSet.getInt("id_customer"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("email"),
                        resultSet.getString("phone"),
                        resultSet.getDouble("balance")
                );
                customers.add(customer);
            }
        } catch (SQLException exception) {
            exception.printStackTrace(System.err);
        }
        return customers;
    }
}
