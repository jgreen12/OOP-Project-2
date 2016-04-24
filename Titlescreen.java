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
import java.io.*;

/**
 *
 * @author Stephen
 * updates:
 * access to CharacterCreation for creating a new game
 * Can now write data to a .dat file
 * Can now read data from a .dat file
 */

public class Titlescreen {
    public Titlescreen()
    {
        
    }
    //Handles the options menu
    public void options() throws IOException
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
    
    public void newGame() throws FileNotFoundException, IOException
    {
        String username;
        CharacterCreation create = new CharacterCreation();
        Scanner in = new Scanner(System.in);
        sy("Enter your name");
        username = in.nextLine();
        sy(username);
        create.createCharacter();
        
    }
    
 
    
    public void loadGame()
    {
        // Directory path for saves
        String path = "C:\\Users\\dmc\\Documents\\NetBeansProjects\\TestGame"; 
        String userline;
        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles(); 
 
        for (int i = 0; i < listOfFiles.length; i++) 
        {
 
            if (listOfFiles[i].isFile()) 
            {
                files = listOfFiles[i].getName();
                if(files.contains("dat")){
                    System.out.println(files);
                }
                
            }
        }
        sy("Select save: ");
        Scanner in = new Scanner(System.in);
        userline=in.nextLine();
        restoreState(userline);
        
    }
    //restoreState fetches information from the save file
    
    public void restoreState(String userline)
    {
        String name =" ";
        String type =" ";
        int AC = 0;
        int exp = 0;
        int str = 0;
        int dex = 0;
        int con = 0;
        int intl = 0;
        int attack = 0;
        int health = 0;
        int currentHealth = 0;
        try{
            FileInputStream saveFile = new FileInputStream(userline);
            ObjectInputStream save = new ObjectInputStream(saveFile);
            name = (String) save.readObject();
            type = (String) save.readObject();
            AC = (Integer) save.readObject();
            exp = (Integer) save.readObject();
            str = (Integer) save.readObject();
            dex = (Integer) save.readObject();
            con = (Integer) save.readObject();
            intl = (Integer) save.readObject();
            attack = (Integer) save.readObject();
            health = (Integer) save.readObject();
            currentHealth = (Integer) save.readObject();
            
            save.close();
        }
        catch(Exception exc){
            exc.printStackTrace(); // If there was an error, print the info.
                        
        }
        sy("Character traits\n");
        sy("Name: \n"+ name);
        sy("type: \n"+ type);
        sy("AC: \n"+ AC);
        sy("exp: \n"+exp);
        sy("str: \n"+ str);
        sy("dex: \n"+ dex);
        sy("con: \n"+ con);
        sy("intl: \n"+ intl);
        sy("attack: \n"+ attack);
        sy("health: \n"+ health);
        sy("currentHealth: \n"+ currentHealth);
    }
}

 

 
       
