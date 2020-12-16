/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package HolidayMaze;
import java.net.URI;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javax.swing.*;

public class FxmlLoader {
    private Pane view;
            
public Pane getPage (String fileName) {
    
    try {
        URL fileUrl = App.class.getResource(fileName + ".fxml");
        
        if(fileUrl == null) {
            throw new java.io.FileNotFoundException("FXML file could not be found");
        }
        
        view = new FXMLLoader().load(fileUrl);
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No Page: Check fxml page loader " + ex);
    }
    
    return view;
}

    
}
