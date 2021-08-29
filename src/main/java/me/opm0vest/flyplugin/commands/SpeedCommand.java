package me.opm0vest.flyplugin.commands;

import me.opm0vest.flyplugin.Main;
import me.opm0vest.flyplugin.util.Util;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpeedCommand implements CommandExecutor {

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

            if (args.length == 0) {
                player.sendMessage("speed help");
                return false;
            }

            if (args.length == 1) {
                int speed = 1;
                try {
                    speed = Integer.parseInt(args[0]);
                } catch (NumberFormatException e) {
                    player.sendMessage("Only integer values are allowed here");
                    return true;
                }
                if (player.hasPermission("fly.speed") | player.hasPermission("fly.speed.10")) {
                    if (speed < -10 || speed > 10) {
                        player.sendMessage("Speed can't be less than -10 or more than 10");
                    } else {
                        player.setFlySpeed(speed / 10.0f);
                        player.sendMessage("Flyspeed set to " + speed);
                    }
                    return true;
                }
                if (player.hasPermission("fly.speed.9")) {
                    if (speed <= 9) {
                        player.setFlySpeed(speed / 10.0f);
                        player.sendMessage("Flyspeed set to " + speed);
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                    return true;
                }
                if (player.hasPermission("fly.speed.8")) {
                    if (speed <= 8) {
                        player.setFlySpeed(speed / 10.0f);
                        player.sendMessage("Flyspeed set to " + speed);
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                    return true;
                }
                if (player.hasPermission("fly.speed.7")) {
                    if (speed <= 7) {
                        player.setFlySpeed(speed / 10.0f);
                        player.sendMessage("Flyspeed set to " + speed);
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                    return true;
                }
                if (player.hasPermission("fly.speed.6")) {
                    if (speed <= 6) {
                        player.setFlySpeed(speed / 10.0f);
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                    return true;
                }
                if (player.hasPermission("fly.speed.5")) {
                    if (speed <= 5) {
                        player.setFlySpeed(speed / 10.0f);
                        player.sendMessage("Flyspeed set to " + speed);
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                    return true;
                }
                if (player.hasPermission("fly.speed.4")) {
                    if (speed <= 4) {
                        player.setFlySpeed(speed / 10.0f);
                        player.sendMessage("Flyspeed set to " + speed);
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                    return true;
                }
                if (player.hasPermission("fly.speed.3")) {
                    if (speed <= 3) {
                        player.setFlySpeed(speed / 10.0f);
                        player.sendMessage("Flyspeed set to " + speed);
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                    return true;
                }
                if (player.hasPermission("fly.speed.2")) {
                    if (speed <= 2) {
                        player.setFlySpeed(speed / 10.0f);
                        player.sendMessage("Flyspeed set to " + speed);
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                    return true;
                }
                if (player.hasPermission("fly.speed.1")) {
                    if (speed <= 1) {
                        player.setFlySpeed(speed / 10.0f);
                        player.sendMessage("Flyspeed set to " + speed);
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                    return true;
                }
                player.sendMessage("You don't have permission to do that");
                return true;
            }
        }

        if (args[1] != null) {
            if (args.length >= 0) {
                Player target = Bukkit.getPlayer(args[1]);
                if (target != null) {
                    int speed = 1;
                    try {
                        speed = Integer.parseInt(args[0]);
                    } catch (NumberFormatException e) {
                        player.sendMessage("Only integer values are allowed here");
                        return true;
                    }
                    if (player.hasPermission("fp.speed.allow.1")) {
                        if (speed > 1) {
                            player.sendMessage("Speed can't be more than 1");
                        } else if (target.getAllowFlight()) {
                            target.setFlySpeed(speed / 10.0f);
                            target.sendMessage("Flyspeed set to " + speed);
                        } else {
                            target.setWalkSpeed(speed / 10.0f);
                            target.sendMessage("Walkspeed set to " + speed);
                        }
                    }
                    if (player.hasPermission("fp.speed.allow.2")) {
                        if (speed > 2) {
                            player.sendMessage("Speed can't be more than 2");
                        } else if (target.getAllowFlight()) {
                            target.setFlySpeed(speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        } else {
                            target.setWalkSpeed(speed / 10.0f);
                            player.sendMessage("Walkspeed set to " + speed);
                        }
                    }
                    if (player.hasPermission("fp.speed.allow.1")) {
                        if (speed > 3) {
                            player.sendMessage("Speed can't be more than 1");
                        } else if (player.getAllowFlight()) {
                            target.setFlySpeed(speed / 10.0f);
                            target.sendMessage("Flyspeed set to " + speed);
                        } else {
                            target.setWalkSpeed(speed / 10.0f);
                            target.sendMessage("Walkspeed set to " + speed);
                        }
                    }
                    if (player.hasPermission("fp.speed.allow.1")) {
                        if (speed > 4) {
                            player.sendMessage("Speed can't be more than 1");
                        } else if (player.getAllowFlight()) {
                            target.setFlySpeed(speed / 10.0f);
                            target.sendMessage("Flyspeed set to " + speed);
                        } else {
                            target.setWalkSpeed(speed / 10.0f);
                            target.sendMessage("Walkspeed set to " + speed);
                        }
                    }
                    if (player.hasPermission("fp.speed.allow.1")) {
                        if (speed > 5) {
                            player.sendMessage("Speed can't be more than 1");
                        } else if (player.getAllowFlight()) {
                            target.setFlySpeed(speed / 10.0f);
                            target.sendMessage("Flyspeed set to " + speed);
                        } else {
                            target.setWalkSpeed(speed / 10.0f);
                            target.sendMessage("Walkspeed set to " + speed);
                        }
                    }
                    if (player.hasPermission("fp.speed.allow.1")) {
                        if (speed > 6) {
                            player.sendMessage("Speed can't be more than 1");
                        } else if (player.getAllowFlight()) {
                            target.setFlySpeed(speed / 10.0f);
                            target.sendMessage("Flyspeed set to " + speed);
                        } else {
                            target.setWalkSpeed(speed / 10.0f);
                            target.sendMessage("Walkspeed set to " + speed);
                        }
                    }
                    if (player.hasPermission("fp.speed.allow.1")) {
                        if (speed > 7) {
                            player.sendMessage("Speed can't be more than 1");
                        } else if (player.getAllowFlight()) {
                            target.setFlySpeed(speed / 10.0f);
                            target.sendMessage("Flyspeed set to " + speed);
                        } else {
                            target.setWalkSpeed(speed / 10.0f);
                            target.sendMessage("Walkspeed set to " + speed);
                        }
                    }
                    if (player.hasPermission("fp.speed.allow.1")) {
                        if (speed > 8) {
                            player.sendMessage("Speed can't be more than 1");
                        } else if (player.getAllowFlight()) {
                            target.setFlySpeed(speed / 10.0f);
                            target.sendMessage("Flyspeed set to " + speed);
                        } else {
                            target.setWalkSpeed(speed / 10.0f);
                            target.sendMessage("Walkspeed set to " + speed);
                        }
                    }
                    if (player.hasPermission("fp.speed.allow.1")) {
                        if (speed > 9) {
                            player.sendMessage("Speed can't be more than 1");
                        } else if (player.getAllowFlight()) {
                            target.setFlySpeed(speed / 10.0f);
                            target.sendMessage("Flyspeed set to " + speed);
                        } else {
                            target.setWalkSpeed(speed / 10.0f);
                            target.sendMessage("Walkspeed set to " + speed);
                        }
                    }
                    if (player.hasPermission("fp.speed.allow.1")) {
                        if (speed > 10) {
                            player.sendMessage("Speed can't be more than 1");
                        } else if (player.getAllowFlight()) {
                            target.setFlySpeed(speed / 10.0f);
                            target.sendMessage("Flyspeed set to " + speed);
                        } else {
                            target.setWalkSpeed(speed / 10.0f);
                            target.sendMessage("Walkspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage(Util.chat(this.main.getConfig().getString("Insufficient_Permission_Message")));
                    }
                } else {
                    player.sendMessage("Unknown player!");
                }
            }
        }
        return false;
    }
}