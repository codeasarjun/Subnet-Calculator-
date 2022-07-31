import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ipCalController implements Initializable {

    @FXML
    private  Label tb_EnteredIp;

    @FXML
    private Button tf_back;

    @FXML
    public Label tf_totalHost;
    @FXML
    public Label lb_default_sub_mask;

    @FXML
    public Label tf_totalSubnet;
    @FXML
    public TextField enter_subnet;
    @FXML
    private Button get_subnet;
    @FXML
    public  Label lb_classs;
    //String num_of_subnet;
    
    @FXML
   public void getSubnet1(ActionEvent e) {
        //num_of_subnet=enter_subnet.getText();

    Runnable task=()->
    {

        Platform.runLater(()->
        {
            ipCalculator.calculate(tb_EnteredIp.getText(),enter_subnet.getText(),this);// this will pass refrence 

            //setLabeldata();
        });


    };
    Thread thread=new Thread(task);
    thread.setDaemon(true);
    thread.start();

        
        
      
        
    }
       
    
    @Override
    public void initialize(URL location,ResourceBundle resources)
    {
        tf_back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent evt)
            {
                sceneController.changeScene(evt, "mainUI.fxml",null,0);
            }
            
        });
    }
    
    public void get_S_ip(String e_Ip)
    {
        
        //System.out.println(num_of_subnet);
        tb_EnteredIp.setText(e_Ip);
        enter_subnet.setVisible(true);
        get_subnet.setVisible(true);
        
        
        
    }
    public void get_CIDR_ip(String e_Ip)
    {
        String retured_ip;
        tb_EnteredIp.setText(e_Ip);
        retured_ip=ipCalculator.calculate_CIDR_ip(e_Ip);
        tf_totalHost.setText("Total possible hosts "+retured_ip);
    }
    public void setLabeldata()
    {
        tf_totalHost.setVisible(true);
        lb_classs.setVisible(true);
       tf_totalSubnet.setVisible(true);
       lb_default_sub_mask.setVisible(true);
       //lb_default_sub_mask.setText("thread "+Thread.currentThread());
       //System.out.print(enter_subnet.getText());
    }


}
