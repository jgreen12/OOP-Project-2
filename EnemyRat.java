/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denny
 */
public class EnemyRat extends BaseCharacter {
    
        public EnemyRat()
    {
        super();
        this.type = "Rat";
        this.AC = 8;
        this.exp = 5;
        this.str = 12;
        this.dex = 15;
        this.con = 8;
        this.intl = 8;      
        super.setHealth(5);            
    }
    
}
