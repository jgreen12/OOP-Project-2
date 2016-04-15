/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Josh
 */
public class Enemy implements EnemyF{
    String name;
    double attackValue;
    double healthValue;
    double currentHealth;
    double damage;
    boolean dead;
    
    
    
    
    Enemy(String n, double a, double h){
        name = n;
        attackValue = a;
        healthValue = h;
        currentHealth = h;
        dead = false;
        damage = 0;
    }
    //monster take damage
    //attack
    //
    
    
    
    @Override
    public String PrintAttack(){
        return("The "+name+" attacked you for "+attackValue+" damage.\n");
    }
    @Override 
    public String PrintDamage(){
      return("You have attacked the "+name+" for "+damage+" damage.\n");  
    }
    @Override
    public String PrintWin(){
        return("You have killed the " +name+ ".\n");
    }
    @Override
    public String PrintLoss(){
        return("The "+name+" has killed you.\n");
    }
    
    
    
    
    
    
    
}
