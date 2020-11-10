package me.impurity.tpscommand;

import org.bukkit.plugin.java.JavaPlugin;

public final class Tpscommand extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("tps command enabled");
        this.getCommand("lag").setExecutor(new lagcommand());

    }

    @Override
    public void onDisable() {

            this.getLogger().info("Tps command disabled");

    }
}
