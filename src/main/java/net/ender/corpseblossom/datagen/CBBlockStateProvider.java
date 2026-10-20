package net.ender.corpseblossom.datagen;

import net.ender.corpseblossom.Corpseblossom;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class CBBlockStateProvider extends BlockStateProvider {
    public CBBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Corpseblossom.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }


    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
