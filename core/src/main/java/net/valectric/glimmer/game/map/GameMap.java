package net.valectric.glimmer.game.map;

import org.bukkit.World;

import java.util.Vector;

public abstract class GameMap {

   private String name;
   private String displayName;
   private Vector<GameMapSpawn> spawns;
   private World world;

   public abstract void configure();

}
