/*
*Programmer: Joy Love
*Team Project
*C211 Problem Solving and Programming II: JAVA Programming
*Fall 2020
*Due Date: 12/14/2020
*Date Completed: 12/15/2020
*
*/

package HolidayMaze;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;


public class RecipientInfoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML Button recipientButton;
    @FXML private BorderPane contentPane;
    @FXML private TextField nameTextField;
    @FXML private TextField ageTextField;
    @FXML private TextField genderTextField;      
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
    @FXML
    private void submitRecipientDataButtonPressed(ActionEvent e) {
        
        try {
            
        FxmlLoader object = new FxmlLoader();
        Pane view;
        
        //Set global variables to contents of recipient info text fields
        Global.recipientName = nameTextField.getText();
        Global.recipientAge = Integer.parseInt(ageTextField.getText());
        Global.recipientGender = genderTextField.getText();
        
        
        switch(Global.mazeName) {
            case "Black Friday":
            view = object.getPage("thanksgivingBlackFriday");
            contentPane.setCenter(view);
            break;
            case "Halloween":
            view = object.getPage("halloween");
            contentPane.setCenter(view);
            break;
            case "Christmas":
            view = object.getPage("christmas");
            contentPane.setCenter(view);
            break;
        }
        
         } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No Page: Check fxml page loader " + ex);
        }          
    }
}
