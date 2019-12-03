
package startpoijnt;


public class Collaboratirestudent  extends BitmStudent{
     private double coursefee;
     private String company;

    public Collaboratirestudent(double coursefee, String company, String name, String phone, String nid) {
        super(name, phone, nid);
        this.coursefee = coursefee;
        this.company = company;
    }

    public double getCoursefee() {
        return coursefee;
    }

    public void setCoursefee(double coursefee) {
        this.coursefee = coursefee;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
     

   
    

    @Override
    public String getInfo() {
        return super.getName()+"\n"+coursefee;
    }
    }
    
    
    
    
     

