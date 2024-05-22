package hib.dto;

public class EmployeeFeedbackForm {
    private String eid;
    private String name;
    private String feedback;

    public EmployeeFeedbackForm() {
    }

    public EmployeeFeedbackForm(String eid, String name, String feedback) {
        this.eid = eid;
        this.name = name;
        this.feedback = feedback;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }
    
}
