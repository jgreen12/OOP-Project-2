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
        
        Dice dice = new Dice(12);
        Weapons weapons = new Weapons();
        Warrior warrior = new Warrior("Denny");
        
        warrior.setMod(warrior.str);
        warrior.setHealth(10, 6);
        
        System.out.println(dice.randomDiceAttack(4));
        System.out.println(dice.randomDiceDamageWarrior(weapons.Club, warrior.mod));
        System.out.println(warrior.health);
        System.out.println(warrior.mod);
        System.out.println(warrior.name);
      
        
        
    }
    
}
