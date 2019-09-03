package net.valectric.glimmer.game;

public final class GameEntryPoint {

    public static GameEntryPointBuilder builder() {
        return new GameEntryPointBuilder();
    }

    private String bootstrapper;
    private transient Class<? extends GameBootstrapper<? extends Game>> bootstrapperClass;

    private GameEntryPoint() {
        this.bootstrapper = null;
        this.bootstrapperClass = null;
    }

    public static final class GameEntryPointBuilder {

        public static GameEntryPointBuilder create() {
            return new GameEntryPointBuilder();
        }

        private final GameEntryPoint entryPoint;

        private GameEntryPointBuilder() {
            this.entryPoint = new GameEntryPoint();
        }

        public GameEntryPointBuilder bootstrapper(Class<? extends GameBootstrapper<? extends Game>> bootstrapperClass) {
            this.entryPoint.bootstrapper = bootstrapperClass.getName();
            this.entryPoint.bootstrapperClass = bootstrapperClass;
            return this;
        }

        public GameEntryPoint finish() {
            return this.entryPoint;
        }

    }

}
