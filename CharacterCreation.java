/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Denny
 */
public class CharacterCreation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BaseCharacter character = new BaseCharacter(); 
        Scanner input = new Scanner(System.in);
        
        int choice;
        String name;
        String sav; //store save name
        
        sy("Hello, this is a character test, please choose what class you want to be: ");
        sy("1. Warrior "); //A warrior will have higher health + Armor so itll be harder to hit them.
        sy("2. Thief"); //A Thief has better flat damage, constant damage.
        sy("3. Wizard"); //A wizard will have the biggest damage. 
        choice = input.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Please enter a name for your character: ");
                name = input.nextLine();
                name = input.nextLine();
                Warrior warrior = new Warrior(name); //A warriors base health will by 10 + con, and after every level 6 + con.
                sav = name.concat(".dat"); //store user name as name of save
                WarriorSave(sav,warrior);
                break;
            case 2:
                System.out.println("Please enter a name for your character: ");
                name = input.nextLine();
                name = input.nextLine();
                Thief thief = new Thief(name); //A thief base health will be 8 + con, and after every level 5 + con.
                sav = name.concat(".dat");
                ThiefSave(sav,thief);
                break;
            case 3:
                System.out.println("Please enter a name for your character: ");
                name = input.nextLine();
                name = input.nextLine();
                Wizard wizard = new Wizard(name); //A wizard base health will be 6 + con, and after every level 4 + con.
                sav = name.concat(".dat");
                WizardSave(sav,wizard);
                break;
        }
    }
    
    //Save Data
    public void WarriorSave(String sav, Warrior warrior)
    {
        try{
            FileOutputStream saveFile=new FileOutputStream(sav);
            // Create an ObjectOutputStream to put objects into save file.
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            save.writeObject(warrior.name);
            save.writeObject(warrior.type);
            save.writeObject(warrior.AC);
            save.writeObject(warrior.exp);
            save.writeObject(warrior.str);
            save.writeObject(warrior.dex);
            save.writeObject(warrior.con);
            save.writeObject(warrior.intl);
            save.writeObject(warrior.attack);
            save.writeObject(warrior.health);
            save.writeObject(warrior.currentHealth);
            // Close the file.
            save.close(); // This also closes saveFile.
            
        }
        catch(Exception exc){
            exc.printStackTrace(); // If there was an error, print the info.
        }
        
    }
    
    public void ThiefSave(String sav, Thief thief)
    {
        try{
            FileOutputStream saveFile=new FileOutputStream(sav);
            // Create an ObjectOutputStream to put objects into save file.
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            save.writeObject(thief.name);
            save.writeObject(thief.type);
            save.writeObject(thief.AC);
            save.writeObject(thief.exp);
            save.writeObject(thief.str);
            save.writeObject(thief.dex);
            save.writeObject(thief.con);
            save.writeObject(thief.intl);
            save.writeObject(thief.attack);
            save.writeObject(thief.health);
            save.writeObject(thief.currentHealth);
            // Close the file.
            save.close(); // This also closes saveFile.
            
        }
        catch(Exception exc){
            exc.printStackTrace(); // If there was an error, print the info.
        }
    }
    
    public void WizardSave(String sav, Wizard wizard)
    {
        try{
            FileOutputStream saveFile=new FileOutputStream(sav);
            // Create an ObjectOutputStream to put objects into save file.
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            save.writeObject(wizard.name);
            save.writeObject(wizard.type);
            save.writeObject(wizard.AC);
            save.writeObject(wizard.exp);
            save.writeObject(wizard.str);
            save.writeObject(wizard.dex);
            save.writeObject(wizard.con);
            save.writeObject(wizard.intl);
            save.writeObject(wizard.attack);
            save.writeObject(wizard.health);
            save.writeObject(wizard.currentHealth);
            // Close the file.
            save.close(); // This also closes saveFile.
            
        }
        catch(Exception exc){
            exc.printStackTrace(); // If there was an error, print the info.
        }
    }
    
    public void sy(String s)
    {
        System.out.println(s);
    }
    
}
