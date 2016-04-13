/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame;

/**
 *
 * @author Stephen Maddux
 * this class keeps track of the user's inventory
 * Currently a simple example with one inventory item being kept
 * track of.
 */
public class Inventory {
    private boolean knife;
    public Inventory(boolean knife)
    {
        this.knife = knife;
    }
    //Setter methods
    public void setKnife(boolean knife)
    {
        this.knife = knife;
    }
    //Getter methods
    public boolean getknife()
    {
        return knife;
    }
    
    
    public void displayString()
    {
        System.out.println("Inventory: ");
        //display knife in inventory only if true
        if(knife == true)
        {
            System.out.println("knife");
        }
    }
    
}
