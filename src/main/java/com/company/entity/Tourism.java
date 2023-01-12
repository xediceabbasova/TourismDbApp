package com.company.entity;

public class Tourism {

    private int id;
    private String customerName;
    private String customerSurname;
    private String gender;
    private int age;
    private int passportId;
    private int ticketId;
    private double ticketPrice;
    private String fromDestination;
    private String toDestination;

    public Tourism() {
    }

    public Tourism(int id) {
        this.id = id;
    }

    public Tourism(int id, String customerName, String customerSurname, String gender, int age, int passportId, int ticketId, double ticketPrice, String fromDestination, String toDestination) {
        this.id = id;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.gender = gender;
        this.age = age;
        this.passportId = passportId;
        this.ticketId = ticketId;
        this.ticketPrice = ticketPrice;
        this.fromDestination = fromDestination;
        this.toDestination = toDestination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getFromDestination() {
        return fromDestination;
    }

    public void setFromDestination(String fromDestination) {
        this.fromDestination = fromDestination;
    }

    public String getToDestination() {
        return toDestination;
    }

    public void setToDestination(String toDestination) {
        this.toDestination = toDestination;
    }

    @Override
    public String toString() {
        return "Tourism{" + "id=" + id + ", customerName=" + customerName + ", customerSurname=" + customerSurname + ", gender=" + gender + ", age=" + age + ", passportId=" + passportId + ", ticketId=" + ticketId + ", ticketPrice=" + ticketPrice + ", fromDestination=" + fromDestination + ", toDestination=" + toDestination + '}';
    }

}
