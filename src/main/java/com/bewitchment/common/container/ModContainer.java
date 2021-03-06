package com.bewitchment.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public abstract class ModContainer<T extends TileEntity> extends Container {
	private final T tileEntity;

	public ModContainer(T tileEntity) {
		this.tileEntity = tileEntity;
	}

	protected void addPlayerSlots(InventoryPlayer playerInventory, int x, int y) {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, x + j * 18, y + i * 18));
			}
		}

		for (int i = 0; i < 9; ++i) {
			addSlotToContainer(new Slot(playerInventory, i, x + i * 18, y + 58));
		}
	}

	protected void addPlayerSlots(InventoryPlayer playerInventory) {
		this.addPlayerSlots(playerInventory, 8, 84);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
		return ItemStack.EMPTY;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return !player.isSpectator();
	}

	public T getTileEntity() {
		return tileEntity;
	}
}