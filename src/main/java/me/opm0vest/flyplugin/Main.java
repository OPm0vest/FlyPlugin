package me.opm0vest.flyplugin;

import me.opm0vest.flyplugin.commands.FlyCommand;
import me.opm0vest.flyplugin.commands.SpeedCommand;
import me.opm0vest.flyplugin.util.Util;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;

        Util.log("FlyPlugin has been &benabled!");
        this.getConfig().options().copyDefaults(true);
        this.reloadConfig();
        this.saveDefaultConfig();

        getCommand("speed").setExecutor(new SpeedCommand(this));
        getCommand("fly").setExecutor(new FlyCommand(this));
        //getCommand("fui").setExecutor(new FlyUICommand(this));

        Main.instance = this;
    }

    @Override
    public void onDisable() {
        Util.log("FlyPlugin has been disabled!");
    }

    public static Main getInstance() {
        return instance;
    }

}
