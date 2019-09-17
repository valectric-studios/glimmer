package net.valectric.glimmer.samples.survivalgames.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class DenyMobSpawning implements Listener {

   @EventHandler
   private void onMobSpawn(EntitySpawnEvent event) {
      event.setCancelled(true);
   }

   @EventHandler
   private void onCreatureSpawn(CreatureSpawnEvent event) {
      event.setCancelled(true);
   }

}
