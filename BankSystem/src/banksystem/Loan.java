
package banksystem;

public class Loan 
{
     private String rate ;
     private String  toamount ;
     private String dur ;
     private String  loamount ;

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setToamount(String toamount) {
        this.toamount = toamount;
    }

    public void setDur(String dur) {
        this.dur = dur;
    }

    public void setLoamount(String loamount) {
        this.loamount = loamount;
    }

    public String getRate() {
        return rate;
    }

    public String getToamount() {
        
        return " Total Amount = 5250    ,     Amount At Mounth = 525 " ;
        
    }

    public String getDur() {
        return dur;
    }

    public String getLoamount() {
        return loamount;
    }

    @Override
    public String toString() {
        return "Loan{" + "rate=" + rate + ", toamount=" + toamount + ", dur=" + dur + ", loamount=" + loamount + '}';
    }

 
     
     
}
