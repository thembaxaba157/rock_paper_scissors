package org.thembaxaba157.Game.Type;

import org.thembaxaba157.Game.AbstractGame;

public class Classic extends AbstractGame {

    @Override
    public int getNumPlayers() {
        while(true){
            // System.out.println("Choose number of players: 1 or 2");
            int n = gameInput.getInt("Choose number of players: 1 or 2");
            if(n==1 || n==2){
                setnumCpu(2-n);
                return n;
            }
        }
    }

    

    
}
