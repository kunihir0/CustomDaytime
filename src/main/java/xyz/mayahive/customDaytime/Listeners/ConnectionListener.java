package xyz.mayahive.customDaytime.Listeners;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import xyz.mayahive.customDaytime.Utils.TimeUtils;

public class ConnectionListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        World world = event.getPlayer().getWorld();

        if (!TimeUtils.isEnoughPlayersSleeping(world)) {
            TimeUtils.stopNightFastForward(world);
        }
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        World world = event.getPlayer().getWorld();

        if (!TimeUtils.isEnoughPlayersSleeping(world)) {
            TimeUtils.stopNightFastForward(world);
        }
    }
}
