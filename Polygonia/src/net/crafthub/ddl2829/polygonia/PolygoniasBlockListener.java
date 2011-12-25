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
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockSpreadEvent;

class PolygoniasBlockListener extends BlockListener{

    @Override
    public void onBlockBurn(BlockBurnEvent event) {
        super.onBlockBurn(event);
    }

    @Override
    public void onBlockDamage(BlockDamageEvent event) {
        super.onBlockDamage(event);
    }

    @Override
    public void onBlockDispense(BlockDispenseEvent event) {
        super.onBlockDispense(event);
    }

    @Override
    public void onBlockFromTo(BlockFromToEvent event) {
        super.onBlockFromTo(event);
    }

    @Override
    public void onBlockIgnite(BlockIgniteEvent event) {
        super.onBlockIgnite(event);
    }

    @Override
    public void onBlockPistonExtend(BlockPistonExtendEvent event) {
        super.onBlockPistonExtend(event);
    }

    @Override
    public void onBlockPlace(BlockPlaceEvent event) {
        super.onBlockPlace(event);
    }

    @Override
    public void onBlockSpread(BlockSpreadEvent event) {
        super.onBlockSpread(event);
    }
    public Polygonias plugin;
    
    public PolygoniasBlockListener(Polygonias instance) {
        this.plugin = instance;
    }
    
}
