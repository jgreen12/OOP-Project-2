/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame;

import java.util.Scanner;

/**
 *
 * @author dmc
 */
public class Player extends Entity{
    public Player(String name, String description, Room room, int healthpoints)
    {
        super( name,  description,  room,  healthpoints);
    }
    
    public void deathScreen()
    {
        int userchoice;
        boolean cases = false;
        while(cases == false)
        {
            Scanner in = new Scanner(System.in);
            sy("Select your options");
            sy("1.Continue");
            sy("2.Return to Title Screen");
            userchoice = in.nextInt();
            
            switch(userchoice){
                case 1:
                    sy("continue");
                    cases = true;
                    break;
                case 2:
                    sy("Return");
                    cases = true;
                    break;
                default:
                    sy("Invalid selection");
                    break;
            }
        }
        
    }
    
    //Make printing items faster for programmer
    public void sy(String s)
    {
        System.out.println(s);
    }
}
