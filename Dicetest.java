/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Denny
 */
public class Dicetest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dice dice = new Dice();
        Weapons weapons = new Weapons();
        Warrior warrior = new Warrior("Denny");
        Thief thief = new Thief ("Donovan");
        Wizard wizard = new Wizard("Dominic");

        System.out.println("Testing: " + warrior.str + ","+ warrior.dex + "," + warrior.con+ "," + warrior.intl);
        System.out.println("Testing: " + warrior.getMod(warrior.str));
        System.out.println(dice.randomDiceAttack(warrior.getMod(warrior.str)));
        System.out.println(dice.randomDiceDamageWarrior(weapons.Club, warrior.getMod(warrior.str)));
        System.out.println(warrior.name + "," + warrior.health + "," + warrior.AC);
        
        System.out.println("Testing: " + thief.str + ","+ thief.dex + "," + thief.con+ "," + thief.intl);
        System.out.println("Testing: " + thief.getMod(thief.dex));
        System.out.println(dice.randomDiceAttack(thief.getMod(thief.dex)));
        System.out.println(dice.randomDiceDamageWarrior(weapons.dagger, thief.getMod(thief.dex)));
        System.out.println(thief.name + "," + thief.health + "," + thief.AC);
        
        System.out.println("Testing: " + wizard.str + ","+ wizard.dex + "," + wizard.con+ "," + wizard.intl);
        System.out.println("Testing: " + wizard.getMod(wizard.intl));
        System.out.println(dice.randomDiceAttack(wizard.getMod(wizard.intl)));
        System.out.println(dice.randomDiceDamageWarrior(weapons.staff, warrior.getMod(wizard.intl)));
        System.out.println(wizard.name + "," + wizard.health + "," + wizard.AC);
      
        
        
    }
    
}
