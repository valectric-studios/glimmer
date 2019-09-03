package net.valectric.glimmer.game;

public interface GameFactory<T extends Game> {
   T createGame();
}
