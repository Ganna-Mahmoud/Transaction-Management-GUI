
package banksystem;

public class Client { 
    private String name;
    private String phone;
    private String email;
    private String pass;
    private String Id;

   
    public void setName(String name) {
        this.name = name;
    }
    
    public void setId(String Id) {
        this.Id = Id;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    

    public String getName() {
        return "Name : " + name;
    }
    
    public String getId() {
        return "ID : " +  Id;
    }
    
    public String getPhone() {
        return "Phone : " + phone;
    }

    public String getEmail() {
        return "Email : " +  email;
    }

    public String getPass() {
        return "Password : " +  pass;
    }
    

    @Override
    public String toString() {
        return "Client { " + "name = " + name + ", phone = " + phone + ", email = " + email + ", pass = " + pass + '}';
    }
    
    
    
}
    

