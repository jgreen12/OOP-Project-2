/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame;

/**
 *
 * @author Stephen
 */
//Class enemies and player class inherit from
public class Entity extends Nouns{
    private Room room;
    private int healthpoints;
    public Entity(String name, String description, Room room, int healthpoints)
    {
        super(name, description);
        this.room = room;
        this.healthpoints= healthpoints;
    }
    
    public void setRoom(Room room)
    {
        this.room = room;
    }
    
    public void setHealth(int healthpoints)
    {
        this.healthpoints= healthpoints;
    }
    public Room getRoom()
    {
        return room;
    }
    
    public int healthpoints()
    {
        return healthpoints;
    }
}
