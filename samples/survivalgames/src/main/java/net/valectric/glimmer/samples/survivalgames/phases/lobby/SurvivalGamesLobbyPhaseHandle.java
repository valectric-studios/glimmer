package net.valectric.glimmer.samples.survivalgames.phases.lobby;

import net.valectric.glimmer.game.command.Commands;
import net.valectric.glimmer.game.listener.Listeners;
import net.valectric.glimmer.game.phase.Phase;
import net.valectric.glimmer.game.phase.PhaseHandle;

@Phase(index = 0, name = "survivalgames-lobby-phase")
@Commands("net.valectric.glimmer.samples.survivalgames.phases.lobby.commands")
@Listeners("net.valectric.glimmer.samples.survivalgames.phases.lobby.listeners")
public class SurvivalGamesLobbyPhaseHandle implements PhaseHandle {

   @Override
   public void start() {

   }

   @Override
   public void end() {

   }

}
