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
    BaseCharacter player = new BaseCharacter();
    
    
    public Dice()
    {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int randomDiceAttack(int mod)
    {
        return random.nextInt(20) + 1 + mod;
    }
    
    public int randomDiceDamagePlayer(int weapon, int mod)
    {
        
        if(player.type == "Warrior")
        {
            return random.nextInt(weapon) + mod + 1;
        }
        else if(player.type == "Wizard")
        {
            return random.nextInt(weapon) + random.nextInt(weapon) + mod + 1;
        }
        else if(player.type == "Thief")
        {
            return random.nextInt(weapon)+ random.nextInt(weapon) + random.nextInt(weapon) + mod + 1;
        }
        
        return 0;

    }
    
    public int randomDiceDamageEnemy(int weapon, int mod)
    {
        
        if(player.type == "Rat")
        {
            return random.nextInt(weapon) + mod + 1;
        }
        else if(player.type == "Slime")
        {
            return random.nextInt(weapon) + random.nextInt(weapon) + mod + 1;
        }
        else if(player.type == "Golem")
        {
            return random.nextInt(weapon)+ random.nextInt(weapon) + random.nextInt(weapon) + mod + 1;
        }
        else if(player.type == "Troll")
        {
            
        }
        else if(player.type == "Dragon")
        {
            return random.nextInt(weapon)+ random.nextInt(weapon) + random.nextInt(weapon) + random.nextInt(weapon) + mod + 1;
        }
        
        return 0;

    }
    
    public int randomDiceDamageLvl1(int weapon, int mod)
    {
        return random.nextInt(weapon) + mod + 1;
    }
    
    public int randomDiceDamageLvl2(int weapon, int mod)
    {
        return random.nextInt(weapon) + random.nextInt(weapon) + mod + 1;
    }
    
    public int randomDiceDamageDragon(int weapon, int mod)
    {
        return random.nextInt(weapon) + random.nextInt(weapon) + mod + 1;
    }
    
}
