package net.crafthub.ddl2829.polygonia;

import org.bukkit.plugin.java.JavaPlugin;

public class Polygonia extends JavaPlugin{
    
    private final PolygoniaPlayerListener playerListener = new PolygoniaPlayerListener(this);
    private final PolygoniaBlockListener blockListener = new PolygoniaBlockListener(this);
    private final PolygoniaEntityListener entityListener = new PolygoniaEntityListener(this);
    private final PolygoniaVehicleListener vehicleListener = new PolygoniaVehicleListener(this);
    
    @Override
    public void onEnable() {
        
    }

    @Override
    public void onDisable() {
        
    }

    

}
