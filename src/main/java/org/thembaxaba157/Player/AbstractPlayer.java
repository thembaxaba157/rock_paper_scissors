package org.thembaxaba157.Player;

import java.util.List;
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

    public void scoreCalculate(List<Player> players){
        for(Player player: players){
            if(player.getName().equals(this.name))continue;

            score = score+earnedPoints(latestPickedWeapon,player.getLatestPickedWeapon());
        }        
    }

    private int earnedPoints(Weapon playerWeapon, Weapon weaponAgainst) {
        if(playerWeapon.equals(Weapon.ROCK) && weaponAgainst.equals(Weapon.SCISSORS))return 1;
        if(playerWeapon.equals(Weapon.PAPER) && weaponAgainst.equals(Weapon.ROCK))return 1;
        if(playerWeapon.equals(Weapon.SCISSORS) && weaponAgainst.equals(Weapon.PAPER))return 1;
        return 0;
    }
    
}
