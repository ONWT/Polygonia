package net.crafthub.ddl2829.polygonia;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Polygonias extends JavaPlugin{
    
    private final PolygoniasPlayerListener playerListener = new PolygoniasPlayerListener(this);
    private final PolygoniasBlockListener blockListener = new PolygoniasBlockListener(this);
    private final PolygoniasEntityListener entityListener = new PolygoniasEntityListener(this);
    private final PolygoniasVehicleListener vehicleListener = new PolygoniasVehicleListener(this);
    
    public static final Logger log = Logger.getLogger("Minecraft");
    
    private PluginManager pm = this.getServer().getPluginManager();
    protected FileConfiguration config;
    
    private PluginDescriptionFile pdFile = this.getDescription();
    
    @Override
    public void onEnable() {
        config = PolygoniasConfiguration.get(config);
        
        pm.registerEvent(Event.Type.PLAYER_JOIN, playerListener, Priority.Monitor, this);
        pm.registerEvent(Event.Type.PLAYER_QUIT, playerListener, Priority.Monitor, this);
        
        pm.registerEvent(Event.Type.PLAYER_MOVE, playerListener, Priority.Normal, this);
        pm.registerEvent(Event.Type.PLAYER_TELEPORT, playerListener, Priority.Normal, this);
        pm.registerEvent(Event.Type.PLAYER_INTERACT, playerListener, Priority.Normal, this);
        
        pm.registerEvent(Event.Type.BLOCK_PLACE, blockListener, Priority.Normal, this);
        pm.registerEvent(Event.Type.BLOCK_DAMAGE, blockListener, Priority.Normal, this);
        
        pm.registerEvent(Event.Type.ENTITY_DAMAGE, entityListener, Priority.Normal, this);
        
        pm.registerEvent(Event.Type.VEHICLE_MOVE, vehicleListener, Priority.Normal, this);
        
        
        logMessage("Enabled Successfully");
    }

    @Override
    public void onDisable() {
        
        logMessage("Disabled");
    }

    public void logMessage(String msg) {
        log.log(Level.INFO, "{0} {1}: {2}", new Object[]{pdFile.getName(), pdFile.getVersion(), msg});
    }
    

}
