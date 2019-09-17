package net.valectric.glimmer.game.map;

import org.bukkit.Location;

public class GameMapSpawn {

   private String name;
   private Location location;

   private GameMapSpawn() {}

   public GameMapSpawn(String name, Location location) {
      this.name = name;
      this.location = location;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Location getLocation() {
      return location;
   }

   public void setLocation(Location location) {
      this.location = location;
   }

}
