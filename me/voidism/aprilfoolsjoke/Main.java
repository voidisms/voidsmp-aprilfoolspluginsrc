package me.voidism.aprilfoolsjoke;

import me.voidism.aprilfoolsjoke.Listeners.JokeListeners;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
   public void onEnable() {
      new JokeListeners(this);
   }
}
