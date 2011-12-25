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

import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.vehicle.VehicleListener;
import org.bukkit.event.vehicle.VehicleMoveEvent;

class PolygoniasVehicleListener extends VehicleListener {

    @Override
    public void onVehicleDamage(VehicleDamageEvent event) {
        super.onVehicleDamage(event);
    }

    @Override
    public void onVehicleEnter(VehicleEnterEvent event) {
        super.onVehicleEnter(event);
    }

    @Override
    public void onVehicleEntityCollision(VehicleEntityCollisionEvent event) {
        super.onVehicleEntityCollision(event);
    }

    @Override
    public void onVehicleExit(VehicleExitEvent event) {
        super.onVehicleExit(event);
    }

    @Override
    public void onVehicleMove(VehicleMoveEvent event) {
        super.onVehicleMove(event);
    }
    public Polygonias plugin;
    
    public PolygoniasVehicleListener(Polygonias instance) {
        this.plugin = instance;
    }
}
