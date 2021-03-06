package rip.helium.event.events.impl.player;

import net.minecraft.block.Block;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import rip.helium.event.events.callables.EventCancellable;

public class BoundingBoxEvent extends EventCancellable {
	private Block block;
	private BlockPos blockPos;
	private AxisAlignedBB boundingBox;
	  
	public BoundingBoxEvent(Block block, BlockPos pos, AxisAlignedBB boundingBox) {
	    this.block = block;
	    this.blockPos = pos;
	    this.boundingBox = boundingBox;
	}
	  
	public Block getBlock() {
	    return this.block;
	}
	  
	public BlockPos getBlockPos() {
	    return this.blockPos;
	}
	  
	public AxisAlignedBB getBoundingBox() {
	    return this.boundingBox;
	}
	  
	public void setBlock(Block block) {
	    this.block = block;
	}
	  
	public void setBlockPos(BlockPos blockPos) {
	    this.blockPos = blockPos;
	}
	  
	public void setBoundingBox(AxisAlignedBB boundingBox) {
	    this.boundingBox = boundingBox;
	}
}
