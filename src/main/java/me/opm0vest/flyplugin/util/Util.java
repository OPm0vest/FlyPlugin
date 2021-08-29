package me.opm0vest.flyplugin.util;


import me.opm0vest.flyplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Util {
    public static Main main;

    public Util(Main main) {
        Util.main = main;
    }

    public static String chat(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static void log(String s) {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[&3&lFlyPlugin&7] " + s));
    }
}
