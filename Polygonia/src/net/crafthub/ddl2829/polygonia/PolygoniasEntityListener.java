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

import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EndermanPickupEvent;
import org.bukkit.event.entity.EndermanPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityListener;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.painting.PaintingBreakEvent;

class PolygoniasEntityListener extends EntityListener {

    @Override
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        super.onCreatureSpawn(event);
    }

    @Override
    public void onEndermanPickup(EndermanPickupEvent event) {
        super.onEndermanPickup(event);
    }

    @Override
    public void onEndermanPlace(EndermanPlaceEvent event) {
        super.onEndermanPlace(event);
    }

    @Override
    public void onEntityDamage(EntityDamageEvent event) {
        super.onEntityDamage(event);
    }

    @Override
    public void onEntityExplode(EntityExplodeEvent event) {
        super.onEntityExplode(event);
    }

    @Override
    public void onEntityRegainHealth(EntityRegainHealthEvent event) {
        super.onEntityRegainHealth(event);
    }

    @Override
    public void onExplosionPrime(ExplosionPrimeEvent event) {
        super.onExplosionPrime(event);
    }

    @Override
    public void onFoodLevelChange(FoodLevelChangeEvent event) {
        super.onFoodLevelChange(event);
    }

    @Override
    public void onPaintingBreak(PaintingBreakEvent event) {
        super.onPaintingBreak(event);
    }

    @Override
    public void onProjectileHit(ProjectileHitEvent event) {
        super.onProjectileHit(event);
    }
    public Polygonias plugin;
    
    public PolygoniasEntityListener(Polygonias instance) {
        this.plugin = instance;
    }
}
