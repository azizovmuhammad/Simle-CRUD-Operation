public class User {

    private String phone_number;
    private String firstname;
    private String lastname;
    private String username;

    public User(String phone_number, String firstname, String lastname, String username) {
        this.phone_number = phone_number;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
    }

    public User(String firstname, String lastname, String username) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
    }

    public String  getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String password) {
        this.phone_number = phone_number;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Phone_Number = " + phone_number + "  :  " +
                "Firstname = " + firstname + "  :  " +
                "Lastname = " + lastname + "  :  " +
                "Username = " + username ;
    }
}
