package me.opm0vest.flyplugin.commands;

import me.opm0vest.flyplugin.Main;
import me.opm0vest.flyplugin.util.Util;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpeedCommand implements CommandExecutor {

    //player.sendMessage("You don't have permission to do that");
    //return true;

    private Main main;

    public SpeedCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("speed")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(Util.chat(this.main.getConfig().getString("Console_Error_Message")));
            }
            int speed;
            try {
                speed = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                player.sendMessage("Only integer values are allowed here");
                return false;
            }
            if (speed < -10 || speed > 10) {
                player.sendMessage("Speed can't be less than -10 or more than 10");
            }
            if (player.isFlying()) {
                if (player.hasPermission("fly.speed")) {
                    player.setFlySpeed((float) speed / 10.0f);
                    player.sendMessage("Flyspeed set to " + speed);
                } else {
                    player.sendMessage("You don't have permission to do that");
                }
            } else {
                if (player.hasPermission("walk.speed")) {
                    player.setWalkSpeed((float) speed / 10.0f);
                    player.sendMessage("Walk set to " + speed);
                } else {
                    player.sendMessage("You don't have permission to do that");
                }
            }
            if (args.length == 2) {
                Player target = Bukkit.getPlayer(args[1]);
                if (player.isFlying()) {
                    if (player.hasPermission("fly.speed")) {
                        target.setFlySpeed((float) speed / 10.0f);
                        target.sendMessage("your speed is set to " + speed);
                        player.sendMessage("Flyspeed set to " + speed);
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                } else {
                    if (player.hasPermission("walk.speed")) {
                        target.setWalkSpeed((float) speed / 10.0f);
                        target.sendMessage("your walk speed is set to " + speed);
                        player.sendMessage("Flyspeed set to " + speed);
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                }
            }
        }
        return false;
    }
}