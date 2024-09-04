
package banksystem;

 
public class Customer {
     private String nam;
    private String idd ;
    private String bal;
    private String acc;

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getIdd() {
        return idd;
    }

    public void setIdd(String idd) {
        this.idd = idd;
    }

    public String getBal() {
        return bal;
    }

    public void setBal(String bal) {
        this.bal = bal;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    @Override
    public String toString() {
        return "Customer{" + "nam=" + nam + ", idd=" + idd + ", bal=" + bal + ", acc=" + acc + '}';
    }

  
  
    
    
    
}
