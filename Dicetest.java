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
        
        boolean death = false;
        
        Dice dice = new Dice(12);
        Weapons weapons = new Weapons();
        Warrior warrior = new Warrior("Denny");
        Thief thief = new Thief ("Donovan");
        Wizard wizard = new Wizard("Dominic");
        EnemyRat rat = new EnemyRat();
        EnemyDragon dragon = new EnemyDragon();

        //System.out.println("Testing: " + warrior.str + ","+ warrior.dex + "," + warrior.con+ "," + warrior.intl);
        //System.out.println("Testing: " + warrior.getMod(warrior.str));
        //System.out.println(dice.randomDiceAttack(warrior.getMod(warrior.str)));
        //System.out.println(dice.randomDiceDamageWarrior(weapons.Club, warrior.getMod(warrior.str)));
        //System.out.println(warrior.name + "," + warrior.health + "," + warrior.AC);
        
        //System.out.println("Testing: " + thief.str + ","+ thief.dex + "," + thief.con+ "," + thief.intl);
        //System.out.println("Testing: " + thief.getMod(thief.dex));
        //System.out.println(dice.randomDiceAttack(thief.getMod(thief.dex)));
        //System.out.println(dice.randomDiceDamageWarrior(weapons.dagger, thief.getMod(thief.dex)));
        //System.out.println(thief.name + "," + thief.health + "," + thief.AC);
        
        //System.out.println("Testing: " + wizard.str + ","+ wizard.dex + "," + wizard.con+ "," + wizard.intl);
        //System.out.println("Testing: " + wizard.getMod(wizard.intl));
        //System.out.println(dice.randomDiceAttack(wizard.getMod(wizard.intl)));
        //System.out.println(dice.randomDiceDamageWarrior(weapons.staff, wizard.getMod(wizard.intl)));
        //System.out.println(wizard.name + "," + wizard.health + "," + wizard.AC);
        
        //System.out.println("Testing: " + rat.str + ","+ rat.dex + "," + rat.con+ "," + rat.intl);
        //System.out.println("Testing: " + rat.getMod(rat.dex));
        //System.out.println(dice.randomDiceAttack(wizard.getMod(wizard.dex)));
        //System.out.println(dice.randomDiceDamageWarrior(weapons.ratClaws, rat.getMod(rat.dex)));
        //System.out.println(rat.type + "," + rat.health + "," + rat.AC);
        
        System.out.println("Testing combat: ");
        
        int seeShit;
        
    do{
        seeShit = dice.randomDiceAttack(thief.getMod(thief.dex));
        if(seeShit > warrior.AC)
        {
            System.out.println("Thief attacks for " + seeShit);
            seeShit = dice.randomDiceDamageThief(weapons.dagger, thief.getMod(thief.dex));
            warrior.currentHealth = warrior.currentHealth - seeShit;
            System.out.println("Warrior takes "+ seeShit + " damage, current health: " + warrior.currentHealth);
            if(warrior.currentHealth <= 0)
                {
                 System.out.println("Warrior is dead as a mofo!");
                 death = true;
                }
        }
        seeShit = dice.randomDiceAttack(warrior.getMod(warrior.str));
        if( seeShit > thief.AC)
        {
            System.out.println("Warrior attacks for " + seeShit);
            seeShit = dice.randomDiceDamageWarrior(weapons.longSwd, warrior.getMod(warrior.str));
            thief.currentHealth = thief.currentHealth - seeShit;
            System.out.println("Thief takes "+ seeShit + " damage, current health: " + thief.currentHealth);
            if(thief.currentHealth <= 0)
                {
                 System.out.println("Thief is dead as a mofo!");
                 death = true;
                }
        }
    }while(death == false);
    death = false;
    
    }
    
}
