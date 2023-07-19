package org.thembaxaba157.Player.Type;

import org.thembaxaba157.Player.AbstractPlayer;

public class CPU extends AbstractPlayer {



    @Override
    public Weapon pickObject() {
        return generateRandomObject();
    }

    public CPU(String name){
        this.name = name;
    }
    
}
