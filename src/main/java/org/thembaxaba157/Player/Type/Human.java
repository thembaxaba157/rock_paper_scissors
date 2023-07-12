package org.thembaxaba157.Player.Type;

import java.util.ArrayList;
import java.util.Scanner;

import org.thembaxaba157.Player.AbstractPlayer;


public class Human extends AbstractPlayer {

    private Scanner weaponScanner = new Scanner(System.in);
    private ArrayList<String> availWeapons = new ArrayList<>();
    
    private Weapon getInput(){
        while(true){
            System.out.println("Choose your weapon");
            String humanInput = weaponScanner.nextLine().toLowerCase();
            if(availWeapons.contains(humanInput)) return getWeaponEnum(humanInput);
        }
    }

    @Override
    public Weapon pickObject() {
        return getInput();
    }
    
}
