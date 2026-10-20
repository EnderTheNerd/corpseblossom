package net.ender.corpseblossom.item;

import net.ender.corpseblossom.Corpseblossom;
import net.ender.corpseblossom.registries.CBItemRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Corpseblossom.MOD_ID);


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }


    public static final Supplier<CreativeModeTab> CORPSEBLOSSOM_MAIN_TAB = CREATIVE_MODE_TAB.register("rotten_seeds_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CBItemRegistry.ROTTEN_SEEDS.get()))
                    .title(Component.translatable("creativetab.corpseblossom.rotten_seeds"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(CBItemRegistry.ROTTEN_SEEDS);

                    })

                    .build());
}
