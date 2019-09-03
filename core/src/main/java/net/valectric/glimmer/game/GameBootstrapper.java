package net.valectric.glimmer.game;

public interface GameBootstrapper<T extends Game> {
   T bootstrap();
}
