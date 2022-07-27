package kick.kickplugin.command;

import kick.kickplugin.gui.menu;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.ParametersAreNonnullByDefault;

public class GuiCommand implements CommandExecutor {
    @Override
    @ParametersAreNonnullByDefault
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            String name = sender.getName();
            Player p = Bukkit.getPlayer(name);
            menu command_menu = new menu(name);
            command_menu.open();
            assert p != null;
            p.sendMessage(ChatColor.GREEN + "您一打开kick主界面");
            return true;
        }else{
            sender.sendMessage(ChatColor.RED + "禁止非玩家使用");
            return false;
        }
    }
}
