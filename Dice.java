/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author Denny
 */
public class Dice{
    
    Random random = new Random();
    int end;
    
    
    public Dice(int end)
    {
        this.end = end;
    }
    
    public int randomDiceAttack(int mod)
    {
        return random.nextInt(20) + 1 + mod;
    }
    
    public int randomDiceDamageWarrior(int weapon, int mod)
    {
        return random.nextInt(weapon) + mod + 1;
    }
    
    public int randomDiceDamageThief(int weapon, int mod)
    {
        return random.nextInt(weapon)+ random.nextInt(weapon) + random.nextInt(weapon) + mod + 1;
    }

    public int randomDiceDamageWizard(int weapon, int mod)
    {
        return random.nextInt(weapon) + random.nextInt(weapon) + mod + 1;
    }
    
    public int randomDiceDamageLvl1(int weapon, int mod) //Rats and Slime
    {
        return random.nextInt(weapon) + mod + 1;
    }
    
    public int randomDiceDamageLvl2(int weapon, int mod) //Trolls and Golems
    {
        return random.nextInt(weapon) + random.nextInt(weapon) + mod + 1;
    }
    
    public int randomDiceDamageDragon(int weapon, int mod)
    {
        return random.nextInt(weapon) + random.nextInt(weapon) + mod + 1;
    }
    
}
