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
    Weapons weapons;
    int AC;
    int exp;
    int str;
    int dex;
    int con;
    int intl;
    int mod;
    int equipedWeapon;
    int health;
    int currentHealth;
    
    public BaseCharacter()
    {
        armor = new Armor();
        weapons = new Weapons();
    }
    
    public BaseCharacter(String name)
    {
        this.name = name;
        armor = new Armor();
        weapons = new Weapons();
        
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
                equipedWeapon = weapons.Club;
                break;
        //Armor class of a thief
            case 12:
                AC = dexMod + armor.mediumArmor;
                equipedWeapon = weapons.dagger;
                break;
        //Armor class of a wizard
            case 8:       
                AC = dexMod + armor.lightArmor;
                equipedWeapon = weapons.staff;
                break;
            default:
                break;
        }
    }
    
    public void setMod(int stat)
    {
        mod = (stat - 10)/2;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getMod(int stat)
    {
        return (stat - 10)/2;
    }
    
    public void setHealth(int base)
    {
          health = base + getMod(con);
          currentHealth = health;
    }
    
    public void levelUp()
    {
        if(type == "Warrior")
        {
            currentHealth = health = health + 10 + getMod(con);
        }  
        else if(type == "Wizard")
        {
            currentHealth = health = health + 4 + getMod(con);
        }
        else if(type == "Thief")
        {
            currentHealth = health = health + 6 + getMod(con);
        }
        
    }

    
}
