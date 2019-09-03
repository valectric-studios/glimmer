package net.valectric.glimmer.samples.survivalgames;

import net.valectric.glimmer.game.GameConfigurer;

import java.util.Optional;

public class SurvivalGamesGameConfigurer implements GameConfigurer<SurvivalGamesGame> {
   @Override
   public Optional<Throwable> load(SurvivalGamesGame game) {
      return Optional.empty();
   }

   @Override
   public Optional<Throwable> configure(SurvivalGamesGame game) {
      return Optional.empty();
   }

   @Override
   public Optional<Throwable> interrupt() {
      return Optional.empty();
   }

   @Override
   public Optional<Throwable> verify(SurvivalGamesGame game) {
      return Optional.empty();
   }
}
