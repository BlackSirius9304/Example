package me.Black.example;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace implements Listener {
    @EventHandler
    public void blockPlace (BlockPlaceEvent event){
        System.out.println("Has colocado un bloque");
    }
    
}
