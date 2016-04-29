/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denny
 */
public class EnemySlime extends BaseCharacter{
    
    public EnemySlime()
    {
        super();
        this.type = "Slime";
        this.AC = 10;
        this.exp = 7;
        this.str = 12;
        this.dex = 12;
        this.con = 10;
        this.intl = 5;      
        super.setHealth(9);            
    }
    
}
