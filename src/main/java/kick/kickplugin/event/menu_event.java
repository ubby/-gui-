package kick.kickplugin.event;

import kick.kickplugin.gui.kill;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

public class menu_event implements Listener {
    @EventHandler
    public void onclick(InventoryClickEvent inventoryClickEvent){
        Player p = (Player) inventoryClickEvent.getWhoClicked();
        InventoryView click_inventory_view = p.getOpenInventory();
        if(click_inventory_view.getTitle().equals("kick菜单")){
            inventoryClickEvent.setCancelled(true);
            int click_slot = inventoryClickEvent.getSlot();
            ItemStack click_item = click_inventory_view.getItem(click_slot);
            if (click_item != null){
                if (click_slot == 11){
                    new kill(p);
                }
                click_inventory_view.close();
            }
        }
    }
}
