package org.thembaxaba157.Player.Type;

import org.thembaxaba157.Game.GameInput;
import org.thembaxaba157.Player.AbstractPlayer;
import org.thembaxaba157.Player.Player;


public class Human extends AbstractPlayer {

    // private ArrayList<String> availWeapons = new ArrayList<>();
    
    
    public Human(String name){
        super(name);
    }

    private Weapon getInput(){
        while(true){
            System.out.println(this.name+" Choose your weapon");
            String humanInput = GameInput.getInput();
            if(isPartOfEnum(humanInput, Player.Weapon.class)) return getWeaponEnum(humanInput);
            System.out.println("Please pick a correct weapon(scissors,paper,rock)");
        }
    }


    public static <E extends Enum<E>> boolean isPartOfEnum(String input, Class<E> enumClass) {
        for (E enumConstant : enumClass.getEnumConstants()) {
            if (enumConstant.name().equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }



    @Override
    public void pickObject() {
        this.latestPickedWeapon = getInput();
    }
    @Override
    public PlayerType getPlayerType() {
        return PlayerType.HUMAN;
    }
    
}
