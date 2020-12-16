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

public class Christmas extends Holiday {
    
    private ArrayList<BufferedImage> christmasList;
    static final File christmasLocation = new File("/target/classes/Christmas\\");
    private String christmasDate;
    
    //Constructor
    public  Christmas(String recipientName, int recipientAge, String recipientGender, 
                String christmasDate) {
    super(recipientName, recipientAge, recipientGender);
    
    
     if (recipientAge >= 0  && recipientAge <= 120) {
        if (recipientGender.equalsIgnoreCase("male") || recipientGender.equalsIgnoreCase("female")) {   
            this.christmasDate = christmasDate;
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
        
              
        if (christmasLocation.isDirectory()) { // make sure it's a directory
            for (final File f : christmasLocation.listFiles()) {
                BufferedImage img = null;

                try {
                    img = ImageIO.read(f);
                    christmasList = new ArrayList<>();
                    christmasList.add(img);
                } 
                catch (final Exception e) {
                     JOptionPane.showMessageDialog(null, "There was an exception " + e); 
                }
            }
        }
    }
      
    public ArrayList<BufferedImage> getImageList()  {return christmasList;}
    
    //Determine Christmas Gift
    @Override
    public ArrayList<BufferedImage> determineGift() {return getImageList();}
    
}
    
