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
    int mod; 
    
    public BaseCharacter()
    {
       armor = new Armor();
    }
    
    public BaseCharacter(String name)
    {
        this.name = name;
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
        if(str == 18) //Armor class of a warrior
        {
            AC = armor.heavyArmor;
        }
        else if(str == 12) //Armor class of a thief
        {
            AC = dexMod + armor.mediumArmor;
        }
        else if(str == 8) //Armor class of a wizard
        {
             AC = dexMod + armor.lightArmor;       
        }
    }
    
    public void setMod(int stat)
    {
        mod = (stat - 10)/2;
        System.out.println("Testing: " + str + ","+ dex + "," + con+ "," + intl);
        System.out.println("Testing: " + mod);
    }
    
}
