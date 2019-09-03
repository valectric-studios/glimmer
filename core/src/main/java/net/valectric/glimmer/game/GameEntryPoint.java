package net.valectric.glimmer.game;

public final class GameEntryPoint {
   public static GameEntryPointBuilder builder() {
      return new GameEntryPointBuilder();
   }

   String type;
   String factory;
   transient Class<? extends Game> typeClass;
   transient Class<? extends GameFactory> factoryClass;

   GameEntryPoint() {}

   public Class<? extends Game> tryGetType() throws ClassNotFoundException {
      if (this.typeClass == null) {
         this.typeClass = (Class<? extends Game>) Class.forName(this.type);
      }
      return this.typeClass;
   }

   public Class<? extends GameFactory> tryGetFactory() throws ClassNotFoundException {
      if (this.factoryClass == null) {
         this.factoryClass = (Class<? extends GameFactory>) Class.forName(this.factory);
      }
      return this.factoryClass;
   }
}
