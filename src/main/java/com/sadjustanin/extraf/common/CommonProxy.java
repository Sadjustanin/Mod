package com.sadjustanin.extraf.common;

import com.sadjustanin.extraf.items.Items;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy{
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
        Items.register();
    }

    public void init(FMLInitializationEvent event) {

        /*
         Стадия инициализации предназначена для выполнения действий с объектами,
         зарегистрированными в предварительной инициализации.

         Чаще всего в этой стадии выполняются следующие действия:

         Регистрация генераторов структур
         Регистрация рендера сущностей, блоков и т.п.
        */

    }

    public void postInit(FMLPostInitializationEvent event) {

        /*
         На стадии пост-инициализации рекомендуется выполнять действия,
         связанные с регистрацией рецептов, интеграцией с другими модами и т.п.
         что требует отложенных действий
        */

    }
}
