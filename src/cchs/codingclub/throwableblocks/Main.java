package cchs.codingclub.throwableblocks;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    Plugin plugin = this;

    public static void main(String[] args) {

    }

    @Override
    public void onEnable() {
        plugin.getServer().getPluginManager().registerEvents(new ThrowListener(), plugin);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
