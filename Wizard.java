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
        this.intl = 18;
        this.attack = 12;
        super.setAC();
        super.setHealth(14); //A wizard base health will be 14 + con, and after every level 8 + con.
    }
    
    public Wizard()
    {
        
    }
    
}
