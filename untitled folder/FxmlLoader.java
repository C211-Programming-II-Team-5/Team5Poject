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
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javax.swing.*;

public class FxmlLoader {
    private Pane view;
    private FXMLLoader fxmlLoader;
     
public Pane getPage (String fileName) {
    
    try {
     
        URL fileUrl = App.class.getResource(fileName + ".fxml");
        
        if(fileUrl == null) {
            throw new java.io.FileNotFoundException("FXML file could not be found");
        }
            
       fxmlLoader = new FXMLLoader(fileUrl);
       
       switch (fileName + ".fxml") {
           
        case ("recipientInfo.fxml"):
            fxmlLoader.setController(new RecipientInfoController());
            view = fxmlLoader.load();
            break;
            
        case ("thanksgivingBlackFriday.fxml"):
              fxmlLoader.setController(new ThanksgivingBlackFridayController());
              view = fxmlLoader.load();
            break;
        case ("halloween.fxml"):
              fxmlLoader.setController(new HalloweenController());
              view = fxmlLoader.load();
            break;
        case ("christmas.fxml"):
              fxmlLoader.setController(new ChristmasController());
              view = fxmlLoader.load();
            break;
       }
      
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "No Page: Check fxml page loader " + ex);
    }
    
    return view;
}

    
}
