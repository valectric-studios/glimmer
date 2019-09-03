package net.valectric.glimmer.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class GlimmerPlugin extends JavaPlugin {

   @Override
   public void onLoad() {
      super.onLoad();
   }

   @Override
   public void onEnable() {
      super.getLogger().info("########################################################################");
      super.getLogger().info("You're running Glimmer version XXX");
      super.getLogger().warning("Please note that Glimmer will take control of this Spigot instance.");
      super.getLogger().warning("Be advised that there should run no other games or plugins beside " +
         "the ones which are using Glimmer as their backend.");
      super.getLogger().info("########################################################################");
   }

   @Override
   public void onDisable() {
      super.onDisable();
   }

}
