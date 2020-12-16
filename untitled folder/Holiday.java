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
import java.util.ArrayList;

public abstract class Holiday {
    
    private final String recipientName; 
    private final int recipientAge; 
    private final String recipientGender;
    
    //Constructor
    public Holiday(String name, int age, String gender) {
    this.recipientName = name;
    this.recipientAge = age;
    this.recipientGender = gender;
    
    }
    
    //Return recipient name
    public String getRecipientName() {return recipientName;}
    
    //Return recipient age
    public int getRecipientAge() {return recipientAge;}
    
    //Return recipient gender
    public String getRecipientGender() {return recipientGender;}
    
    //abstract method must be overridden by concrete subclass
    public abstract ArrayList<BufferedImage> determineGift();
    
}
