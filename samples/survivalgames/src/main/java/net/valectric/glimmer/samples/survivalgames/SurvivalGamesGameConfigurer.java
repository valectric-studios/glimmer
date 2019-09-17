package net.valectric.glimmer.samples.survivalgames;

import net.valectric.glimmer.game.GameConfigurer;
import net.valectric.glimmer.map.Map;
import org.bukkit.GameRule;

public class SurvivalGamesGameConfigurer implements GameConfigurer {

   @Override
   public void configureMap(Map map) {
      map.world().setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
   }

}
