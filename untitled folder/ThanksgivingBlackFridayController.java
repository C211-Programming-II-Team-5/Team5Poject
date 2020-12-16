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

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * FXML Controller class
 *
 */
public class ThanksgivingBlackFridayController implements Initializable {

     //Initializes the controller class.
     @FXML private RadioButton straightRadioButton;
     @FXML private RadioButton leftRadioButton;
     @FXML private RadioButton rightRadioButton;
     @FXML private RadioButton downRadioButton;
     @FXML private ToggleGroup blackFridayToggleButtonGroup;
    
     private ArrayList<ImageIcon> giftIcons = new ArrayList<ImageIcon>(); //hold image Icons
     static Random rand = new Random();
     int mysteryGift = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        try
        {

        //creating an blackFridayGiftRecipient object
        BlackFriday blackFridayIGiftRecipient = new BlackFriday(Global.recipientName,Global.recipientAge,
            Global.recipientGender, "November 27");

        //Get images from list
        ArrayList<BufferedImage> images = blackFridayIGiftRecipient.getImageList();
        
        //Looping through the images list
        for (int i = 0; i < images.size(); i++) {

          //Creating an imaceIcon, setting a height and width
          ImageIcon icon = new ImageIcon(images.get(i));
          java.awt.Image image = icon.getImage();
          java.awt.Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
          icon = new ImageIcon(newimg);  // transform it back

         //Adding to icon list
         giftIcons.add(icon);
        } 
        
        }
        catch (Exception e)
        {
             JOptionPane.showMessageDialog(null, "Exception occured" + e);
        }      
    }   

