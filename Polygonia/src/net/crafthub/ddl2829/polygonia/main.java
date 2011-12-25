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
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.bukkit.Location;

/**
 *
 * @author noobs
 */

public class main {
    public static void main(String [ ] args){
        AreaHandler handler = new AreaHandler();
        Random randomGenerator = new Random();
        Set<String> Owners= new HashSet<String>();
        Owners.add("Noobidoo");
        for(int i=0;i==50000;i++){
            Integer xorgs=randomGenerator.nextInt(1000000);
            Integer yorgs=randomGenerator.nextInt(1000000);
            int[] x = {getRandomInteger(xorgs-1000,xorgs+1000,randomGenerator),getRandomInteger(xorgs-1000,xorgs+1000,randomGenerator),getRandomInteger(xorgs-1000,xorgs+1000,randomGenerator),getRandomInteger(xorgs-1000,xorgs+1000,randomGenerator)};  
            int[] y = {getRandomInteger(yorgs-1000,yorgs+1000,randomGenerator),getRandomInteger(yorgs-1000,yorgs+1000,randomGenerator),getRandomInteger(yorgs-1000,yorgs+1000,randomGenerator),getRandomInteger(yorgs-1000,yorgs+1000,randomGenerator)};  
            handler.addArea(new PolygonArea(new Polygon(x, y, x.length),Owners, 70, 64));
        }
        for (int testpoint=0;testpoint==100000;testpoint++){
            Integer xorgs=randomGenerator.nextInt(1000000);
            Integer yorgs=randomGenerator.nextInt(1000000);
            Location loc = new Location(null, xorgs, 64, yorgs);
            Set<PolygonArea> areasAfected = handler.getAreasAfected(loc);
        }
    }
    private static Integer getRandomInteger(int aStart, int aEnd, Random aRandom){
    if ( aStart > aEnd ) {
      throw new IllegalArgumentException("Start cannot exceed End.");
    }
    //get the range, casting to long to avoid overflow problems
    long range = (long)aEnd - (long)aStart + 1;
    // compute a fraction of the range, 0 <= frac < range
    long fraction = (long)(range * aRandom.nextDouble());
    return (int)(fraction + aStart);    
  }
}
