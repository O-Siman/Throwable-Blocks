package cchs.codingclub.throwableblocks;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ThrowListener implements Listener {
    @EventHandler
    public void onBlockThrow(PlayerInteractEvent event) {
        //Vars
        Player player = event.getPlayer();
        Location location = player.getLocation();
        ItemStack holdingBlock = event.getItem();
        World world = event.getPlayer().getWorld();

        //Return if not right clicking
        if (!event.getAction().equals(Action.RIGHT_CLICK_AIR))
            return;

        //Return if player is not holding a block
        if (!holdingBlock.getType().isBlock())
            return;

        //TODO: Remove block from player

        //Summon a falling block with correct material
        FallingBlock fallingBlock = world.spawnFallingBlock(location, holdingBlock.getType(), (byte) 0);

        //Set velocity of the block
        fallingBlock.setVelocity(player.getEyeLocation().getDirection());
    }
}
