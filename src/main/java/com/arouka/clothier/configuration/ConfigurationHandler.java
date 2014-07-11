package com.arouka.clothier.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static void init(File configFile) {

       // Create the config object from the given config file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try {

            // Load the config file
            configuration.load();

            // Read in properties from config file
            configValue = configuration.get("I Like Pants", "imDoingNothing", true, "Random config value, WOOHOO!").getBoolean(true);
        }
        catch (Exception e) {

            // Log the exception
        }
        finally {

            // Save the config file
            configuration.save();
        }

        System.out.println("Config Test" + configValue);
    }
}
