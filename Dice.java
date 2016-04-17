/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author Denny
 */
public class Dice{
    
    Random random = new Random();
    int end;
    
    
    public Dice(int end)
    {
        this.end = end;
    }
    
    public int randomDiceAttack(int bonus)
    {
        return random.nextInt(20) + 1 + bonus;
    }

    
}
