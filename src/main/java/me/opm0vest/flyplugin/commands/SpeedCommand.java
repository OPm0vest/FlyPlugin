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
            if (args.length == 0) {
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
                    if (player.hasPermission("fly.speed.10") || player.hasPermission("fly.speed")) {
                        if (speed == 10) {
                            player.setFlySpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.9") || player.hasPermission("fly.speed")) {
                        if (speed == 9) {
                            player.setFlySpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.8") || player.hasPermission("fly.speed")) {
                        if (speed == 8) {
                            player.setFlySpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.7") || player.hasPermission("fly.speed")) {
                        if (speed == 7) {
                            player.setFlySpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.6") || player.hasPermission("fly.speed")) {
                        if (speed == 6) {
                            player.setFlySpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.5") || player.hasPermission("fly.speed")) {
                        if (speed == 5) {
                            player.setFlySpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.4") || player.hasPermission("fly.speed")) {
                        if (speed == 4) {
                            player.setFlySpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.3") || player.hasPermission("fly.speed")) {
                        if (speed == 3) {
                            player.setFlySpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.2") || player.hasPermission("fly.speed")) {
                        if (speed == 2) {
                            player.setFlySpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.1") || player.hasPermission("fly.speed")) {
                        if (speed == 1) {
                            player.setFlySpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                } else {
                    if (player.hasPermission("fly.speed.10") || player.hasPermission("fly.speed")) {
                        if (speed == 10) {
                            player.setWalkSpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.9") || player.hasPermission("fly.speed")) {
                        if (speed == 9) {
                            player.setWalkSpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.8") || player.hasPermission("fly.speed")) {
                        if (speed == 8) {
                            player.setWalkSpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.7") || player.hasPermission("fly.speed")) {
                        if (speed == 7) {
                            player.setWalkSpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.6") || player.hasPermission("fly.speed")) {
                        if (speed == 6) {
                            player.setWalkSpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.5") || player.hasPermission("fly.speed")) {
                        if (speed == 5) {
                            player.setWalkSpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.4") || player.hasPermission("fly.speed")) {
                        if (speed == 4) {
                            player.setWalkSpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.3") || player.hasPermission("fly.speed")) {
                        if (speed == 3) {
                            player.setWalkSpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.2") || player.hasPermission("fly.speed")) {
                        if (speed == 2) {
                            player.setWalkSpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }

                    if (player.hasPermission("fly.speed.1") || player.hasPermission("fly.speed")) {
                        if (speed == 1) {
                            player.setWalkSpeed((float) speed / 10.0f);
                            player.sendMessage("Flyspeed set to " + speed);
                        }
                    } else {
                        player.sendMessage("You don't have permission to do that");
                    }
                }
            }
            if (args[2] != null) {
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
        }

        return false;
    }
}