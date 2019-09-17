package net.valectric.glimmer.samples.survivalgames.phases.lobby.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class ChangePlayerQuitMessage implements Listener {

   @EventHandler
   private void onPlayerQuit(PlayerQuitEvent event) {
      event.setQuitMessage(event.getPlayer().getName() + " gave in...");
   }

}
