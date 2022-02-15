package me.tomle.remotechat;

import me.tomle.remotechat.Commands.remoteCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class RemoteChat extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("remote").setExecutor(new remoteCommand());
        System.out.println("Plugin RemoteChat successfully loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
