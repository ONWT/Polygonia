package net.crafthub.ddl2829.polygonia;

import org.bukkit.event.entity.EntityListener;

class PolygoniaEntityListener extends EntityListener {
    public Polygonia plugin;
    
    public PolygoniaEntityListener(Polygonia instance) {
        this.plugin = instance;
    }
}
