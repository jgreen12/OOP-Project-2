/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denny
 */
public class Thief extends BaseCharacter{
    
    public Thief(String name)
    {
        super(name);
        this.type = "Thief";
        this.AC = 0;
        this.exp = 0;
        this.str = 12;
        this.dex = 18; //Thief mod stat, getMod(dex); 
        this.con = 12;
        this.intl = 10;
        super.setMod(dex);
        super.setAC(); 
        super.setHealth(18);
    }
    
    public Thief()
    {
        
    }
    
}
