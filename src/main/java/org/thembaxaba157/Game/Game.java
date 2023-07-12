package org.thembaxaba157.Game;

import java.util.HashMap;
import java.util.Scanner;

import org.thembaxaba157.Player.Player;

public abstract class Game {

    private HashMap<String,Player> players = new HashMap<String,Player>();
    protected Scanner gameScanner = new Scanner(System.in);
    private int numCpu;


    protected abstract int getNumPlayers();

    protected void setnumCpu(int num){
        this.numCpu = num;
    }


    public Game(){
        int numPlayers = getNumPlayers();
        CreatePlayers(numPlayers);
    }

    private void CreatePlayers(int numPlayers) {
        for(int i=0;i<numPlayers;i++){

        }
    }
    
    private void CreateCPUPlayers(){
        
    }
}
