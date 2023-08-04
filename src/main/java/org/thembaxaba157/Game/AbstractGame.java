package org.thembaxaba157.Game;

import java.util.HashMap;

import org.thembaxaba157.Game.Type.Classic;
import org.thembaxaba157.Game.Type.Group;
import org.thembaxaba157.Player.Player;
import org.thembaxaba157.Player.Type.CPU;
import org.thembaxaba157.Player.Type.Human;

public abstract class AbstractGame implements Game{


    private HashMap<String,Player> players = new HashMap<String,Player>();
    protected GameInput gameInput = new GameInput();
    private int numCpu;
    private int rounds;

    public abstract int getNumPlayers();

    public void setnumCpu(int num){
        this.numCpu = num;
    }


    public AbstractGame(){
        int numPlayers = getNumPlayers();
        CreatePlayers(numPlayers);
        CreateCPUPlayers();
    }

    public void CreatePlayers(int numPlayers) {
        for(int i=0;i<numPlayers;i++){
            while(true){
            System.out.println("Please enter your name: ");
            String name = GameInput.getInput();
            if(isValidName(name)){
                players.put(name, new Human(name));
                break;
            }
        }
    }
}






   private boolean isValidName(String nam) {
        return !players.containsKey(nam);
    }

 public int getNumCpu() {
        return this.numCpu;
    }
    
    public void CreateCPUPlayers(){
        for(int cpuI = 0;cpuI<getNumCpu();++cpuI){
            String name = getType()+Integer.toString(cpuI+1);
            this.players.put(name, new CPU(name));
        
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

    public void pickNumberRounds(){
        while(true){
            // System.out.println("Choose number of players: 1 or 2");
            int num = gameInput.getInt("Choose number of rounds: 1-8");
            if(num>=1 && num<=8){
                this.rounds = num;
                break;
            }
        }
    }


    public void run(){
        while(true){
            
        }
    }
}
