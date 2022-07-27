package kick.kickplugin;

import kick.kickplugin.command.GuiCommand;
import kick.kickplugin.event.menu_event;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class KickPlugin extends JavaPlugin {
    private Logger log = Bukkit.getLogger();

    @Override
    public void onLoad() {
        saveDefaultConfig();
        log.info("------------------kick加载中--------------------");
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        log.info("------------------------------------------------");
        log.info("-                  锅盖定制                      -");
        log.info("-     -   -       -       ---        -   -      -");
        log.info("-    -  -               -           -  -        -");
        log.info("-   ---         -     -            ---          -");
        log.info("-  -  -        -        -         -  -          -");
        log.info("- -    -      -          ---     -     -        -");
        log.info("------------------------------------------------");
        if(Bukkit.getPluginCommand("super_kill") != null){
            Bukkit.getPluginCommand("super_kill").setExecutor(new GuiCommand());
            Bukkit.getPluginManager().registerEvents(new menu_event() , this);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
