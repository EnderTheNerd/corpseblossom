package net.ender.corpseblossom.registries;

import net.ender.corpseblossom.Corpseblossom;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Collection;
import java.util.function.Function;

public class CBItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Corpseblossom.MOD_ID);

    //SEEDS
    public static final DeferredItem<Item> ROTTEN_SEEDS = ITEMS.register("rotten_seeds",
            () -> new Item(new Item.Properties()));






    public static Collection<DeferredHolder<Item, ? extends Item>> getItems() {
        return ITEMS.getEntries();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static <T extends Item> DeferredHolder<Item, T> registerItem(String name, Function<Item.Properties, T> itemFactory) {
        return ITEMS.register(name, () -> itemFactory.apply(new Item.Properties()));
    }
}
