package net.valectric.glimmer.game;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Game {

   String name();

   String displayName();

   String prefix();

   Class<? extends GameConfigurer> configurer();

}
