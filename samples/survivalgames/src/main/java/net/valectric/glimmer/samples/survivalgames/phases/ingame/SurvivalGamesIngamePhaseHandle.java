package net.valectric.glimmer.samples.survivalgames.phases.ingame;

import net.valectric.glimmer.game.command.Commands;
import net.valectric.glimmer.game.listener.Listeners;
import net.valectric.glimmer.game.phase.Phase;
import net.valectric.glimmer.game.phase.PhaseHandle;

@Phase(index = 10, name = "survivalgames-ingame-phase")
@Commands("net.valectric.glimmer.samples.survivalgames.phases.ingame.commands")
@Listeners("net.valectric.glimmer.samples.survivalgames.phases.ingame.listeners")
public class SurvivalGamesIngamePhaseHandle implements PhaseHandle {

   @Override
   public void start() {

   }

   @Override
   public void end() {

   }

}
