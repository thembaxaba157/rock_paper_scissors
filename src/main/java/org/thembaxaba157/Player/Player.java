package org.thembaxaba157.Player;

public interface Player {
    
    enum Weapon{
        ROCK,PAPER,SCISSORS
    }

    enum PlayerType{
        CPU,HUMAN
    }


    int getScore();
    
    Weapon pickObject();

    Weapon generateRandomObject();

    Weapon getWeaponEnum(String input);

    String getName();

    PlayerType getPlayerType();

}
