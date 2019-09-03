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

   public Class<? extends Game> tryGetType() throws ClassNotFoundException {
      if (this.typeClass == null) {
         this.typeClass = (Class<? extends Game>) Class.forName(this.type);
      }
      return this.typeClass;
   }

   public Class<? extends GameFactory<? extends Game>> tryGetFactory() throws ClassNotFoundException {
      if (this.factoryClass == null) {
         this.factoryClass = (Class<? extends GameFactory<? extends Game>>) Class.forName(this.factory);
      }
      return this.factoryClass;
   }

   public Class<? extends GameConfigurer<? extends Game>> tryGetConfigurer() throws ClassNotFoundException {
      if (this.configurerClass == null) {
         this.configurerClass = (Class<? extends GameConfigurer<? extends Game>>) Class.forName(this.configurer);
      }
      return this.configurerClass;
   }
}
