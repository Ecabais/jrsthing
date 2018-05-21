/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author elyvic
 */
public class GUI extends BorderPane{
    private GridPane gridpane = new GridPane();
    
    private Button submitBtn = new Button("Submit");
    
    private Label amountLabel = new Label("Amount");
    private TextField amountTF = new TextField();
    
    private HBox amountHbox = new HBox(amountLabel, amountTF);
    
    public GUI(){
        
        amountHbox.setSpacing(5);
        amountHbox.setPadding(new Insets(5,5,5,5));
        
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setHgap(5);
        gridpane.setVgap(5);
        
        gridpane.add(amountLabel, 0, 0);
        gridpane.add(amountTF, 1, 0);
        gridpane.add(submitBtn, 1, 1);
        
        
        this.setCenter(gridpane);
        
        
        
        
    }

    /**
     * @return the gridpane
     */
    public GridPane getGridpane() {
        return gridpane;
    }

    /**
     * @param gridpane the gridpane to set
     */
    public void setGridpane(GridPane gridpane) {
        this.gridpane = gridpane;
    }

    /**
     * @return the submitBtn
     */
    public Button getSubmitBtn() {
        return submitBtn;
    }

    /**
     * @param submitBtn the submitBtn to set
     */
    public void setSubmitBtn(Button submitBtn) {
        this.submitBtn = submitBtn;
    }

    /**
     * @return the amountLabel
     */
    public Label getAmountLabel() {
        return amountLabel;
    }

    /**
     * @param amountLabel the amountLabel to set
     */
    public void setAmountLabel(Label amountLabel) {
        this.amountLabel = amountLabel;
    }

    /**
     * @return the amountTF
     */
    public TextField getAmountTF() {
        return amountTF;
    }

    /**
     * @param amountTF the amountTF to set
     */
    public void setAmountTF(TextField amountTF) {
        this.amountTF = amountTF;
    }

    /**
     * @return the amountHbox
     */
    public HBox getAmountHbox() {
        return amountHbox;
    }

    /**
     * @param amountHbox the amountHbox to set
     */
    public void setAmountHbox(HBox amountHbox) {
        this.amountHbox = amountHbox;
    }
}
