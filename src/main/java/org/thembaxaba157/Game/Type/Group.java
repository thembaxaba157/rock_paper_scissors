package org.thembaxaba157.Game.Type;

import org.thembaxaba157.Game.AbstractGame;

public class Group extends AbstractGame {

    @Override
    public int getNumPlayers() {
        while(true){
            // System.out.println("Choose number of players: 1 or 2");
            int num = gameInput.getInt("Choose number of players: 1-4");
            if(num>=1 && num<=4){
                setnumCpu(4-num);
                return num;
            }
        }
    }

    public Group(){
        super();
    }
    
}
