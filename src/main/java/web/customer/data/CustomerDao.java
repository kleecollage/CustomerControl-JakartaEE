package web.customer.data;

import web.customer.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
    // CRUD
    private static final String SQL_SELECT =
            "SELECT id_customer, name, surname, email, phone, balance FROM customers";
    private static final String SQL_INSERT =
            "INSERT INTO customers(name, surname, email, phone, balance) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM customers WHERE id_customer = ?";
    private static final String SQL_UPDATE =
            "UPDATE customers SET name = ?, surname = ?, email = ?, phone = ?, balance = ? WHERE id_customer = ?";
    private static final String SQL_DELETE = "DELETE FROM customers WHERE id_customer = ?";

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

    public int insert(Customer customer) {
        int rows = 0;
        try(Connection conn = DbConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)) {
            stmt.setString(1, customer.getName());
            stmt.setString(2, customer.getSurname());
            stmt.setString(3, customer.getEmail());
            stmt.setString(4, customer.getPhone());
            stmt.setDouble(5, customer.getBalance());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
        return rows;
    }

    public Customer findCustomer(Customer customer) {
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_BY_ID)) {
            stmt.setInt(1, customer.getId_customer());
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    customer.setName(resultSet.getString("name"));
                    customer.setSurname(resultSet.getString("surname"));
                    customer.setEmail(resultSet.getString("email"));
                    customer.setPhone(resultSet.getString("phone"));
                    customer.setBalance(resultSet.getDouble("balance"));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
        return customer;
    }

    public int update(Customer customer) {
        int rows = 0;
        try(Connection conn = DbConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE)) {
            stmt.setString(1, customer.getName());
            stmt.setString(2, customer.getSurname());
            stmt.setString(3, customer.getEmail());
            stmt.setString(4, customer.getPhone());
            stmt.setDouble(5, customer.getBalance());
            stmt.setInt(6, customer.getId_customer());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
        return rows;
    }

    public int delete(Customer customer) {
        int rows = 0;
        try(Connection conn = DbConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL_DELETE)) {
            stmt.setInt(1, customer.getId_customer());
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
        return rows;
    }

}
