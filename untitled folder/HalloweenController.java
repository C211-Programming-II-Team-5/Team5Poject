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
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javax.swing.ImageIcon;

public class HalloweenController implements Initializable {

    /**
     * Initializes the controller class.
     */
    //Initializes the controller class.
     @FXML private RadioButton straightRadioButton;
     @FXML private RadioButton leftRadioButton;
     @FXML private RadioButton rightRadioButton;
     @FXML private RadioButton downRadioButton;
     @FXML private ToggleGroup halloweenToggleButtonGroup;
     ArrayList<String> giftImages;
     static Random rand = new Random();
     int mysteryGift = 0;
     ImageIcon gifts;  //Resourece location for Black Friday Gifts
     ImageIcon bad;    //Resource location for bad icon image
     ImageIcon good;   //Resource location
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void straightRadioButtonSelected(ActionEvent e) {
        
    }
    
    @FXML
    private void leftRadioButtonSelected(ActionEvent e) {
        
    }
    
    @FXML
    private void rightRadioButtonSelected(ActionEvent e) {
        
    }
    
    @FXML
    private void downRadioButtonSelected(ActionEvent e) {
        
    }
}
