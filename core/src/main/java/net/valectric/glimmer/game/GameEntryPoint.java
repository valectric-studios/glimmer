package net.valectric.glimmer.game;

public final class GameEntryPoint {
   public static GameEntryPointBuilder builder() {
      return new GameEntryPointBuilder();
   }

   private String factory;
   private transient Class<? extends GameFactory<? extends Game>> factoryClass;

   private GameEntryPoint() {
      this.factory = null;
      this.factoryClass = null;
   }

   public static final class GameEntryPointBuilder {
      public static GameEntryPointBuilder create() {
         return new GameEntryPointBuilder();
      }

      private final GameEntryPoint entryPoint;

      private GameEntryPointBuilder() {
         this.entryPoint = new GameEntryPoint();
      }

      public GameEntryPointBuilder factory(Class<? extends GameFactory<? extends Game>> factoryClass) {
         this.entryPoint.factory = factoryClass.getName();
         this.entryPoint.factoryClass = factoryClass;
         return this;
      }

      public GameEntryPoint finish() {
         return this.entryPoint;
      }
   }
}
