package us.introducedpvp.kitpvp.files;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class SpawnLocation {

	public static File spawnlocationFile;
	public static FileConfiguration spawnlocation;
	
	public static void init(File dataFolder) {
		
		spawnlocationFile = new File(dataFolder, "spawnlocation.yml");
		spawnlocation = YamlConfiguration.loadConfiguration(spawnlocationFile);
		
		if(!(spawnlocationFile.exists())) {
			savespawnlocation();

			
			
			savespawnlocation();
			return;
			
			
		}
		
	}
	
	public static void savespawnlocation() {
		
		try {
			
			spawnlocation.save(spawnlocationFile);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
