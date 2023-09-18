package org.thembaxaba157.Player.Type;

import org.thembaxaba157.Player.AbstractPlayer;

public class CPU extends AbstractPlayer {


    public CPU(String name){
        super(name);
    }

    @Override
    public void pickObject() {
        this.latestPickedWeapon = generateRandomObject();
        System.out.println("CPU picked "+this.latestPickedWeapon.name());
    }

   

    @Override
    public PlayerType getPlayerType() {
        return PlayerType.CPU;
    }
    
}
