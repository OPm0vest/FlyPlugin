package me.opm0vest.flyplugin.commands;

import me.opm0vest.flyplugin.Main;
import me.opm0vest.flyplugin.util.Util;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class FlyUICommand implements CommandExecutor {

    private Main main;

    public FlyUICommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if (!(sender instanceof Player)) {
            sender.sendMessage(Util.chat(this.main.getConfig().getString("Console_Error_Message")));
        }
        if (player.hasPermission("fp.fly.allow")) {
            new mainFlyUI((Player) sender, this.main);
        } else {
            player.sendMessage(Util.chat(""));
        }

        if (args.length == 1) {
            if (player.hasPermission("fp.admin.reload")) {
                if (args[0].equalsIgnoreCase("reload")) {
                    this.main.reloadConfig();
                    Bukkit.getPluginManager().disablePlugin((Plugin) this);
                    player.sendMessage("Plugin has been reloaded...");
                    Bukkit.getPluginManager().enablePlugin((Plugin) this);
                }
            } else {
                player.sendMessage(Util.chat(""));
            }

            if (args[0].equalsIgnoreCase("help")) {
                if (player.hasPermission("fp.help")) {
                    player.sendMessage(ChatColor.AQUA + "--------------------" + ChatColor.WHITE + ">>FlyPlus<<" + ChatColor.AQUA + "--------------------");
                    player.sendMessage(ChatColor.AQUA + "/fly || Toggle fly on/off. (Yourself)");
                    player.sendMessage(ChatColor.AQUA + "/fly <player> || Toggle fly on/off. (For others)");
                    player.sendMessage(ChatColor.AQUA + "/fly reload || Reload the plugin and the config.");
                    player.sendMessage(ChatColor.AQUA + "/fly help || See help page.");
                    player.sendMessage(ChatColor.AQUA + "--------------------" + ChatColor.WHITE + ">>FlyPlus<<" + ChatColor.AQUA + "--------------------");
                } else {
                    player.sendMessage(Util.chat(""));
                }
            }

            Player target = Bukkit.getPlayer(args[0]);
            if (player.hasPermission("fp.admin.flyothers")) {
                player.sendMessage(Util.chat(target + "Has enabled fly"));
                target.sendMessage("Your fly has been enable by " + player);
            } else {
                player.sendMessage(Util.chat(this.main.getConfig().getString("Admin_Insufficient_Permission")));
            }
        }
        return true;
    }
}
