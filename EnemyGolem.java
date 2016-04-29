/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denny
 */
public class EnemyGolem {
    public EnemyGolem()
    {
        super();
        this.type = "Goleml";
        this.AC = 16;
        this.exp = 25;
        this.str = 18; //Golems mod stat, getMod(str); 
        this.dex = 16;
        this.con = 20;
        this.intl = 8;
        super.setMod(str);
        super.setHealth(75);
        
    }
}
