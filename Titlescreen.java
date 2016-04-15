/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
import java.io.*;
import java.util.ArrayList;
 */
package testgame;
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author Stephen
 */

public class Titlescreen {
    public Titlescreen()
    {
        
    }
    //Handles the options menu
    public void options()
    {
        String userchoice;
        boolean cases = false;
        while (cases == false)
        {
            Scanner in = new Scanner(System.in);        
            sy("New");
            sy("Continue");
            sy("Exit");
            userchoice = in.nextLine();
       
        
            switch(userchoice){
                case "New":
                    newGame();
                    cases = true;
                    break;
                case "Continue":
                    loadGame();
                    cases = true;
                    break;
                case "Exit":
                    cases = true;
                    sy("Exit");
                    break;
                default:
                    sy("Error");
                    break;
            }
        }
                            
    }
    
    //Make printing items faster for programmer
    public void sy(String s)
    {
        System.out.println(s);
    }
    
    public void newGame()
    {
        String username;
        Scanner in = new Scanner(System.in);
        sy("Enter your name");
        username = in.nextLine();
        sy(username);
    }
    
    public void loadGame()
    {
        // Directory path for saves
        String path = "C:\\Users\\dmc\\Documents\\NetBeansProjects\\TestGame\\src\\Saves"; 
 
        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles(); 
 
        for (int i = 0; i < listOfFiles.length; i++) 
        {
 
            if (listOfFiles[i].isFile()) 
            {
                files = listOfFiles[i].getName();
                System.out.println(files);
            }
        }
        sy("Select save");
    }
}
