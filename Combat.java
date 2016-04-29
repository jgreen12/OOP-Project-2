/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denny
 */
public class Combat {
    
    int viewNum;
    Dice dice = new Dice();
        boolean level2 = false;
        boolean level3 = false;
        boolean level4 = false;
        boolean level5 = false;
        boolean level6 = false;
    
    BaseCharacter player = new BaseCharacter(); //Change to whatever class the player chooses. 
    BaseCharacter enemy = new BaseCharacter();
    
    public void newEngagement(int enemyType)
    {
        if(enemyType == 1)
        {
            BaseCharacter enemy = new EnemyRat();
        }
        else if(enemyType == 2)
        {
            BaseCharacter enemy = new EnemySlime();
        }
        else if(enemyType == 3)
        {
            BaseCharacter enemy = new EnemyTroll();
        }
        else if(enemyType == 4)
        {
            BaseCharacter enemy = new EnemyGolem();
        }
        else if(enemyType == 5)
        {
            BaseCharacter enemy = new EnemyDragon();
        }
    }
    
    public void levelUp()
    {
        
        if(player.exp > 15 && level2 == false)
        {
            player.levelUp();
            level2 = true;
        }
        else if(player.exp > 45 && level3 == false)
        {
            player.levelUp();
            level3 = true;
        }
        else if(player.exp > 90 && level4 == false)
        {
            player.levelUp();
            level4 = true;
        }
        else if(player.exp > 180 && level5 == false)
        {
            player.levelUp();
            level5 = true;
        }
        else if(player.exp > 360 && level6 == false)
        {
            player.levelUp();
            level6 = true;
        }
        else
        {            
        }
        
    }
    
    public boolean enemyDead()
    {
        if(enemy.currentHealth <= 0)
        {
            player.exp = player.exp + enemy.exp;
            levelUp();
            return true;
        }
        else
        {
            return false;
        }
    }
    
    boolean playerDead()
    {
        if(player.currentHealth <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void playerAttack()
    {
        viewNum = dice.randomDiceAttack(player.mod);
        sy(player.type + " tries to hit: " + viewNum + " against "+ enemy.type + "'s AC: " + enemy.AC);
        if(viewNum >= enemy.AC)
        {
            viewNum = dice.randomDiceDamagePlayer(player.equipedWeapon, player.mod);
            player.currentHealth = player.currentHealth - viewNum;
        }        
    }
    
    public int playerDefend()
    {
        return player.AC + 5;
    }
    
    public void enemyAttack()
    {
        viewNum = dice.randomDiceAttack(enemy.mod);
        sy(enemy.type + " tries to hit: " + viewNum + " against "+ player.type + "'s AC: " + player.AC);
        if(viewNum >= player.AC)
        {
            viewNum = dice.randomDiceDamagePlayer(enemy.equipedWeapon, enemy.mod);
            enemy.currentHealth = enemy.currentHealth - viewNum;
        } 
    }
    public void sy(String s)
    {
        System.out.println(s);
    }
    
}
