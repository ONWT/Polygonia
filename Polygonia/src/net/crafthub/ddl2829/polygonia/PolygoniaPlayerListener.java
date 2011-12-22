package net.crafthub.ddl2829.polygonia;

import org.bukkit.event.player.PlayerListener;

class PolygoniaPlayerListener extends PlayerListener {
    public Polygonia plugin;
    
    public PolygoniaPlayerListener(Polygonia instance) {
        this.plugin = instance;
    }
}
