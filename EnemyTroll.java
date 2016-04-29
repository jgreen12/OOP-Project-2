/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denny
 */
public class EnemyTroll {
    public EnemyTroll()
    {
        super();
        this.type = "Troll";
        this.AC = 16;
        this.exp = 25;
        this.str = 18; //Trolls mod stat, getMod(str); 
        this.dex = 12;
        this.con = 15;
        this.intl = 8;
        super.setMod(str);
        super.setHealth(40);
        
    }
}
