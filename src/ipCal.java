import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ipCal implements Initializable {

    @FXML
    private  Label tb_EnteredIp;

    @FXML
    private Button tf_back;

    @FXML
    private Label tf_totalHost;

    @FXML
    private Label tf_totalSubnet;
    @FXML
    private TextField enter_subnet;
    public static void changeScene(ActionEvent event,String fxmlfile,String passed_ip)
    {
        Parent root=null;
        try {
            
            FXMLLoader loader=new FXMLLoader(ipCal.class.getResource(fxmlfile));
            root=loader.load();
           //loader.getController(); // avoid non static call error 
           
           
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Subent");
        
        stage.setScene(new Scene(root));

    }
    
    @Override
    public void initialize(URL location,ResourceBundle resources)
    {
        tf_back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent evt)
            {
                ipCal.changeScene(evt, "mainUI.fxml",null);
            }
            
        });
    }
    


}
