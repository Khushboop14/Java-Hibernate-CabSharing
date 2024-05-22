package hib.dto;
public class EmployeeSignin {    
    private String employeeid;
    private String name;
    private String designation;
    private String contact;
    private String address;
    private String username;
    private String password;

    
    public EmployeeSignin() {
    }
    public EmployeeSignin(String employeeid, String name, String designation, String contact, String address, String username, String password) {
        this.employeeid = employeeid;
        this.name = name;
        this.designation = designation;
        this.contact = contact;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }
    
}
