package net.valectric.glimmer.samples.survivalgames;

import net.valectric.glimmer.game.GameBootstrapper;

public final class SurvivalGamesGameBootstrapper implements GameBootstrapper<SurvivalGamesGame> {

   @Override
   public SurvivalGamesGame bootstrap() {
      return new SurvivalGamesGame();
   }

}
