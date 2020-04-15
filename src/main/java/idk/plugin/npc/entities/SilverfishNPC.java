package idk.plugin.npc.entities;

import cn.nukkit.entity.mob.EntitySilverfish;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SilverfishNPC extends EntityNPC {

    private static final int NETWORK_ID = EntitySilverfish.NETWORK_ID;

    public SilverfishNPC(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }
    
    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }
}