//Move straight ahead in maze
@FXML
    private void straightRadioButtonSelected(ActionEvent e) {
         //Generate random number in range 0 and 5
         
        mysteryGift = rand.nextInt(5);   
       try 
       {
           
        BufferedImage badImage = ImageIO.read(getClass().getResource("/MazeBackgroundImages/cross-296507_1280.png"));
        ImageIcon badIcon = new ImageIcon(badImage);
            
        BufferedImage goodImage = ImageIO.read(getClass().getResource("/MazeBackgroundImages/parcel-575623_1280.png"));
        ImageIcon goodIcon = new ImageIcon(goodImage);  
        
        switch (mysteryGift) {
        
        case 0:
            JOptionPane.showMessageDialog(null, "You were grabbed from behind and thrown out the maze. ", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 1:
            JOptionPane.showMessageDialog(null, "'Hey! Get off my property!' The property owner chased you out of the maze.", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 2:
            JOptionPane.showMessageDialog(null, "'Hello stranger...' You run for your life from the convicted gang member :-O", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 3:
            JOptionPane.showMessageDialog(null, null, null, JOptionPane.INFORMATION_MESSAGE , goodIcon); 
            JOptionPane.showMessageDialog(null, "'What took you so long? I found the prize already.' Your friend found the prize :-)", "GAME OVER", 
                JOptionPane.OK_OPTION); 
        break;
        
         case 4:
            JOptionPane.showMessageDialog(null, null, null,JOptionPane.INFORMATION_MESSAGE ,goodIcon); 
            JOptionPane.showMessageDialog(null, "'Congrats on reaching the end of the maze!'Announcer hands you your prize :-) ", "Congats!", 
                JOptionPane.OK_OPTION); 
        break;
        
        }
        
    }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Exception occured" + ex);
        }
}
    
   @FXML
    private void leftRadioButtonSelected(ActionEvent e) {
         //Generate random number in range 0 and 5
        mysteryGift = rand.nextInt(5);   
        
        try 
       {
           
        BufferedImage badImage = ImageIO.read(getClass().getResource("/MazeBackgroundImages/cross-296507_1280.png"));
        ImageIcon badIcon = new ImageIcon(badImage);
            
        BufferedImage goodImage = ImageIO.read(getClass().getResource("/MazeBackgroundImages/parcel-575623_1280.png"));
        ImageIcon goodIcon = new ImageIcon(goodImage);  
        
        switch (mysteryGift) {
        
        case 0:
            JOptionPane.showMessageDialog(null, "You accidentally walked into a"
                    + " hunter's trap. ", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 1:
            JOptionPane.showMessageDialog(null, "'AWOOOOOOOO!' You run faster "
                    + "than you ever had in your life away from a wolf :-O", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 2:
            JOptionPane.showMessageDialog(null, "'Help me...cough..cough...' "
                    + "You run as fast as you can away from the stranger hoping you didn't catch covid :-0", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 3:
            JOptionPane.showMessageDialog(null, null, null, JOptionPane.INFORMATION_MESSAGE , goodIcon); 
            JOptionPane.showMessageDialog(null, "'Huh? What's behind these bushes?' You found the prize :-)", "GAME OVER", 
                JOptionPane.OK_OPTION); 
        break;
        
         case 4:
            JOptionPane.showMessageDialog(null, null, null,JOptionPane.INFORMATION_MESSAGE ,goodIcon); 
            JOptionPane.showMessageDialog(null, "'I see something...' You found the prize near a large rock :-) ", "Congats!", 
                JOptionPane.OK_OPTION); 
        break;
        
        }
        
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Exception occured" + ex);
        }
    }
    
      @FXML
    private void rightRadioButtonSelected(ActionEvent e) {
        mysteryGift = rand.nextInt(4);    //Generate random number in range 0 and 5
                try 
       {
           
        BufferedImage badImage = ImageIO.read(getClass().getResource("/MazeBackgroundImages/cross-296507_1280.png"));
        ImageIcon badIcon = new ImageIcon(badImage);
            
        BufferedImage goodImage = ImageIO.read(getClass().getResource("/MazeBackgroundImages/parcel-575623_1280.png"));
        ImageIcon goodIcon = new ImageIcon(goodImage);  
        
        switch (mysteryGift) {
        
        case 0:
            JOptionPane.showMessageDialog(null, "'Looks like we got free help for the farm hahahahaaha!'"
                    + " You were captured by rogue  farmers. :-O", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 1:
            JOptionPane.showMessageDialog(null, "'Owwwwwwwwww...' You have been "
                    + " rendered unconcious by a falling tree branch", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 2:
            JOptionPane.showMessageDialog(null, "'Fancy meeting you here.'"
                    + "You run as fast as you can away from a thug :-0", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 3:
            JOptionPane.showMessageDialog(null, null, null, JOptionPane.INFORMATION_MESSAGE , goodIcon); 
            JOptionPane.showMessageDialog(null, "'Huh? I see something in the tree?' You found the prize :-)", "GAME OVER", 
                JOptionPane.OK_OPTION); 
        break;
        
         case 4:
            JOptionPane.showMessageDialog(null, null, null,JOptionPane.INFORMATION_MESSAGE ,goodIcon); 
            JOptionPane.showMessageDialog(null, "'I see something...' You knocked the prize down using a rock :-) ", "Congats!", 
                JOptionPane.OK_OPTION); 
        break;
        
        }
        
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Exception occured" + ex);
        }
        
    }
    
      @FXML
    private void downRadioButtonSelected(ActionEvent e) {
        mysteryGift = rand.nextInt(4);    //Generate random number in range 0 and 5
        
                try 
       {
           
        BufferedImage badImage = ImageIO.read(getClass().getResource("/MazeBackgroundImages/cross-296507_1280.png"));
        ImageIcon badIcon = new ImageIcon(badImage);
            
        BufferedImage goodImage = ImageIO.read(getClass().getResource("/MazeBackgroundImages/parcel-575623_1280.png"));
        ImageIcon goodIcon = new ImageIcon(goodImage);  
        
        switch (mysteryGift) {
        
        case 0:
            JOptionPane.showMessageDialog(null, "You fall down a rabbit hole.", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 1:
            JOptionPane.showMessageDialog(null, "'Grrrrrrrrrrrr!' You run faster "
                    + "than you ever had in your life away from a pack of feral dogs :-O", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 2:
            JOptionPane.showMessageDialog(null, "'Look what we have here! You thought you were only one looking for the prize? "
                    + "You run as fast as you can away from the rogue maze contenders :-0", "GAME OVER", 
                JOptionPane.INFORMATION_MESSAGE, badIcon); 
        break;
        
         case 3:
            JOptionPane.showMessageDialog(null, null, null, JOptionPane.INFORMATION_MESSAGE , goodIcon); 
            JOptionPane.showMessageDialog(null, "'There it is!' You found the prize :-)", "GAME OVER", 
                JOptionPane.OK_OPTION); 
        break;
        
         case 4:
            JOptionPane.showMessageDialog(null, null, null,JOptionPane.INFORMATION_MESSAGE ,goodIcon); 
            JOptionPane.showMessageDialog(null, "'I see something behind that bale of hay...' "
                    + "You found the prize :-) ", "Congats!", 
                JOptionPane.OK_OPTION); 
        break;
        
        }
        
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Exception occured" + ex);
        }
    }
}

