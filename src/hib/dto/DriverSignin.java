package hib.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class DriverSignin {
    
//To resolve the IdentifierGenerationException, you need to add 
//an identifier property to the DriverSignin class and annotate it with @Id:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cabnumber;
    private String cabtype;
    private String name;
    private String contact;
    private String username;
    private String password;

    public DriverSignin() {
    }

    public DriverSignin(String cabnumber,String cabtype, String name, String contact, String username, String password) {
      //  this.id = id;
        this.cabnumber = cabnumber;
        this.cabtype = cabtype;
        this.name = name;
        this.contact = contact;
        this.username = username;
        this.password = password;
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCabnumber() {
        return cabnumber;
    }

    public void setCabnumber(String cabnumber) {
        this.cabnumber = cabnumber;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCabtype() {
        return cabtype;
    }

    public void setCabtype(String cabtype) {
        this.cabtype = cabtype;
    }
    
}
