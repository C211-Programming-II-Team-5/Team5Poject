/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolidayMaze;

import java.awt.Desktop;
import java.io.File;
import javax.swing.*;
import static java.lang.System.exit;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;

public class MainMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML Button blackFridayButton;
    @FXML Button halloweenButton;
    @FXML Button christmasButton;
    @FXML Button exitButton;
    @FXML Button readMeButton;
    @FXML Button pauseMusicButton;
    
    @FXML
    private BorderPane contentPane;
    
    private AudioClip stopPlaying;

    @Override 
    public void initialize(URL url, ResourceBundle rb) {
        
       
        
      mainHolidayTheme(stopPlaying);
    }  
    
        static void mainHolidayTheme (AudioClip clip) {
        //Retrieve Intro music clip from resources folder
         try
        {
        File resourcesDirectory = new File("src/main/resources/HolidayMaze/ProjectMusic/Intro.wav");
        resourcesDirectory.getAbsolutePath();
        
        //Convert resources pathname into a URI
        URI u = resourcesDirectory.toURI();
        
        AudioClip holidayClip = new AudioClip(u.toString());
        
        //Continue playing music
        holidayClip.setCycleCount(AudioClip.INDEFINITE);
        holidayClip.play();
        
        }
        catch (Exception e)
        {
             JOptionPane.showMessageDialog(null, "Exception occured" + e);
        }      
    }
        
    @FXML
    private void pauseButtonPressed(ActionEvent event) {
       
//        mainHolidayTheme(stopPlaying);
//        stopPlaying.stop();
        
    }   
    
    @FXML
    private void blackFridayButtonPressed(ActionEvent event) {
        Global.mazeName = "Black Friday"; 
        FxmlLoader object = new FxmlLoader();
         Pane view = object.getPage("recipientInfo");
         contentPane.setCenter(view);
    }
    
    @FXML
    private void halloweenButtonPressed(ActionEvent event) {
        Global.mazeName = "Halloween"; 
         FxmlLoader object = new FxmlLoader();
         Pane view = object.getPage("recipientInfo");
         contentPane.setCenter(view);
    }
    
    @FXML
    private void christmasButtonPressed(ActionEvent event) {
        Global.mazeName = "Christmas"; 
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("recipientInfo");
        contentPane.setCenter(view);
    }
    
     @FXML
     private void exitButtonPressed(ActionEvent event) {
         //Close program
         exit(0);
     }
     
     @FXML
     private void readMeButtonPressed(ActionEvent event) {
         //Opens ReadMe Microsoft Word Document
        try {
            File resourcesDirectory = new File("src/main/resources/ReadMe.docx");
            resourcesDirectory.getAbsolutePath();
            
        if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
        {  
            JOptionPane.showMessageDialog(null, "Not Supported"); 
        return;  
        }  
            Desktop desktop = Desktop.getDesktop();  
        if(resourcesDirectory.exists())         //checks file exists or not  
            desktop.open(resourcesDirectory);   //opens the specified file  
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Exception occured" + ex);
        }
     }
     
}
    

