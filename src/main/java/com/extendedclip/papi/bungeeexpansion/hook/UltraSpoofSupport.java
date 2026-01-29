package com.extendedclip.papi.bungeeexpansion.hook;

import com.zeltuv.ultraspoofpro.api.ISpoofPlugin;
import com.zeltuv.ultraspoofpro.api.UltraSpoofAPI;
import org.bukkit.entity.Player;

public class UltraSpoofSupport {

    private ISpoofPlugin api;

    public boolean isSpoofed(Player player){
        if (api == null){
            api = UltraSpoofAPI.getAPI();
        }

        return api.isSpoofed(player);
    }
}
