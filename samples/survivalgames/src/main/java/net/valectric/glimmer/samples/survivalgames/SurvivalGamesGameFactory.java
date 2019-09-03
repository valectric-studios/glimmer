package net.valectric.glimmer.samples.survivalgames;

import net.valectric.glimmer.game.GameFactory;

public final class SurvivalGamesGameFactory implements GameFactory<SurvivalGamesGame> {
   @Override
   public SurvivalGamesGame createGame() {
      return new SurvivalGamesGame();
   }
}
