/*
 * The MIT License
 *
 * Copyright 2011 noobs.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.crafthub.ddl2829.polygonia;

import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.bukkit.Location;

/**
 *
 * @author noobs
 */

public class PolygonArea implements Serializable {
    private String name;
    private Map<CFlags,Boolean> flags;
    /**
     * key: player name
     * value: Map of enum CFlags as key and a boolean as value
     */
    private Map<String,Map<CFlags,Boolean>> PlayerFlags = new HashMap<String,Map<CFlags,Boolean>>();
    private Set<String> Owners = new HashSet<String>();
    private Integer MaxY;
    private String World;
    private Polygon area;
    
    /**
     * 
     * @param area
     * @param Owners
     * @param MaxY
     * @param MinY
     */
    public PolygonArea(Polygon area, Set<String> Owners, Integer MaxY, Integer MinY, String name) {
        this.area = area;
        this.Owners = Owners;
        this.MaxY = MaxY;
        this.MinY = MinY;
        this.name = name;
    }
    
    /**
     * Get the bounding box for the current area (this is slow)
     * @return the bounding box of the area as a Rectangle2D
     */
    public Rectangle2D getBoundingbox(){
        return area.getBounds2D();
    }
    
    /**
     * Checks if a Location is in the current area.
     * 
     * @param cord The Location of the block
     * @return If area contains Location returns true
     */
    public boolean isBlockInPolygon(Location cord){
        return area.contains(cord.getBlockX(),cord.getBlockZ());
    }
    
    /**
     * Set player flag for the current area
     * @param name Player name
     * @param flag Flag to set
     * @param value Boolean value of the flag
     */
    public void setPlayerFlag(String name, CFlags flag,Boolean value){
        if (!PlayerFlags.containsKey(name)) {
            Map<CFlags,Boolean> temp = new EnumMap<CFlags, Boolean>(CFlags.class);
            temp.put(flag, value);
            PlayerFlags.put(name, temp);
        }else{
            PlayerFlags.get(name).put(flag, value);
        }
    }
    
    /**
     * 
     * @param flag
     * @param value
     */
    public void setFlag(CFlags flag,Boolean value){
        flags.put(flag, value);
    }
    
    /**
     * 
     * @return
     */
    public Set<String> getOwners() {
        return Owners;
    }

    /**
     * Get the full map of players and flags
     * 
     * @return All players and there flags in a <code>Map<String, Map<CFlags, Boolean>></code>
     */
    public Map<String, Map<CFlags, Boolean>> getPlayerFlags() {
        return PlayerFlags;
    }

    /**
     * Get a specific players flags or null if player hasn't been given a flag in his area.
     * 
     * @param player player name
     * @return A Map of CFlags and boolean or null if no flag for the player is set
     */
    public Map<CFlags, Boolean> getPlayerFlags(String player) {
        return PlayerFlags.get(player);
    }
    
    /**
     * Gets the specific players specific flag for current zone if none set it checks the area flags(see getFlag(CFlags cFlags))).
     * Fail checks.
     * @param player Player name
     * @param flag Flag to check
     * @return Boolean of flag state.
     */
    public Boolean getPlayerFlag(String player,CFlags flag) {
        if(PlayerFlags.containsKey(player) && PlayerFlags.get(player).containsKey(flag))
            return getPlayerFlags(player).get(flag) && getFlag(flag);
        else
            return getFlag(flag);
    }
    
    /**
     * 
     * @return
     */
    public Polygon getArea() {
        return area;
    }

    /**
     * Get current area flags
     * @return <code>Map<CFlags, Boolean></code>
     */
    public Map<CFlags, Boolean> getFlags() {
        return flags;
    }

    /**
     * 
     * @return
     */
    public Integer getMaxY() {
        return MaxY;
    }

    /**
     * 
     * @param MaxY
     */
    public void setMaxY(Integer MaxY) {
        this.MaxY = MaxY;
    }

    /**
     * 
     * @return
     */
    public Integer getMinY() {
        return MinY;
    }

    /**
     * 
     * @param MinY
     */
    public void setMinY(Integer MinY) {
        this.MinY = MinY;
    }
    private Integer MinY;
    
    /**
     * Get the area name
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Set the area name
     * @param name Area name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getWorld() {
        return World;
    }

    public void setWorld(String World) {
        this.World = World;
    }

    /**
     * Gets the area flag else the default world value is returned.
     * 
     * @param cFlags Flag to check
     * @return Boolean for the flag in the area
     */
    private Boolean getFlag(CFlags cFlags) {
        if(flags.containsKey(cFlags))
            return flags.get(cFlags);
        else
            return Polygonias.getPConfig().getDefault(cFlags);
    }
}
