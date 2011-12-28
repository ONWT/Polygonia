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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Integer xorgs=randomGenerator.nextInt(1000000);
        Integer yorgs=randomGenerator.nextInt(1000000);
        int[] x = {getRandomInteger(xorgs-1000,xorgs+1000,randomGenerator),getRandomInteger(xorgs-1000,xorgs+1000,randomGenerator),getRandomInteger(xorgs-1000,xorgs+1000,randomGenerator),getRandomInteger(xorgs-1000,xorgs+1000,randomGenerator)};  
        int[] y = {getRandomInteger(yorgs-1000,yorgs+1000,randomGenerator),getRandomInteger(yorgs-1000,yorgs+1000,randomGenerator),getRandomInteger(yorgs-1000,yorgs+1000,randomGenerator),getRandomInteger(yorgs-1000,yorgs+1000,randomGenerator)};  
        
        PolygonArea area = new PolygonArea(new Polygon(x, y, x.length),Owners, 70, 64,"Test area");
        //handler.addArea(area);
        try {
            //area = handler.getAreaByName("Test area");
            System.out.println(Arrays.toString(area.getArea().xpoints));
            System.out.println(Arrays.toString(area.getArea().ypoints));
            FileOutputStream fos = null;
            FileInputStream fis = null;
            ObjectOutputStream out = null;
            ObjectInputStream in = null;
            fos = new FileOutputStream(area.getName()+".area");
            out = new ObjectOutputStream(fos);
            out.writeObject(area);
            out.close();
            fis = new FileInputStream(area.getName()+".area");
            in = new ObjectInputStream(fis);
            PolygonArea area2 = (PolygonArea)in.readObject();
            in.close();
            System.out.println(Arrays.toString(area2.getArea().xpoints));
            System.out.println(Arrays.toString(area2.getArea().ypoints));
        } catch (Exception ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
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
