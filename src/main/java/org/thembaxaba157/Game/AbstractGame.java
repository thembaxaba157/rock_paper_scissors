package org.thembaxaba157.Game;

import java.util.HashMap;

import org.thembaxaba157.Game.Type.Classic;
import org.thembaxaba157.Game.Type.Group;
import org.thembaxaba157.Player.Player;

public abstract class AbstractGame implements Game{

    private HashMap<String,Player> players = new HashMap<String,Player>();
    protected GameInput gameInput = new GameInput();
    private int numCpu;


    public abstract int getNumPlayers();

    public void setnumCpu(int num){
        this.numCpu = num;
    }


    public AbstractGame(){
        int numPlayers = getNumPlayers();
        CreatePlayers(numPlayers);
    }

    public void CreatePlayers(int numPlayers) {
        for(int i=0;i<numPlayers;i++){

        }
    }

    public int getNumCpu() {
        return this.numCpu;
    }
    
    public void CreateCPUPlayers(){
        for(int cpuI = 0;cpuI<getNumCpu();++cpuI){

        }
    }

    private static String getType(){
        while(true){
        System.out.println("Please choose gametype:\n1. Classic (c)\n2. Group (g)");
        String type = GameInput.getInput();
        if(type.toLowerCase().equals("c") || type.toLowerCase().equals("g"))return type;
        
        System.out.println("Invalid Input");
    }
}

    public static Game createGame(){
        if(getType().equals("c"))return new Classic();
        return new Group();       
    }


    public void run(){

    }
}
