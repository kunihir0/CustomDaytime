package xyz.mayahive.customDaytime.Utils;

import xyz.mayahive.customDaytime.CustomDaytime;
import org.bukkit.Bukkit;
import org.bukkit.World;

public class TimeUtils {

    // Get the default spawn world
    public static World getDefaultWorld() {
        return Bukkit.getWorlds().isEmpty() ? null : Bukkit.getWorlds().getFirst();
    }

    // Getter for time increment per tick during day based on config
    public static double getDayIncrementPerTick() {

        // Get day length in game ticks from config
        double dayLengthGameTicks = CustomDaytime.getInstance().getConfig().getDouble("dayLengthMinutes", 10.0) * 60 * 20;

        // Return relative time increment in ticks
        return (12000 / dayLengthGameTicks);
    }

    // Getter for time increment per tick during night based on config
    public static double getNightIncrementPerTick() {

        // Get night length in game ticks from config
        double nightLengthGameTicks = CustomDaytime.getInstance().getConfig().getDouble("nightLengthMinutes", 10.0) * 60 * 20;

        // Return relative time increment in ticks
        return (12000 / nightLengthGameTicks);
    }
}
