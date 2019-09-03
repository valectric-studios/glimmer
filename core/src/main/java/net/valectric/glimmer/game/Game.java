package net.valectric.glimmer.game;

import java.util.Optional;

public abstract class Game {
   private GameMeta meta;

   public abstract Optional<Throwable> load();

   public abstract Optional<Throwable> configure();

   public abstract Optional<Throwable> interrupt();

   public abstract Optional<Throwable> verify();

   public abstract void start();

   public abstract void stop();

   public GameMeta meta() {
      return this.meta;
   }
}
