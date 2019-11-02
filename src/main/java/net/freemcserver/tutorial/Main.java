package net.freemcserver.tutorial;

import net.freemcserver.tutorial.listeners.BlockListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    // This is a lifecycle method from Spigot, when your plugin is loaded (server start)
    // this code will be executed by Spigot, this is where you would initialize a database connection
    // or load a config file
    public void onEnable(){
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN +
                "This is a test message from our plugin onEnable");

        getServer().getPluginManager().registerEvents(new BlockListener(), this);
    }

    // This is a lifecycle method from Spigot, when your plugin is disabled (server stop)
    // this code will be executed by Spigot, save data before a shutdown, like saving a config file
    // or load a config file
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED +
                "This is our plugin being disabled");
    }
}
