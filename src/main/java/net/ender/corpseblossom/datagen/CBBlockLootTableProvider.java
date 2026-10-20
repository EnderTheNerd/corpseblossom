package net.ender.corpseblossom.datagen;

import net.ender.corpseblossom.registries.CBBlockRegistry;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class CBBlockLootTableProvider extends BlockLootSubProvider {
    protected CBBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CBBlockRegistry.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
