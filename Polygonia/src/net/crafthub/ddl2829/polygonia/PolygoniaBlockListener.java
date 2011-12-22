package net.crafthub.ddl2829.polygonia;

import org.bukkit.event.block.BlockListener;

class PolygoniaBlockListener extends BlockListener{
    public Polygonia plugin;
    
    public PolygoniaBlockListener(Polygonia instance) {
        this.plugin = instance;
    }
    
}
