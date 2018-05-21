/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author elyvic
 */
public class Controller {
    
    private GUI gui = new GUI();
    private Model model = new Model();
    
    public Controller(Model model, GUI gui){
        this.gui = gui;
        this.model = model;
        AttachHandler();
    }
    
    public void AttachHandler(){
        
        gui.getSubmitBtn().setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                
                if(ValidateAmount()){
                int amount = Integer.parseInt(gui.getAmountTF().getText());
                System.out.println(amount);
                
                gui.getAmountTF().clear();
            
                }
            }
        });
    }
    
    public boolean ValidateAmount(){
        Pattern intP = Pattern.compile("[0-9]+");
        Matcher intM = intP.matcher(gui.getAmountTF().getText());
        
        
        if (intM.find() && intM.group().equals(gui.getAmountTF().getText())){
            return true;
        }
        
        else if (gui.getAmountTF().getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("ERROR!");
            alert.setHeaderText(null);
            alert.setContentText("Prompt is Empty");

            alert.showAndWait();

            return false;
        }
        
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("ERROR!");
            alert.setHeaderText(null);
            alert.setContentText("Invalid Input!! Only number allowed");
            
            gui.getAmountTF().clear();

            alert.showAndWait();

            return false;
        }
            
            
        
    }
}
