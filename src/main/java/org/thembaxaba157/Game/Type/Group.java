package org.thembaxaba157.Game.Type;

import org.thembaxaba157.Game.Game;

public class Group extends Game {

    @Override
    protected int getNumPlayers() {
        while(true){
            System.out.println("Choose number of players: 1 or 2");
            int n = gameScanner.nextInt();
            if(n==1 || n==2){
                setnumCpu(2-n);
                return n;
            }
        }
    }

    public Group(){
        super();
    }
    
}
