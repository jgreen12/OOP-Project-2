/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denny
 */
public class Warrior extends BaseCharacter{
    
    
    
    public Warrior(String name)
    {
        super(name);
        this.type = "Warrior";
        this.AC = 0;
        this.exp = 0;
        this.str = 18;
        this.dex = 8;
        this.con = 15;
        this.intl = 8;
        this.attack = 6;
    }
    
    public Warrior()
    {
        
    }

    
}
