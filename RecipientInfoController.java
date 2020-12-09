/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolidayMaze;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class RecipientInfoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML Button recipientButton;
    @FXML
    private BorderPane contentPane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
         @FXML
    private void submitRecipientDataButtonPressed(ActionEvent e) {
        
        switch(Global.mazeName) {
            case "Black Friday":
            FxmlLoader object = new FxmlLoader();
            Pane view = object.getPage("thanksgivingBlackFriday");
            contentPane.setCenter(view);
                    
        }
    }
    
}
