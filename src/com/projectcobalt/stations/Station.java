/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.projectcobalt.stations;

import org.bukkit.Location;

/**
 *
 * @author tludka
 */
public class Station {
    private String name;
    private Location loc;
    private Location corner1;
    private Location corner2;
    private Location corner3;
    private Location corner4;
    private StationType type;
    private boolean isCreated;
    private boolean isActive;
    
    public Station(String name, Location loc, Location corner1, Location corner2, Location corner3, Location corner4, StationType type) {
        this.name = name;
        this.loc = loc;
        this.corner1 = corner1;
        this.corner2 = corner2;
        this.corner3 = corner3;
        this.corner4 = corner4;
        this.type = type;
        isCreated = false;
        isActive = false;
    }
    
    public void create() {
        //TODO: 
    }
    
    public String getName() {
        return name;
    }
    
    public Location getLocation() {
        return loc;
    }
    
    public StationType getType() {
        return type;
    }
}
