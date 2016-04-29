/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denny
 */
public class Wizard extends BaseCharacter{
    
    public Wizard(String name)
    {
        super(name);
        this.type = "Wizard";
        this.AC = 0;
        this.exp = 0;
        this.str = 8;
        this.dex = 10;
        this.con = 10;
        this.intl = 18;//Wizard mod stat, getMod(intl); 
        super.setMod(intl);
        super.setAC(); 
        super.setHealth(14);
    }
    
    public Wizard()
    {
        
    }
    
}
