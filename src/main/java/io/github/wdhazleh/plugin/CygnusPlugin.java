package io.github.wdhazleh.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class CygnusPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
