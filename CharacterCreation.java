/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

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
                break;
            case 2:
                System.out.println("Please enter a name for your character: ");
                name = input.nextLine();
                name = input.nextLine();
                Thief thief = new Thief(name); //A thief base health will be 8 + con, and after every level 5 + con.
                break;
            case 3:
                System.out.println("Please enter a name for your character: ");
                name = input.nextLine();
                name = input.nextLine();
                Wizard wizard = new Wizard(name); //A wizard base health will be 6 + con, and after every level 4 + con.
                break;
        }
    }
    
    public void sy(String s)
    {
        System.out.println(s);
    }
    
}
