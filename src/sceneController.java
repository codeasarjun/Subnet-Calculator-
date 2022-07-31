import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;


public class sceneController {

    public static void changeScene(ActionEvent event,String fxmlfile,String passed_ip,int c)
    {
        Parent root=null;
        if(passed_ip!=null)
        {
            try {
            
                FXMLLoader loader=new FXMLLoader(ipCalController.class.getResource(fxmlfile));
                root=loader.load();
                ipCalController setD=loader.getController(); 
                if(c==0)
                {
                setD.get_CIDR_ip(passed_ip);
                }
                else
                {
                    setD.get_S_ip(passed_ip);
                }
                
               //loader.getController(); // avoid non static call error 
               
               
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else{
            try {
                root=FXMLLoader.load(sceneController.class.getResource(fxmlfile));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Subent");
        
        stage.setScene(new Scene(root));

    }
    
}
