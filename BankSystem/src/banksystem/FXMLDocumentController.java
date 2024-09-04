
package banksystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {

   
    
   
     
    @FXML
      private Button add;
    @FXML
      private TextField txtN;
    @FXML
      private TextField txtI;
    @FXML
      private TextField txtB;
    @FXML
      private Button cust;
    @FXML
      private TextField txtnam;
    @FXML
      private TextField txtidd;
    @FXML
      private TextField txtbal;
    @FXML
      private TextField txtacc;
     @FXML
      private ListView listC ;
    @FXML
      private Button loan;
    @FXML
      private TextField txtloamount;
    @FXML
      private TextField txttoamount;
    @FXML
      private TextField txtrate;
    @FXML
      private TextField txtdur;
    @FXML
      private Button del;
    @FXML
      private TextField txtn;
    @FXML
      private TextField txti;
    @FXML
      private TextField txtb;
   
    @FXML
      private Button rgt;
    @FXML
      private TextField txtName;
    @FXML
      private TextField txtId;
    @FXML
      private TextField txtPhone;
    @FXML
      private TextField txtEmail;
    @FXML
      private TextField txtPass;
     @FXML
    private ListView listT ;
    @FXML
      private ListView list ;
     @FXML
     private ListView listV ;
      @FXML
     private ListView listN ;
     
 @FXML
      private void registerButtonAction(ActionEvent event ) {
           Client c1 = new Client();
            
         c1.setName(txtName.getText());
         c1.setPhone(txtPhone.getText());
         c1.setEmail(txtEmail.getText());
         c1.setPass(txtPass.getText());
         
         System.out.println(c1); 
//         boolean add1 = listN.getItems().add(c1.getName());
//         boolean add2 = listN.getItems().add(c1.getPhone());
//         boolean add3 = listN.getItems().add(c1.getEmail());
//         boolean add4 = listN.getItems().add(c1.getPass());
    }
      
      
     
    @FXML
    private void addButtonAction(ActionEvent event) {
        
          Adding a1 = new Adding();
        a1.setN(txtN.getText());
        a1.setI(txtI.getText());
        a1.setB(txtB.getText());
           
         boolean add1 = list.getItems().add(a1.getN());
         boolean add2 = list.getItems().add(a1.getI());
         boolean add3 = list.getItems().add(a1.getB());
           
    }
      @FXML
    private void deleteButtonAction(ActionEvent event) {
        
          Deleting d1 = new Deleting();
       d1.setN(txtn.getText());
       d1.setI(txti.getText());
       d1.setB(txtb.getText());
       
         boolean add1 = listV.getItems().add(d1.getN());
         boolean add2 = listV.getItems().add(d1.getI());
         boolean add3 = listV.getItems().add(d1.getB());
           
    }
    @FXML
     private void loanButtonAction(ActionEvent event) {
        
          Loan l1 = new Loan();
        l1.setLoamount(txtloamount.getText());
        l1.setRate(txtrate.getText());
        l1.setDur(txtdur.getText());
        l1.setToamount(txttoamount.getText());
         
      boolean add1 = listT.getItems().add(l1.getToamount());
    

    }
       @FXML
    private void customerButtonAction(ActionEvent event) {
        
          Customer m1 = new Customer();
       m1.setNam(txtnam.getText());
       m1.setIdd(txtidd.getText());
       m1.setBal(txtbal.getText());
       m1.setAcc(txtacc.getText());
       
       
         boolean add1 = listC.getItems().add(m1.getNam());
         boolean add2 = listC.getItems().add(m1.getIdd());
         boolean add3 = listC.getItems().add(m1.getBal());
         boolean add4 = listC.getItems().add(m1.getAcc());
    }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                
    }           
                }    
    

