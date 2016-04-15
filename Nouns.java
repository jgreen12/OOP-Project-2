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
//Main class rooms, items, and entities inherit from
public class Nouns {
    private String name;
    private String description;
    
    public Nouns(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
    
    //Setters
    public void setname(String name)
    {
        this.name = name;
    }
    
    public void setdescription(String description)
    {
        this.description = description;
    }
    
    //Getters
    public String getname()
    {
        return name;
    }
    
    public String getdescription()
    {
        return description;
    }
}
