package web.customer.model;

public class Customer {
    private int id_customer;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private Double balance;

    // Empty constructor for javabeans
    public Customer() { }

    // CONSTRUCTOR OVERLOAD
    // For get one / delete endpoints
    public Customer(int id_customer) {
        this.id_customer = id_customer;
    }

    // For create endpoint
    public Customer(String name, String surname, String email, String phone, Double balance) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }

    // For update endpoint
    public Customer(int id_customer, String name, String surname, String email, String phone, Double balance) {
        this.id_customer = id_customer;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
