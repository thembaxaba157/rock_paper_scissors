package org.thembaxaba157.Player.Type;

import java.util.Scanner;

import org.thembaxaba157.Player.AbstractPlayer;


public class Human extends AbstractPlayer {

    private Scanner objectScanner = new Scanner(System.in);
    String[] availableObjects = {"rock","scissors","paper"};

    private String getInput(){
        while(true){
            
        }
    }


    @Override
    public Options pickObject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pickObject'");
    }
    
}
