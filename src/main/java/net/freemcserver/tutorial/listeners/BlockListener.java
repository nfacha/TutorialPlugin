package net.freemcserver.tutorial.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockListener implements Listener {

    @EventHandler
    public void breakBlock(BlockBreakEvent e){
        if(e.getBlock().getType() == Material.SPONGE){
            // Its a sponge
            e.getPlayer().sendMessage(ChatColor.GREEN + "You just broke a sponge, take this!");
            e.getPlayer().getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE));
        }else{
            // It is not a sponge
            e.getPlayer().sendMessage(ChatColor.RED + "You just broke a block, and it is now a sponge!");
            e.setCancelled(true);
            e.getBlock().setType(Material.SPONGE);
        }

    }
}
