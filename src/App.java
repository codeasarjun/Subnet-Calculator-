import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class App extends Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        launch();
    }// need to work 
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root;
        root=FXMLLoader.load(getClass().getResource("mainUI.fxml"));
        Scene scene=new Scene(root);
        primaryStage.setTitle("Subnet calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

        
    }
}
