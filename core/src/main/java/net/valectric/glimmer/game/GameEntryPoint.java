package net.valectric.glimmer.game;

public final class GameEntryPoint {
   public static GameEntryPointBuilder builder() {
      return new GameEntryPointBuilder();
   }

   String type;
   String factory;
   String configurer;
   transient Class<? extends Game> typeClass;
   transient Class<? extends GameFactory<? extends Game>> factoryClass;
   transient Class<? extends GameConfigurer<? extends Game>> configurerClass;

   GameEntryPoint() {}

   public Class<? extends Game> getType() {
      return this.typeClass;
   }

   public Class<? extends GameFactory<? extends Game>> getFactory() {
      return this.factoryClass;
   }

   public Class<? extends GameConfigurer<? extends Game>> getConfigurer() {
      return this.configurerClass;
   }
}
