package com.bewitchment.common.content.transformation.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import static com.bewitchment.common.content.transformation.capability.CapabilityTransformationData.CAPABILITY;

public class TransformationDataProvider implements ICapabilitySerializable<NBTBase> {

	private ITransformationData default_capability = CAPABILITY.getDefaultInstance();

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return capability == CAPABILITY;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		if (capability == CAPABILITY)
			return CAPABILITY.<T>cast(default_capability);
		return null;
	}

	@Override
	public NBTBase serializeNBT() {
		return CAPABILITY.getStorage().writeNBT(CAPABILITY, default_capability, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		CAPABILITY.getStorage().readNBT(CAPABILITY, default_capability, null, nbt);
	}

}