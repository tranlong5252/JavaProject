package net.minefs.tranlong5252;

import net.minefs.tranlong5252.cmd.bruh;
import net.minefs.tranlong5252.cmd.hello;
import net.minefs.tranlong5252.events.events;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Objects;


public final class Test extends JavaPlugin implements Listener {
    public HashMap<String, Long> cooldowns = new HashMap<>();
    public int cooldownTime = 10;
    @Override
    public void onEnable() {
        loadConfig();
        Objects.requireNonNull(getCommand("bruh")).setExecutor(new bruh());
        Objects.requireNonNull(getCommand("hello")).setExecutor(new hello());
        getServer().getPluginManager().registerEvents(new events(), this);
        getLogger().info(ChatColor.AQUA + "Plugin đang được bật");

    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }


    @Override
    public void onDisable() {
        getLogger().info(ChatColor.AQUA + "Plugin đã được tắt");

    }
}
