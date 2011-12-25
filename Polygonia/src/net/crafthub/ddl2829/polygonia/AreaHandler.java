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

import java.util.HashSet;
import java.util.Set;
import org.bukkit.Location;

/**
 *
 * @author noobs
 */
public class AreaHandler {
    private Set<PolygonArea> Activeareas;
    
    public Set<PolygonArea> getAreasAfected(Location cord){
        Set<PolygonArea> ret = new HashSet<PolygonArea>();
        for (PolygonArea a : Activeareas){
           if(a.isBlockInPolygon(cord)){
            ret.add(a);
           }    
        }
        return ret;
    }
    public void addArea(PolygonArea area){
        Activeareas.add(area);
    }
 
    public void removeArea(PolygonArea area){
        
    }
}
