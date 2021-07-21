package io.github.sudain;

import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class AnimalsListener implements Listener {

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onEntitySpawn(CreatureSpawnEvent event){
        if(!(event.getSpawnReason().equals(CreatureSpawnEvent.SpawnReason.NATURAL))){
            event.setCancelled(true);
            return;
        }
        FileConfiguration config = NovaCityAnimals.getInstance().getConfig();
        if(!(config.getStringList("Animals.types").contains(event.getEntityType().toString().toUpperCase()))){
            event.setCancelled(true);
            return;
        }
        Location loc = event.getLocation();
        Biome biome = event.getEntity().getWorld().getBiome(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());
        if(!(config.getStringList("Animals.biomes").contains(biome.toString().toUpperCase()))){
            event.setCancelled(true);
        }


    }

}
