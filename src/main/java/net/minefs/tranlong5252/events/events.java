package net.minefs.tranlong5252.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class events implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.GREEN + "[+] " + ChatColor.YELLOW + event.getPlayer().getName());

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(ChatColor.RED + "[-] " + ChatColor.YELLOW + event.getPlayer().getName());
    }

    @EventHandler
    public void CreeperPowerEvent (CreeperPowerEvent event){ 
        Bukkit.broadcastMessage(" ");
    }
    @EventHandler
    public void PlayerChangedWorldEvent (PlayerChangedWorldEvent event){
        event.getPlayer();
    }
}
