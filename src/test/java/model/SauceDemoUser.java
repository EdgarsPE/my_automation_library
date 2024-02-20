package model;

public class SauceDemoUser {
    private String Username;
    private String Password;
    private String FirstName;
    private String LastName;
    private String Zip;

    public SauceDemoUser(String username, String password,
                         String firstName, String lastName, String zip) {
        Username = username;
        Password = password;
        FirstName = firstName;
        LastName = lastName;
        Zip = zip;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }
}
