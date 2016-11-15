package com.nicolas.magictechcraft;

import com.nicolas.magictechcraft.helpers.Constants;
import com.nicolas.magictechcraft.init.BlocksInit;
import com.nicolas.magictechcraft.init.ItemsInit;
import com.nicolas.magictechcraft.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Nicolas on 09/11/2016.
 */


@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, version = Constants.MOD_VERSION)

public class MagicTechCraft {

    @Mod.Instance(Constants.MOD_ID)
    public static MagicTechCraft instance;

    @SidedProxy(clientSide = Constants.CLIENTPROXY, serverSide = Constants.COMMONPROXY, modId = Constants.MOD_ID)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preinit(FMLPreInitializationEvent event){
        ItemsInit.ItemsPreInit(event);
        BlocksInit.BlocksPreInit(event);
    }

    public static void init(FMLInitializationEvent event){
        ItemsInit.ItemsInit(event);
        BlocksInit.BlocksInit(event);
    }

    public static void postinit(FMLPostInitializationEvent event){
        ItemsInit.ItemsPostInit(event);
        BlocksInit.BlocksPostInit(event);
    }

}
