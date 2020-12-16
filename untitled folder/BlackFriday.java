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
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class BlackFriday extends Holiday {
    
    private ArrayList<BufferedImage> blackFridayList;
    static final File blackFridayLocation = new File("/target/classes/ThanksgivingBlackFriday\\");
    private String blackFridayDate;
    
    //Constructor
    public  BlackFriday(String recipientName, int recipientAge, String 
            recipientGender,String blackFridayDate){
    super(recipientName, recipientAge, recipientGender);
    
    
    if (recipientAge >= 0  && recipientAge <= 120) {
        if (recipientGender.equalsIgnoreCase("male") || recipientGender.equalsIgnoreCase("female")) {   
            this.blackFridayDate = blackFridayDate;
            //Load images
            loadImages();
            }     
            else {
                throw new IllegalArgumentException("Gender must be male or female and" + "\n" +
                " age must be greater than or equal to 0 or less than 120");
            }
        }
    }
             
    private void loadImages() {
        
        if (blackFridayLocation.isDirectory()) { // make sure it's a directory
            for (final File f : blackFridayLocation.listFiles()) {
                BufferedImage img = null;

                try {
                    img = ImageIO.read(f);
                    blackFridayList = new ArrayList<>();
                    blackFridayList.add(img);
                } 
                catch (final Exception e) {
                   JOptionPane.showMessageDialog(null, "There was an exception " + e); 
                }
            }
        }
    }
    
    public ArrayList<BufferedImage> getImageList()  {return blackFridayList;}
    
    //Determine Black Friday Gift
    @Override
    public ArrayList<BufferedImage> determineGift() {return getImageList();}
    
}


