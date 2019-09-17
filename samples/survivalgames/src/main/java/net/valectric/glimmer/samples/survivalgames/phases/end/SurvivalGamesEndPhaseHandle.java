package net.valectric.glimmer.samples.survivalgames.phases.end;

import net.valectric.glimmer.game.command.Commands;
import net.valectric.glimmer.game.listener.Listeners;
import net.valectric.glimmer.game.phase.Phase;
import net.valectric.glimmer.game.phase.PhaseHandle;

@Phase(index = Integer.MAX_VALUE, name = "survivalgames-end-phase")
@Commands("net.valectric.glimmer.samples.survivalgames.phases.end.commands")
@Listeners("net.valectric.glimmer.samples.survivalgames.phases.end.listeners")
public class SurvivalGamesEndPhaseHandle implements PhaseHandle {

   @Override
   public void start() {

   }

   @Override
   public void end() {

   }

}
