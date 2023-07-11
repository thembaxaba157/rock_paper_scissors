package org.thembaxaba157.Player;

public interface Player {
    
    enum Options{
        ROCK,PAPER,SCISSOR
    }


    int getScore();
    
    Options pickObject();

    Options generateRandomObject();

}
