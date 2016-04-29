/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denny
 */
public class EnemyGolem extends BaseCharacter {
    
    public EnemyGolem()
    {
        super();
        this.type = "Golem";
        this.AC = 16;
        this.exp = 45;
        this.str = 18; //Golems mod stat, getMod(str); 
        this.dex = 16;
        this.con = 20;
        this.intl = 8;
        this.equipedWeapon = 12;
        super.setMod(str);
        super.setHealth(75);
        
    }
    
}
