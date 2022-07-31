import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class mainController implements Initializable {

    @FXML
    private Button getSubnet;
    @FXML
    private TextField tf_CIDRIP;

    @FXML
    private TextField tf_ip;
    @FXML
    private Label lb_cidr_status;
    @FXML
    private Label lb_ip_status;

    @FXML

    void cidr_key_validatation(KeyEvent event) {
        
        if(isValidCIDR(tf_CIDRIP.getText()))
        {
            setVisiblity(lb_cidr_status,tf_CIDRIP.getText());
            lb_cidr_status.setText("acceptable foramat,please click on get");
            lb_cidr_status.setStyle("-fx-text-fill:green;-fx-font-size:16px;");
        }
        else {
            setVisiblity(lb_cidr_status,tf_CIDRIP.getText());
            lb_cidr_status.setText("please insert the ip in correct format");
            lb_cidr_status.setStyle("-fx-text-fill:red;-fx-font-size:16px;");
        }
    }

    @FXML
    void ip_key_validatation(KeyEvent event) {
        
        if(isValidip(tf_ip.getText()))
        {
            setVisiblity(lb_ip_status,tf_ip.getText());
            //lb_ip_status.setVisible(true);
            lb_ip_status.setText("acceptable foramat,please click on get");
            lb_ip_status.setStyle("-fx-text-fill:green;-fx-font-size:16px;");
        }
        else {
            setVisiblity(lb_ip_status,tf_ip.getText());
           // lb_ip_status.setVisible(true);
            lb_ip_status.setStyle("-fx-text-fill:red;-fx-font-size:16px;");
            lb_ip_status.setText("please insert the ip in correct format");
        }
        
    }

    @Override 
    public void initialize(URL url,ResourceBundle resources)
    {
        
        
            getSubnet.setOnAction(e -> {
                String cidr_ip=tf_CIDRIP.getText(); //CIDR format 
                String ip_S=tf_ip.getText();
                String ip_passing="";
                int c;
               // System.out.println(cidr_ip);
                if(!cidr_ip.isEmpty() || !ip_S.isEmpty() )
                {
                    if(!cidr_ip.isEmpty())
                    {

                        
                        ip_passing=cidr_ip;
                        c=0; // to check from where we got the input
                    }  
                    else
                    {
                        ip_passing=ip_S;
                         c=1; // to check from where we got the input
                    }
                        

                  //  System.out.println(ip_passing);
                    sceneController.changeScene(e, "ipCal.fxml",ip_passing,c);
                }
                else
                {
                    Alert alert=new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please provide an ip");
                    alert.show();
                }
                
                //System.out.println(r);
            });
        
        }
        
       
 public boolean isValidCIDR(String s)
 {
     String validIp="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
     String regx =  validIp + "\\." + validIp + "\\." + validIp + "\\." + validIp+"\\/[0-9]{2}";
    return s.matches(regx);


 }

 public boolean isValidip(String s)
 {
     String validIp="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
     String regx =  validIp + "\\." + validIp + "\\." + validIp + "\\." + validIp;
    return s.matches(regx);

 }
void setVisiblity(Label l,String s)
{
    if(s.isBlank()||s==null)
    {
        l.setVisible(false);
    }
    else {
        l.setVisible(true);

    }
}
}
