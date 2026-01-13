package xyz.mayahive.customDaytime;

import xyz.mayahive.customDaytime.Tasks.TimeTickTask;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomDaytime extends JavaPlugin {

    private static CustomDaytime instance;

    @Override
    public void onEnable() {

        // Set plugin instance
        instance = this;

        // Config
        saveDefaultConfig();

        // Timer
        TimeTickTask timeTickTask = new TimeTickTask();
        Bukkit.getGlobalRegionScheduler().runAtFixedRate(
                instance,
                task -> timeTickTask.run(),
                1,
                1
        );
    }

    // Plugin instance getter
    public static CustomDaytime getInstance() {return instance;}
}
