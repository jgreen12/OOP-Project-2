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
        this.str = 10;
        this.dex = 18;
        this.con = 12;
        this.intl = 10;
        this.attack = 10;
        super.setAC();
        super.setHealth(16); //A thief base health will be 16 + con, and after every level 10 + con.
        
    }
    
    public Thief()
    {
        
    }
    
}
