/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame;

/**
 *
 * @author dmc
 */
public class Room extends Nouns{
    private int n,s,e,w;
    
    public Room(String name, String description, int n, int s, int e, int w)
    {
        super(name, description);
        this.n = n;
        this.s = s;
        this.e = e;
        this.w = w;
    }
    
    public void setNorth(int n)
    {
        this.n = n;
    }
    
    public void setSouth(int s)
    {
        this.s= s;
    }
    
    public void setEast(int e)
    {
        this.e = e;
    }
    
    public void setWest(int w)
    {
        this.w = w;
    }
    
    public int getNorth()
    {
        return n;
    }
    
    public int getSouth()
    {
        return s;
    }
    
    public int getEast()
    {
        return e;
    }
    
    public int getWest()
    {
        return w;
    }
    
}
