/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.projectcobalt.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 *
 * @author tludka
 */
public class StationCreatedEvent extends Event {

    private HandlerList handlers;
    
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
    
    //TODO: Alert when a station is created globaly
    
}
