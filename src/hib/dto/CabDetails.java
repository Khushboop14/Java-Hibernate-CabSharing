   // FOR JFRAME GUI USER AFTER LOGIN PAGE 
  /* private int home;//-----> CABOOK (search bar): pvt public with ac and without ac;
    private int profile;//-----> (edit bar) name: ---- , desgination: ---- ,contact: ---- ,address: ---- , History: ----(total rides and amount), SIGNOUT;
    private int  contact;//----> software detail;
    private int  complain;//-----> complain form;
    private int  feedback;//-----> feedback form;
   private int   exit;//----> back to home page; */

package hib.dto;

public class CabDetails  
{
    private String cabnumber; 
    private String cabId;
    private String cabtype;
    private String cabdrivername;
    private String drivercontact;
//    private String name;
//    private String contact;

    public CabDetails(String cabnumber, String cabId, String cabtype, String cabdrivername, String drivercontact) {
        this.cabnumber = cabnumber;
        this.cabId = cabId;
        this.cabtype = cabtype;
        this.cabdrivername = cabdrivername;
        this.drivercontact = drivercontact;
//        this.name = name;
//        this.contact = contact;
    }

    /**
     * @return the cabnumber
     */
    public String getCabnumber() {
        return cabnumber;
    }

    /**
     * @param cabnumber the cabnumber to set
     */
    public void setCabnumber(String cabnumber) {
        this.cabnumber = cabnumber;
    }

    /**
     * @return the cabId
     */
    public String getCabId() {
        return cabId;
    }

    /**
     * @param cabId the cabId to set
     */
    public void setCabId(String cabId) {
        this.cabId = cabId;
    }

    /**
     * @return the cabtype
     */
    public String getCabtype() {
        return cabtype;
    }

    /**
     * @param cabtype the cabtype to set
     */
    public void setCabtype(String cabtype) {
        this.cabtype = cabtype;
    }

    /**
     * @return the cabdrivername
     */
    public String getCabdrivername() {
        return cabdrivername;
    }

    /**
     * @param cabdrivername the cabdrivername to set
     */
    public void setCabdrivername(String cabdrivername) {
        this.cabdrivername = cabdrivername;
    }

    /**
     * @return the drivercontact
     */
    public String getDrivercontact() {
        return drivercontact;
    }

    /**
     * @param drivercontact the drivercontact to set
     */
    public void setDrivercontact(String drivercontact) {
        this.drivercontact = drivercontact;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getContact() {
//        return contact;
//    }
//
//    public void setContact(String contact) {
//        this.contact = contact;
//    }



    

       
}
