package net.crafthub.ddl2829.polygonia;

import org.bukkit.event.entity.EntityListener;

class PolygoniasEntityListener extends EntityListener {
    public Polygonias plugin;
    
    public PolygoniasEntityListener(Polygonias instance) {
        this.plugin = instance;
    }
}
