package me.Black.example;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    public void onEnable() {
        System.out.println ("Hello");

        getServer().getPluginManager().registerEvents(new BlockBreak(),this );
        getServer().getPluginManager().registerEvents(new BlockPlace(),this);
    }
    
}
