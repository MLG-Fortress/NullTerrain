package uk.me.elizabethmyers.nullterrain;

import java.util.Random;
import org.bukkit.Location;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.World;

public class NullChunkGenerator extends ChunkGenerator
{
	public byte[] generate(World world, Random random, int cx, int cz)
	{
		return new byte[65536];
	}

	@Override
	public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome)
	{
		return createChunkData(world);
	}

	@Override
	public Location getFixedSpawnLocation(World world, Random random)
	{
		// Sane default --Elizabeth
		return new Location(world, 0, 64, 0);
	}
}
