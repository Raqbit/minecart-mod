package com.alc.moreminecarts.items;

import com.alc.moreminecarts.MMReferences;
import com.alc.moreminecarts.entities.BatteryCartEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BatteryCartItem extends AbstractMinecartItem {

    public BatteryCartItem(Properties builder) {
        super(builder);
    }

    @Override
    void createMinecart(ItemStack stack, Level world, double posX, double posY, double posZ) {

        BatteryCartEntity minecart = new BatteryCartEntity(MMReferences.battery_cart, world, posX, posY, posZ);
        if (stack.hasCustomHoverName()) {
            minecart.setCustomName(stack.getDisplayName());
        }
        world.addFreshEntity(minecart);
    }
}
