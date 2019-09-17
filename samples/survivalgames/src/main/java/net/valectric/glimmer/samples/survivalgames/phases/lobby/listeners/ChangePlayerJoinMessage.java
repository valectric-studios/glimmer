package net.valectric.glimmer.samples.survivalgames.phases.lobby.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ChangePlayerJoinMessage implements Listener {

   @EventHandler
   private void onPlayerJoin(PlayerJoinEvent event) {
      event.setJoinMessage(event.getPlayer().getName() + " wants to play!");
   }

}
