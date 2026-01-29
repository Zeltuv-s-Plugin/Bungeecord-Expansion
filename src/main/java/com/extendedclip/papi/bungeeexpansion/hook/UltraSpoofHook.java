package com.extendedclip.papi.bungeeexpansion.hook;


import org.bukkit.entity.Player;

public class UltraSpoofHook {

    private UltraSpoofSupport ultraSpoofSupport = null;

    public UltraSpoofHook() {
        if (isUltraSpoofEnabled()) {
            ultraSpoofSupport = new UltraSpoofSupport();
        }
    }

    private boolean isUltraSpoofEnabled() {
        try {
            Class.forName("com.zeltuv.ultraspoofpro.api.UltraSpoofAPI");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public boolean isSpoofed(Player player){
        if (ultraSpoofSupport != null){
            return ultraSpoofSupport.isSpoofed(player);
        }
        return false;
    }

}
