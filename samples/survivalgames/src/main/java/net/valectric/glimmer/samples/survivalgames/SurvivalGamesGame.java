package net.valectric.glimmer.samples.survivalgames;

import net.valectric.glimmer.game.Game;

import java.util.Optional;

public final class SurvivalGamesGame extends Game {
   // PURE GLIMMER
   // TODO: Implement game states into Glimmer (net.valectric.glimmer.game)
   // TODO: Implement game settings into Glimmer (net.valectric.glimmer.game)
   // TODO: Implement arenas into Glimmer (net.valectric.glimmer.arena)
   // TODO: Implement automatic listener hook as soon as a game/phase starts (net.valectric.glimmer.listener)
   // TODO: Implement automatic listener unhook as soon as a game/phase stops (net.valectric.glimmer.listener)

   // PURE PLAYGROUND
   // TODO: Implement random chest content (filler) (net.valectric.playground.inventory)

   @Override
   public Optional<Throwable> load() {
      return Optional.empty();
   }

   @Override
   public Optional<Throwable> configure() {
      return Optional.empty();
   }

   @Override
   public Optional<Throwable> interrupt() {
      return Optional.empty();
   }

   @Override
   public Optional<Throwable> verify() {
      return Optional.empty();
   }

   @Override
   public void start() {

   }

   @Override
   public void stop() {

   }
}
