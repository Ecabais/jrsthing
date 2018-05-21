package jrsthing;

import MVC.Controller;
import MVC.GUI;
import MVC.Model;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author elyvic
 */
public class JrsThing extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        GUI gui = new GUI(); 
        Model model = new Model();
        Controller controller = new Controller(model ,gui);
        
      
        
        Scene scene = new Scene(gui, 300, 250);
        
        primaryStage.setTitle("Jr's Stock thing");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
