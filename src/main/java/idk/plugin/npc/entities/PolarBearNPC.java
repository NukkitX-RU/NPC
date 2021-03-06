package idk.plugin.npc.entities;

import cn.nukkit.entity.passive.EntityPolarBear;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class PolarBearNPC extends EntityNPC {

    private static final int NETWORK_ID = EntityPolarBear.NETWORK_ID;
    
    public PolarBearNPC(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }
}
