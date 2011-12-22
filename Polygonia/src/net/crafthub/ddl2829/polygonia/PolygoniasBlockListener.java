package net.crafthub.ddl2829.polygonia;

import org.bukkit.event.block.BlockListener;

class PolygoniasBlockListener extends BlockListener{
    public Polygonias plugin;
    
    public PolygoniasBlockListener(Polygonias instance) {
        this.plugin = instance;
    }
    
}
