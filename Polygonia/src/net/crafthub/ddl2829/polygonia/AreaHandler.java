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

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;

/**
 *
 * @author noobs
 */
public class AreaHandler {

    private Map<String,PolygonArea> Activeareas;
    private Plugin plugin;

    public AreaHandler(Plugin mPlugin) {
        plugin = mPlugin;
    }

    AreaHandler() {
    }
    public Set<PolygonArea> getAreasAfected(Location cord){
        Set<PolygonArea> ret = new HashSet<PolygonArea>();
        for (String a : Activeareas.keySet()){
           if(Activeareas.get(a).isBlockInPolygon(cord)){
            ret.add(Activeareas.get(a));
           }    
        }
        return ret;
    }
    
    public PolygonArea getAreaByName(String name) throws Exception{
        if (Activeareas.containsKey(name))
            return Activeareas.get(name);
        else
            throw new Exception("No area by that name");
    }
    
    public Boolean checkFlag(CFlags flag, Location cord, String PlayerName){
        Boolean ret = true;
        for(PolygonArea area: getAreasAfected(cord)){
            ret &= area.getPlayerFlag(PlayerName, flag);
        }
        return ret;
    }
    
    public Boolean checkFlag(CFlags flag, Location cord){
        Boolean ret = true;
        for(PolygonArea area: getAreasAfected(cord)){
            ret &= area.getFlag(flag);
        }
        return ret;
    }
    
    public void addArea(PolygonArea area){
        Activeareas.put(area.getName(),area);
    }
 
    public void removeArea(PolygonArea area){
        Activeareas.remove(area.getName());
    }
    
    public void saveToFile(){
        if(plugin.getDataFolder().canWrite()){
            for(String areaToSave : Activeareas.keySet()){
                PolygonArea area = Activeareas.get(areaToSave);
                
                FileOutputStream fos = null;
                ObjectOutputStream out = null;
                try
                {
                    fos = new FileOutputStream(plugin.getDataFolder().getAbsolutePath()+area.getName());
                    out = new ObjectOutputStream(fos);
                    out.writeObject(area);
                    out.close();
                }
                catch(IOException ex)
                {
                }
            }
        }
    }
}
