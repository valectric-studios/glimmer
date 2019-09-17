package net.valectric.glimmer.samples.survivalgames;

import net.valectric.glimmer.game.Game;
import net.valectric.glimmer.game.GameConfigurer;
import net.valectric.glimmer.game.GameHandle;
import net.valectric.glimmer.game.command.Commands;
import net.valectric.glimmer.game.listener.Listeners;
import net.valectric.glimmer.game.phase.Phases;

@Game(name = SurvivalGamesGameHandle.NAME,
   displayName = SurvivalGamesGameHandle.DISPLAY_NAME,
   prefix = SurvivalGamesGameHandle.PREFIX,
   configurer = SurvivalGamesGameHandle.CONFIGURER)
@Commands("net.valectric.glimmer.samples.survivalgames.commands")
@Listeners("net.valectric.glimmer.samples.survivalgames.listeners")
@Phases("net.valectric.glimmer.samples.survivalgames.phases")
public final class SurvivalGamesGameHandle implements GameHandle {

   static final String NAME = "survivalgames";
   static final String DISPLAY_NAME = "SurvivalGames";
   static final String PREFIX = "&8[&aSurvivalGames&8]";
   static final Class<? extends GameConfigurer> CONFIGURER = SurvivalGamesGameConfigurer.class;

   @Override
   public void start() {

   }

   @Override
   public void stop() {

   }

   // PURE GLIMMER
   // TODO: Implement game states into Glimmer (net.valectric.glimmer.game)
   // TODO: Implement game settings into Glimmer (net.valectric.glimmer.game)
   // TODO: Implement arenas into Glimmer (net.valectric.glimmer.arena)
   // TODO: Implement automatic listener hook as soon as a game/phase starts (net.valectric.glimmer.listener)
   // TODO: Implement automatic listener unhook as soon as a game/phase stops (net.valectric.glimmer.listener)

   // PURE PLAYGROUND
   // TODO: Implement random chest content (filler) (net.valectric.playground.inventory)

   // Game einlesen
   // Game vorbereiten
   // Phasen starten
   // Phasen durchlaufen lassen
   // Game beenden
}

