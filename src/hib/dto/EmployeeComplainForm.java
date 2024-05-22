package hib.dto;
public class EmployeeComplainForm {
    private String name;
  //  private String date;
    private String category;
    private String description;//will show downbar list which contain some common complain 

    public EmployeeComplainForm() {
    }

    public EmployeeComplainForm(String name,String category,String description) {
        this.name =name;
       // this.date = date;
        this.category = category;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    
public void setName(String name) {
        this.name = name;
    }
   
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
