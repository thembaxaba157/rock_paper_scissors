package org.thembaxaba157.Player;

import java.util.List;

public interface Player {
    
    enum Weapon{
        ROCK,PAPER,SCISSORS
    }

    enum PlayerType{
        CPU,HUMAN
    }


    int getScore();

    void scoreCalculate(List<Player> players);
    
    void pickObject();

    Weapon getLatestPickedWeapon();

    Weapon generateRandomObject();

    Weapon getWeaponEnum(String input);

    String getName();

    PlayerType getPlayerType();


}
