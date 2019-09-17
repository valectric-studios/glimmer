package net.valectric.glimmer.samples.survivalgames.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class DenyWeatherChange implements Listener {

   @EventHandler
   private void onWeatherChange(WeatherChangeEvent event) {
      event.setCancelled(true);
   }

}
