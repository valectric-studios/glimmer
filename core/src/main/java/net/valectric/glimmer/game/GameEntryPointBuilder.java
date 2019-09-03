package net.valectric.glimmer.game;

public final class GameEntryPointBuilder {
   public static GameEntryPointBuilder create() {
      return new GameEntryPointBuilder();
   }

   private final GameEntryPoint entryPoint;

   GameEntryPointBuilder() {
      this.entryPoint = new GameEntryPoint();
   }

   public GameEntryPointBuilder type(Class<? extends Game> typeClass) {
      this.entryPoint.type = typeClass.getName();
      this.entryPoint.typeClass = typeClass;
      return this;
   }

   public GameEntryPointBuilder factory(Class<? extends GameFactory> factoryClass) {
      this.entryPoint.factory = factoryClass.getName();
      this.entryPoint.factoryClass = factoryClass;
      return this;
   }

   public GameEntryPoint finish() {
      return this.entryPoint;
   }
}
