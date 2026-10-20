package net.ender.corpseblossom.datagen;

import net.ender.corpseblossom.Corpseblossom;
import net.ender.corpseblossom.registries.CBItemRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class CBItemModelProvider extends ItemModelProvider {
    public CBItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Corpseblossom.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(CBItemRegistry.ROTTEN_SEEDS.get());
    }
}
