package io.github.sudain;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class NovaCityAnimals extends JavaPlugin implements Listener, CommandExecutor {

    private static Plugin instance;

    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();
        AnimalsCommand.Reload();
        Bukkit.getPluginManager().registerEvents(new AnimalsListener(), this);
        this.getCommand("novacityanimals").setExecutor(new AnimalsCommand());
    }

    @Override
    public void onDisable() {
        this.saveConfig();
        instance = null;
    }

    public static Plugin getInstance() { return instance;}
}
