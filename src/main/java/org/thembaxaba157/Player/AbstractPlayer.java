package org.thembaxaba157.Player;

import java.util.Random;

public abstract class AbstractPlayer implements Player {
    
    private int score = 0;
    protected String name;
    protected Weapon latestPickedWeapon;

    public AbstractPlayer(String name) {
        this.name = name;
	}

    public Weapon getLatestPickedWeapon(){
        return latestPickedWeapon;
    }

	public Weapon generateRandomObject() {
        Weapon[] values = Weapon.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }


    public int getScore(){
        return score;
    }

    public Weapon getWeaponEnum(String stringWeapon){
        if(stringWeapon.equals("rock")) return Weapon.ROCK;
        if(stringWeapon.equals("scissors")) return Weapon.SCISSORS;
        return Weapon.PAPER;
    }

    public String getName(){
        return this.name;
    }

}
