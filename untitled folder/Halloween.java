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

import static HolidayMaze.BlackFriday.blackFridayLocation;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


public class Halloween extends Holiday{
    
    private ArrayList<BufferedImage> halloweenList;
    static final File halloweenLocation = new File("/target/classes/HalloweenCostumes\\");
    private String halloweenDate;
    
    //Constructor
    public  Halloween(String recipientName, int recipientAge, String recipientGender,
                String halloweenDate) {
    super(recipientName, recipientAge, recipientGender);
    
    
    
     if (recipientAge >= 0  && recipientAge <= 120) {
        if (recipientGender.equalsIgnoreCase("male") || recipientGender.equalsIgnoreCase("female")) {   
            this.halloweenDate = halloweenDate;
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
        
        //Load Halloween costumes images into Array List
         if (blackFridayLocation.isDirectory()) { // make sure it's a directory
            for (final File f : blackFridayLocation.listFiles()) {
                BufferedImage img = null;

                try {
                    img = ImageIO.read(f);
                    halloweenList = new ArrayList<>();
                    halloweenList.add(img);
                } 
                catch (final Exception e) {
                   JOptionPane.showMessageDialog(null, "There was an exception " + e);
                }
            }
        }
    }
      
    public ArrayList<BufferedImage> getImageList()  {return halloweenList;}
    
    //Determine Halloween Costume
    @Override
    public ArrayList<BufferedImage> determineGift() {return getImageList();}
    
}

