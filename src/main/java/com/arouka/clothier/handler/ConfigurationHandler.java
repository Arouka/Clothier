package com.arouka.clothier.handler;


import com.arouka.clothier.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean funValue = false;

    public static void init(File configFile) {

        // Create the config object from the given config file
        if (configuration == null) {

            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event) {

        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {

            loadConfiguration();
        }
    }

    public void loadConfiguration(){

       funValue = configuration.getBoolean("I Like Pants", Configuration.CATEGORY_GENERAL, false, "Pointless stuff woohoo");

        if (configuration.hasChanged()) {

            configuration.save();
        }
    }
}
