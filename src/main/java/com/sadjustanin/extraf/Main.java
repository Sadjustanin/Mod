package com.sadjustanin.extraf;

import com.sadjustanin.extraf.common.CommonProxy;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(
        modid = Main.MODID,
        name = Main.NAME,
        version = Main.VERSION,
        useMetadata = true
    )
public class Main
{
    public static final String MODID = "extraf";
    public static final String NAME = "Extra Features";
    public static final String VERSION = "1.2";
    
    @SidedProxy
            (
            clientSide = "com.sadjustanin.extraf.common.ClientProxy",
            serverSide = "com.sadjustanin.extraf.common.CommonProxy"
            )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        /*
         Стадия предварительной инициализации используется для того,
         чтобы дать игре знать о том, что есть в моде: блоках, предметах и так далее.

         Чаще всего в этой стадии выполняются следующие действия:

         Регистрация блоков и предметов.
         Регистрация Tile Entity
         Регистрация сущностей
         Присвоение имен в Ore Dictionary
        */

        proxy.preInit(event);
    }

    public void init(FMLInitializationEvent event) {

        /*
         Стадия инициализации предназначена для выполнения действий с объектами,
         зарегистрированными в предварительной инициализации.

         Чаще всего в этой стадии выполняются следующие действия:

         Регистрация генераторов структур
         Регистрация рендера сущностей, блоков и т.п.
        */

        proxy.init(event);
    }

    public void postInit(FMLPostInitializationEvent event) {

        /*
         На стадии пост-инициализации рекомендуется выполнять действия,
         связанные с регистрацией рецептов, интеграцией с другими модами и т.п.
         что требует отложенных действий
        */

        proxy.postInit(event);
    }
}
