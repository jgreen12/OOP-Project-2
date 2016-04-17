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
public class BaseCharacter {
    
    Armor armor;
    String type;
    String name; 
    int AC;
    int exp;
    int str;
    int dex;
    int con;
    int intl;
    int attack;
    int health;
    int currentHealth;
    
    public BaseCharacter()
    {
        armor = new Armor();
    }
    
    public BaseCharacter(String name)
    {
        this.name = name;
        armor = new Armor();
        
    }
    
    
    public String getName()
    {
        return name;
    }
    
    public int getAC()
    {
        return AC;
    }
    
    public int getExp()
    {
        return exp;
    }
    
    public int getStr()
    {
        return str;
    }
    
    public int getDex()
    {
        return dex;
    }
    
    public int getIntl()
    {
        return intl;
    }
    
    public int getCon()
    {
        return con;
    }
    
    
    
    
    public void setAC()
    {
        int dexMod;
        dexMod = (dex - 10)/2;
        switch (str) {
        //Armor class of a warrior
            case 18:
                AC = armor.heavyArmor;
                break;
        //Armor class of a thief
            case 12:
                AC = dexMod + armor.mediumArmor;
                break;
        //Armor class of a wizard
            case 8:       
                AC = dexMod + armor.lightArmor;
                break;
            default:
                break;
        }
    }
    
    public int getMod(int stat)
    {
        return (stat - 10)/2;
    }
    
    public void setHealth(int base)
    {
          health = base + getMod(con);
    }
    
    public void levelUp(int constant)
    {
        currentHealth = health = health + constant + con;  //Everytime the character levels, their health will increase according to this formula.
        
    }
    
}
