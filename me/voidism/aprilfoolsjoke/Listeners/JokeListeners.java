package me.voidism.aprilfoolsjoke.Listeners;

import me.voidism.aprilfoolsjoke.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class JokeListeners implements Listener {
   private Main plugin;

   public JokeListeners(Main plugin) {
      this.plugin = plugin;
      Bukkit.getPluginManager().registerEvents(this, plugin);
   }

   @EventHandler
   public void onPlayerJoin(PlayerJoinEvent event) {
      Player p = event.getPlayer();
      p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 99999999, 240));
      p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 99999999, 240));
      ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
      item.addEnchantment(Enchantment.DAMAGE_ALL, 36727);
      item.addEnchantment(Enchantment.SWEEPING_EDGE, 36727);
      item.addEnchantment(Enchantment.FIRE_ASPECT, 36727);
      item.addEnchantment(Enchantment.LOOT_BONUS_MOBS, 36727);
      item.addEnchantment(Enchantment.DURABILITY, 36727);
      ItemStack item2 = new ItemStack(Material.NETHERITE_HELMET, 1);
      item2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 36727);
      item2.addEnchantment(Enchantment.DURABILITY, 36727);
      item2.addEnchantment(Enchantment.THORNS, 36727);
      item2.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 36727);
      ItemStack item3 = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
      item3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 36727);
      item3.addEnchantment(Enchantment.DURABILITY, 36727);
      item3.addEnchantment(Enchantment.THORNS, 36727);
      item3.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 36727);
      ItemStack item4 = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
      item4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 36727);
      item4.addEnchantment(Enchantment.DURABILITY, 36727);
      item4.addEnchantment(Enchantment.THORNS, 36727);
      item4.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 36727);
      ItemStack item5 = new ItemStack(Material.NETHERITE_BOOTS, 1);
      item5.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 36727);
      item5.addEnchantment(Enchantment.DURABILITY, 36727);
      item5.addEnchantment(Enchantment.THORNS, 36727);
      item5.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 36727);
      item5.addEnchantment(Enchantment.PROTECTION_FALL, 36727);
      ItemStack item6 = new ItemStack(Material.BEDROCK, 200);
      ItemStack item7 = new ItemStack(Material.TOTEM_OF_UNDYING, 5);
      p.getInventory().addItem(new ItemStack[]{item});
      p.getInventory().addItem(new ItemStack[]{item2});
      p.getInventory().addItem(new ItemStack[]{item3});
      p.getInventory().addItem(new ItemStack[]{item4});
      p.getInventory().addItem(new ItemStack[]{item5});
      p.getInventory().addItem(new ItemStack[]{item6});
      p.getInventory().addItem(new ItemStack[]{item7});
   }
}
