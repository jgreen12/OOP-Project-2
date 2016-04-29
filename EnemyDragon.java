/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denny
 */
public class EnemyDragon extends BaseCharacter{
    
    public EnemyDragon()
    {
        super();
        this.type = "Dragon";
        this.AC = 23;
        this.exp = 100;
        this.str = 20; //Dragon mod stat, getMod(str); 
        this.dex = 20;
        this.con = 20;
        this.intl = 20;
        super.setMod(str);
        super.setHealth(200);            
    }
    
}
