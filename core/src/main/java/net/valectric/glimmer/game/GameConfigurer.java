package net.valectric.glimmer.game;

import java.util.Optional;

public interface GameConfigurer<G extends Game> {
   Optional<Throwable> load(G game);

   Optional<Throwable> configure(G game);

   Optional<Throwable> interrupt();

   Optional<Throwable> verify(G game);
}
