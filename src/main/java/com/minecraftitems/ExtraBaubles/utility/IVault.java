package com.minecraftitems.ExtraBaubles.utility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public interface IVault
{
    public enum AccessMode {
        PUBLIC,
        PRIVATE,
        PROTECTED;
    }

    boolean canBlockBeAccessed(EntityPlayer playerName);

    boolean canSeeBlock(EntityPlayer playerName);

    boolean canUiBeAccessed(EntityPlayer username);

    boolean getRequiresPassword(EntityPlayer username);

    boolean authoriseUser(EntityPlayer username, ItemStack[] password);

    AccessMode getAccessMode();

    void setAccessMode(AccessMode accessMode);

    ItemStack[] getPassword();

    void setPassword(ItemStack[] password);

    ItemStack getItemLabel();

    void setItemLabel(ItemStack lableIcon);

    String getLabel();

    void setLabel(String label);

    UUID getPlacedBy();

    void setPlacedBy(EntityPlayer player);

    public void clearAuthorisedUsers();


}
