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

import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockSpreadEvent;

class PolygoniasBlockListener extends BlockListener{

    @Override
    public void onBlockBurn(BlockBurnEvent event) {
        if(!event.isCancelled()){
            if(!plugin.getAreahandler().checkFlag(CFlags.FireBlockDamage, event.getBlock().getLocation()))
                event.setCancelled(true);
        }
        super.onBlockBurn(event);
    }

    @Override
    public void onBlockDamage(BlockDamageEvent event) {
        if(!event.isCancelled()){
            if(!plugin.getAreahandler().checkFlag(CFlags.Destroy, event.getBlock().getLocation(),event.getPlayer().getName()))
                event.setCancelled(true);
        }
        super.onBlockDamage(event);
    }

    @Override
    public void onBlockDispense(BlockDispenseEvent event) {
        if(!event.isCancelled()){
            if(!plugin.getAreahandler().checkFlag(CFlags.Dispence, event.getBlock().getLocation()))
                event.setCancelled(true);
        }
        super.onBlockDispense(event);
    }

    @Override
    public void onBlockCanBuild(BlockCanBuildEvent event) {
        super.onBlockCanBuild(event);
    }

    @Override
    public void onBlockForm(BlockFormEvent event) {
        if(!event.isCancelled()){
            switch(event.getNewState().getType()){
                case ICE:
                    if(!plugin.getAreahandler().checkFlag(CFlags.IceSpread, event.getNewState().getBlock().getLocation()))
                        event.setCancelled(true);
                    break;
                case SNOW:
                    if(!plugin.getAreahandler().checkFlag(CFlags.Snowfall, event.getNewState().getBlock().getLocation()))
                        event.setCancelled(true);
                    break;
            }
        }
        super.onBlockForm(event);
    }

    @Override
    public void onBlockFromTo(BlockFromToEvent event) {
        if(!event.isCancelled()){
            if(plugin.getAreahandler().checkFlag(CFlags.Flow, event.getBlock().getLocation()))
            {
                switch(event.getBlock().getType()){
                    case WATER:
                    case STATIONARY_WATER:
                        if(!plugin.getAreahandler().checkFlag(CFlags.WaterFlow, event.getBlock().getLocation()))
                            event.setCancelled(true);
                        break;
                    case LAVA:
                    case STATIONARY_LAVA:
                        if(!plugin.getAreahandler().checkFlag(CFlags.LavaFlow, event.getBlock().getLocation()))
                            event.setCancelled(true);
                        break;
                    default:
                        break;
                }
            }
        }
        super.onBlockFromTo(event);
    }

    @Override
    public void onBlockIgnite(BlockIgniteEvent event) {
        if(!event.isCancelled()){
            if(!plugin.getAreahandler().checkFlag(CFlags.Ignite, event.getBlock().getLocation(),event.getPlayer().getName()))
                event.setCancelled(true);
        }
        super.onBlockIgnite(event);
    }

    @Override
    public void onBlockPistonExtend(BlockPistonExtendEvent event) {
        if(!event.isCancelled()){
            if(!plugin.getAreahandler().checkFlag(CFlags.Piston, event.getBlock().getLocation()))
                event.setCancelled(true);
        }
        super.onBlockPistonExtend(event);
    }

    @Override
    public void onBlockPlace(BlockPlaceEvent event) {
        if(!event.isCancelled()){
            if(!plugin.getAreahandler().checkFlag(CFlags.Build, event.getBlock().getLocation(),event.getPlayer().getName()))
                event.setCancelled(true);
        }
        super.onBlockPlace(event);
    }

    @Override
    public void onBlockSpread(BlockSpreadEvent event) {
        if(!event.isCancelled()){
            switch(event.getSource().getType()){
                case GRASS:
                    if(!plugin.getAreahandler().checkFlag(CFlags.Grassspread, event.getBlock().getLocation()))
                        event.setCancelled(true);
                    break;
                case FIRE:
                    if(!plugin.getAreahandler().checkFlag(CFlags.Firespread, event.getBlock().getLocation()))
                        event.setCancelled(true);
                    break;
                case RED_MUSHROOM:
                case BROWN_MUSHROOM:
                    if(!plugin.getAreahandler().checkFlag(CFlags.Mushroomspread, event.getBlock().getLocation()))
                        event.setCancelled(true);
                    break;
                default:
                    break;
            }
        }
        super.onBlockSpread(event);
    }
    public Polygonias plugin;
    
    public PolygoniasBlockListener(Polygonias instance) {
        this.plugin = instance;
    }
    
}
