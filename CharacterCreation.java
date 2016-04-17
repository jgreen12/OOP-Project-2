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
        
        System.out.println("Hello, this is a character test, please choose what class you want to be: ");
        System.out.println("1. Warrior "); //A warrior will have higher health + Armor so itll be harder to hit them.
        System.out.println("2. Thief"); //A Thief has better flat damage, constant damage.
        System.out.println("3. Wizard"); //A wizard will have the biggest damage. 
        choice = input.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Please enter a name for your character: ");
                name = input.nextLine();
                name = input.nextLine();
                Warrior warrior = new Warrior(name);
                warrior.setMod(warrior.str);
                warrior.setHealth(10, 6); //A warriors base health will by 10 + con, and after every level 6 + con.
                break;
            case 2:
                System.out.println("Please enter a name for your character: ");
                name = input.nextLine();
                name = input.nextLine();
                Thief thief = new Thief(name);
                thief.setMod(thief.dex);
                thief.setHealth(8, 5); //A thief base health will be 8 + con, and after every level 5 + con.
                break;
            case 3:
                System.out.println("Please enter a name for your character: ");
                name = input.nextLine();
                name = input.nextLine();
                Wizard wizard = new Wizard(name);
                wizard.setMod(wizard.intl);
                wizard.setHealth(6, 4); //A wizard base health will be 6 + con, and after every level 4 + con.
                break;
        }
    }
    
}
