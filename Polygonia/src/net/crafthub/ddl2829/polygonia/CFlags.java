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

/**
 *  Build,                  //Controls build permissions
 *  Destroy,                //Controls destory permissions
 *  Use,                    //Controls use permissions on buttons, levers, preasureplates,doors
 *  Container,              //Controls container access permissions  to chest, furnases
 *  PvP,                    //Controls Player vs. Player permissions
 *  PvE,                    //Controls Player vs. Enemy(Monsters, animals) permissions
 *  Damage,                 //Controls all damage taken if false no damage will be dealt
 *  Move,                   //Controls move/enter permissions
 *  Bucket,                 //Controls bucket fill and empty permissions
 *  Firespread,             //Controls firespread in area
 *  Grassspread,            //Controls grassspread in area
 *  IceSpread,              //controls Icespread in thundra and taiga biomes
 *  Mushroomspread,         //Controls both red and green mushroom spread
 *  Snowfall,               //Controls snow fomrmation during snow storm
 *  Ignite,                 //Controls ignite permissions
 *  FireBlockDamage,        //Controls if a block is broken from it burning
 *  Animals,                //Controls animal spawn in area
 *  Monsters,               //Controls mob spawn in area
 *  EndermanPlace,          //Controls enderman place in area
 *  EndermanPickup,         //Controls enderman pickup in area
 *  CreeperExplosion,       //Controls creeper explosion in area
 *  Flow,                   //Controls all liquid flow in area
 *  LavaFlow,               //Controls lava flow in area
 *  WaterFlow,              //Controls water flow in area
 *  Piston,                 //Controls piston extend permissions in area
 *  TnT,                    //Controls tnt prime in area
 *  Foodreplenish,          //Controls eating permissions
 *  Foodheal,               //Controls if full healt bar heals in this area in area
 *  Dispence,               //Controls if Dispensers can shoot
 * 
 * @author noobs
 */
public enum CFlags{
    Build,                  //Controls build permissions
    Destroy,                //Controls destory permissions
    Use,                    //Controls use permissions on buttons, levers, preasureplates,doors
    Container,              //Controls container access permissions  to chest, furnases
    PvP,                    //Controls Player vs. Player permissions
    PvE,                    //Controls Player vs. Enemy(Monsters, animals) permissions
    Damage,                 //Controls all damage taken if false no damage will be dealt
    Move,                   //Controls move/enter permissions
    Bucket,                 //Controls bucket fill and empty permissions
    Firespread,             //Controls firespread in area
    Grassspread,            //Controls grassspread in area
    IceSpread,              //controls Icespread in thundra and taiga biomes
    Mushroomspread,         //Controls both red and green mushroom spread
    Snowfall,               //Controls snow fomrmation during snow storm
    Ignite,                 //Controls ignite permissions
    FireBlockDamage,        //Controls if a block is broken from it burning
    Animals,                //Controls animal spawn in area
    Monsters,               //Controls mob spawn in area
    EndermanPlace,          //Controls enderman place in area
    EndermanPickup,         //Controls enderman pickup in area
    CreeperExplosion,       //Controls creeper explosion in area
    Flow,                   //Controls all liquid flow in area
    LavaFlow,               //Controls lava flow in area
    WaterFlow,              //Controls water flow in area
    Piston,                 //Controls piston extend permissions in area
    TnT,                    //Controls tnt prime in area
    Foodreplenish,          //Controls eating permissions
    Foodheal,               //Controls if full healt bar heals in this area in area
    Dispence,               //Controls if Dispensers can shoot
}
