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
    
    
    public Dice()
    {
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
}
