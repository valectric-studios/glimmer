package net.valectric.glimmer.game;

public interface GameFactory<G extends Game> {
   G createGame();
}
