/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.projectcobalt;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;


/**
 *
 * @author tludka
 */
public class ProjectCobalt extends JavaPlugin {
    
    @Override
    public void onEnable() {
        log("Enabling Project Cobalt");
    }
    
    @Override
    public void onDisable() {
        
    }
    
    public static void log(String msg) {
        Logger log = Logger.getLogger("Minecraft");
        log.log(Level.INFO, "[Project Cobalt] {0}", msg);
    }
    
}
