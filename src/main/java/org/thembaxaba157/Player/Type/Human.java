package org.thembaxaba157.Player.Type;

import java.util.ArrayList;

import org.thembaxaba157.Game.GameInput;
import org.thembaxaba157.Player.AbstractPlayer;


public class Human extends AbstractPlayer {

    private ArrayList<String> availWeapons = new ArrayList<>();
    
    private Weapon getInput(){
        while(true){
            System.out.println("Choose your weapon");
            String humanInput = GameInput.getInput().toLowerCase();
            if(availWeapons.contains(humanInput)) return getWeaponEnum(humanInput);
        }
    }
    @Override
    public Weapon pickObject() {
        return getInput();
    }
    
}
