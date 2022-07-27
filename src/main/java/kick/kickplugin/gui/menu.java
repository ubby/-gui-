package kick.kickplugin.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class menu {
    public Inventory menu_inv;
    public Player p;
    public menu(String name){
        this.p = Bukkit.getPlayer(name);
        this.menu_inv = Bukkit.createInventory(Bukkit.getPlayer(name),3*9,"kick菜单");
        //这里是提出玩家的位置
        ItemStack kick_player = new ItemStack(Material.ACACIA_DOOR);
        //这里是封号玩家的位置
        ItemStack ban_player = new ItemStack(Material.BIRCH_DOOR);
        //添加
        menu_inv.setItem(11,kick_player);
        menu_inv.setItem(15,ban_player);
    }

    public void open(){
        p.openInventory(menu_inv);
    }
}
