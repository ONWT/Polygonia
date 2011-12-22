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
import java.util.Map;
import java.util.Set;

import org.bukkit.Location;

/**
 *
 * @author noobs
 */

public class PolygonArea {
    private Polygon area;
    private Map<CFlags,Boolean> flags;
    private Map<String,Map<CFlags,Boolean>> PlayerFlags;
    private Set<String> Owners;
    private Integer MaxY;
    
    public PolygonArea(Polygon area, Set<String> Owners, Integer MaxY, Integer MinY) {
        this.area = area;
        this.Owners = Owners;
        this.MaxY = MaxY;
        this.MinY = MinY;
    }
    public Rectangle2D getBoundingbox(){
        return area.getBounds2D();
    }
    
    public boolean isBlockInPolygon(Location cord){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void setPlayerFlag(String name, CFlags flag,Boolean value){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void setFlag(CFlags flag,Boolean value){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Set<String> getOwners() {
        return Owners;
    }

    public Map<String, Map<CFlags, Boolean>> getPlayerFlags() {
        return PlayerFlags;
    }

    public Map<CFlags, Boolean> getPlayerFlags(String player) {
        return PlayerFlags.get(player);
    }
    public Polygon getArea() {
        return area;
    }

    public Map<CFlags, Boolean> getFlags() {
        return flags;
    }

    public Integer getMaxY() {
        return MaxY;
    }

    public void setMaxY(Integer MaxY) {
        this.MaxY = MaxY;
    }

    public Integer getMinY() {
        return MinY;
    }

    public void setMinY(Integer MinY) {
        this.MinY = MinY;
    }
    private Integer MinY;
}
