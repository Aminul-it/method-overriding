
package startpoijnt;


public class seipStudent extends BitmStudent {
    private String seid;
    private double strippend;

    public seipStudent(String seid, double strippend, String name, String phone, String nid) {
        super(name, phone, nid);
        this.seid = seid;
        this.strippend = strippend;
    }

    public String getSeid() {
        return seid;
    }

    public void setSeid(String seid) {
        this.seid = seid;
    }

    public double getStrippend() {
        return strippend;
    }

    public void setStrippend(double strippend) {
        this.strippend = strippend;
    }

  

    @Override
    public String getInfo() {
        return super.getName()+"\n"+seid;
    }
    
}
