/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Aria
 */
public class Event implements Serializable {
    private String name;
    private String organizer;
    private String level;
    private String sports;
    private String place;
    private int year;
    private int month;
    private int date;
    private int currentplayers = 0;
    private int minplayer;
    private int maxplayer;
    private int price;
    private ArrayList<String> players = new ArrayList<>();
    
private boolean status = true;
private boolean full = false;

public Event(String name, String organizer, String level, String sports, String place, int year, int month,
        int date, int minplayer, int maxplayer, int price)
{
    this.name = name;
    this.organizer = organizer;
    this.level = level;
    this.sports = sports;
    this.place = place;
    this.year = year;
    this.month = month;
    this.date = date;

    this.minplayer = minplayer;
    this.maxplayer = maxplayer;
    this.price = price;
}

    public String getOrganizer()
            {
                return organizer;
            }
    
    public Event(String name, String organizer)
    {
        this.name = name;
        this.organizer = organizer;
    }
    
    public String getName()
            {
                return name;
            }
    
    public String getSports()
    {
        return sports;
    }
    
    public String getlevel()
    {
        return level;
    }
    
    public String getsports()
    {
        return sports;
    }
    
    public String getPlace()
    {
        return place;
    }
    
    public int getYear()
            {
                return year;
            }
    public int getMonth()
    {
        return month;
    }
    
    public int getDate()
    {
        return date;
    }
   public int getCurrentplayer()
   {
       return currentplayers;
   }
    public ArrayList<String> getPlayers()
    {
        return players;
    } 
    public int getMaxplayers()
    {
        return maxplayer;
    }
    
    public int getMinplayers()
    {
        return minplayer;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public boolean isAvail()
    {
        return status;
    }
    
    public boolean isFull()
    {
        return full;
    }
    
    public void AddPlayer (String username)
    {
        int maxplayers = 0;
        
        if(currentplayers!= maxplayers)
                {
            int currentplayer = 0;
                    currentplayers = currentplayer+1;
                    full = true;
                }    
        else
        {
            full = true;
        }
    }
        public void RemovePlayer(String username)
        {
            currentplayers = currentplayers-1;
            full = false;
        }
    
    
    
}
