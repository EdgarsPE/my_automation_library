package model;

public class User {
    private String email;
    private String password;
    private String name;
    private String Surname;
    private int phone;
    private String city;
    private String address;
    private String zip;


    public User(String email, String password, String name, String surname, int phone,
                String city, String address, String zip) {
        this.email = email;
        this.password = password;
        this.name = name;
        Surname = surname;
        this.phone = phone;
        this.city = city;
        this.address = address;
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
