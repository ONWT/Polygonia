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

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;

class PolygoniasConfiguration extends FileConfiguration{
    
    protected PolygoniasConfiguration() {
    }
    
    protected FileConfiguration config;
    
    public boolean enableRadius;
    public int mapRadius = 0;
    public boolean defaultEnter;
    public boolean defaultBuild;
    public boolean defaultDestroy;
    public int zoneTool = 280;
    
    //Database Type
    public static String Database_Type;
    
    //Relational SQL Generics
    public static String SQL_Hostname;
    public static String SQL_Port;
    public static String SQL_Username;
    public static String SQL_Password;
    
    //SQL Generics
    public static String SQL_Database;
    public static String SQL_Table;
    
    
    public void setDefaults(){
        this.enableRadius = true;
        this.mapRadius = 1000;
        this.defaultEnter = true;
        this.defaultBuild = true;
        this.defaultDestroy = true;       
        this.zoneTool = 280;
        Database_Type = "MySQL";
        SQL_Hostname = "localhost";
        SQL_Port = "3306";
        SQL_Username = "root";
        SQL_Password = "";
        SQL_Database = "minecraft";
        SQL_Table = "Polygonias";
        
        if(!config.isSet("enable-map-radius")){config.set("enable-map-radius", enableRadius);}
        if(!config.isSet("map-radius")){config.set("map-radius", mapRadius);}
        if(!config.isSet("allow-enter-by-default")){config.set("allow-enter-by-default", defaultEnter);}
        if(!config.isSet("allow-build-by-default")){config.set("allow-build-by-default", defaultBuild);}
        if(!config.isSet("allow-destroy-by-default")){config.set("allow-destroy-by-default", defaultDestroy);}
        if(!config.isSet("zone-selection-tool")){config.set("zone-selection-tool", zoneTool);}
        
        if(!config.isSet("System.Database.Type")){config.set("System.Database.Type", Database_Type);}        
        if(!config.isSet("System.Database.Name")){config.set("System.Database.Name", SQL_Database);}
        if(!config.isSet("System.Database.Table")){config.set("System.Database.Table", SQL_Table);}
        
        if(!config.isSet("System.Database.MySQL.Hostname")){config.set("System.Database.MySQL.Hostname", SQL_Hostname);}
        if(!config.isSet("System.Database.MySQL.Port")){config.set("System.Database.MySQL.Port", SQL_Port);}
        if(!config.isSet("System.Database.MySQL.Username")){config.set("System.Database.MySQL.Username", SQL_Username);}
        if(!config.isSet("System.Database.MySQL.Password")){config.set("System.Database.MySQL.Password", SQL_Password);}
        
        
    }
    
    public FileConfiguration get(FileConfiguration config){
        this.config = config;
        setDefaults();
        
        
        return this.config;
    }

    @Override
    public String saveToString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void loadFromString(String string) throws InvalidConfigurationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected String buildHeader() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
