package com.doritobob.dm.entity;

import java.util.ArrayList;
import java.util.List;

import com.doritobob.dm.client.renderer.entity.RenderDoritoPet;
import com.doritobob.dm.item.dmItem;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;


public class EntityDoritoPet extends EntityAnimal{
	protected ResourceLocation textureLoc;
	private int inLove;
    private EntityPlayer playerInLove;
	
	public EntityDoritoPet(World world){
        super(world);
        
        this.setSize(0.9F, 0.9F);
        preventEntitySpawning = true;
        
    }
	
	protected void applyTexture()
	{
		this.setTextureType(RenderDoritoPet.textureLocation);
	}
	
	public ResourceLocation getTextureType()
	{
		return this.textureLoc;
	}
	
	public void setTextureType(ResourceLocation texturelocation)
	{
		this.textureLoc = texturelocation;
	}
	
    public EntityDoritoPet(World world, double x, double y, double z){
        this(world);
        setPosition(x, y, z);
    }
    
    @Override
    protected void initEntityAI(){
    	this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(2, new EntityAITempt(this, 1.25D, dmItem.item_dorito, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
    }

    @Override
	protected void applyEntityAttributes()
    {
    	super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
    }
    
    @Override
    public void writeEntityToNBT(NBTTagCompound tagCompound)
    {
        super.writeEntityToNBT(tagCompound);
        tagCompound.setInteger("InLove", this.inLove);
    }
    
    public boolean canBeLeashed(){
    	return true;
    }
    @Override
    public double getYOffset()
    {
        return 0.29D;
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tagCompund)
    {
        super.readEntityFromNBT(tagCompund);
        this.inLove = tagCompund.getInteger("InLove");
    }
    
    @Override
    public boolean isBreedingItem(ItemStack stack)
    {
        return stack == null ? false : stack.getItem() == dmItem.item_dorito;
    }
    
    @Override
    public boolean processInteract(EntityPlayer player, EnumHand p_184645_2_, ItemStack stack)
    {
        if (stack != null)
        {
            if (this.isBreedingItem(stack) && this.getGrowingAge() == 0 && this.inLove <= 0)
            {
                this.consumeItemFromStack(player, stack);
                this.setInLove(player);
                return true;
            }

            if (this.isChild() && this.isBreedingItem(stack))
            {
                this.consumeItemFromStack(player, stack);
                this.func_175501_a((int)((float)(-this.getGrowingAge() / 20) * 0.1F), true);
                return true;
            }
        }

        return super.processInteract(player, p_184645_2_, stack);
    }
    
    @Override
    public void setInLove(EntityPlayer player)
    {
        this.inLove = 600;
        this.playerInLove = player;
        this.worldObj.setEntityState(this, (byte)18);
    }
    
    @Override
    public EntityPlayer getPlayerInLove()
    {
        return this.playerInLove;
    }

    @Override
    public boolean isInLove()
    {
        return this.inLove > 0;
    }
    
    @Override
    public void resetInLove()
    {
        this.inLove = 0;
    }
    
    @Override
    public boolean canMateWith(EntityAnimal otherAnimal)
    {
        return otherAnimal == this ? false : (otherAnimal.getClass() != this.getClass() ? false : this.isInLove() && otherAnimal.isInLove());
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void handleStatusUpdate(byte id)
    {
        if (id == 18)
        {
            for (int i = 0; i < 7; ++i)
            {
                double d0 = this.rand.nextGaussian() * 0.02D;
                double d1 = this.rand.nextGaussian() * 0.02D;
                double d2 = this.rand.nextGaussian() * 0.02D;
                this.worldObj.spawnParticle(EnumParticleTypes.HEART, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 0.5D + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, d0, d1, d2, new int[0]);
            }
        }
        else
        {
            super.handleStatusUpdate(id);
        }
    }
    
    @Override
    protected void updateAITasks()
    {
        if (this.getGrowingAge() != 0)
        {
            this.inLove = 0;
        }

        super.updateAITasks();
    }
    
    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.getGrowingAge() != 0)
        {
            this.inLove = 0;
        }

        if (this.inLove > 0)
        {
            --this.inLove;

            if (this.inLove % 10 == 0)
            {
                double d0 = this.rand.nextGaussian() * 0.02D;
                double d1 = this.rand.nextGaussian() * 0.02D;
                double d2 = this.rand.nextGaussian() * 0.02D;
                this.worldObj.spawnParticle(EnumParticleTypes.HEART, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 0.5D + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, d0, d1, d2, new int[0]);
            }
        }
    }
    
    public boolean isAIEnabled(){
        return true;
    }
    
    @Override
    public EntityDoritoPet createChild(EntityAgeable ageable) {
        //return null;
        return new EntityDoritoPet(this.worldObj);
    }
	

	////////////// BEHAVIOR OVERRIDES //////////////////

	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.applyTexture();
	}

	///////////////// ITEM DROP LOGIC /////////////////////

	/**
	 * Drop items of this living's type. 
	 * @param recentlyHit - Whether this entity has recently been hit by a player. 
	 * @param lootingLevel - Level of Looting used to kill this mob.
	 */
	
	@Override
	protected void dropFewItems(boolean recentlyHit, int lootingLevel)
	{
		List<WeightedRandomChestContent> drops = new ArrayList();
		//Use thus as an example to drop items on death
		//addDropEntry(drops, rand.nextBoolean() ? Blocks.yellow_flower : Blocks.red_flower, 0, 1, 2, 65);
		//Items.redstone, 0, 1, 1, 20 + lootingLevel * 10);
		addDropEntry(drops, dmItem.item_dorito, 0, 1, 1, 100);

		this.addMobDrops(drops, recentlyHit, lootingLevel);

		for(WeightedRandomChestContent w : drops)
		{
			if(w != null && w.theItemId != null && this.rand.nextInt(100) < w.itemWeight)
			{
				ItemStack toDrop = w.theItemId;

				int size = w.maxStackSize > w.minStackSize ? w.minStackSize + rand.nextInt(w.maxStackSize - w.minStackSize) : w.minStackSize;
				toDrop.stackSize = size;
				this.entityDropItem(toDrop, 0.0F);
			}
		}
	}

	public static boolean addGuaranteedDropEntry(List<WeightedRandomChestContent> list, ItemStack in)
	{
		return addDropEntry(list, in.getItem(), in.getItemDamage(), in.stackSize, in.stackSize, 100);
	}

	public static boolean addDropEntry(List<WeightedRandomChestContent> list, Block in, int meta, int minAmount, int maxAmount, int percentChance)
	{
		return addDropEntry(list, Item.getItemFromBlock(in), meta, minAmount, maxAmount, percentChance);
	}

	public static boolean addDropEntry(List<WeightedRandomChestContent> list, Item in, int meta, int minAmount, int maxAmount, int percentChance)
	{
		return in != null ? list.add(new WeightedRandomChestContent(in, meta, minAmount, maxAmount, percentChance)) : false;
	}

	public static boolean removeDropEntry(List<WeightedRandomChestContent> list, Item in, int meta)
	{
		boolean flag = false;
		for(WeightedRandomChestContent w : list)
		{
			if(w != null && w.theItemId != null && w.theItemId.getItem() == in && (meta == OreDictionary.WILDCARD_VALUE || w.theItemId.getItemDamage() == meta))
			{
				list.remove(w);
				flag = true;
			}
		}
		return flag;
	}

	/////////////// NON-OVERRIDEN GETTERS/SETTERS /////////////////
	
	public void addMobDrops(List<WeightedRandomChestContent> dropList, boolean recentlyHit, int lootingLevel) {
	}
	

}

