package net.valectric.glimmer.samples.survivalgames.phases.lobby.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ChangePlayerGameMode implements Listener {

   @EventHandler
   private void onPlayerJoin(PlayerJoinEvent event) {
      var player = event.getPlayer();
      player.setGameMode(GameMode.ADVENTURE);
   }

}
