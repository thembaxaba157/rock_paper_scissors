package org.thembaxaba157.Game;

public interface Game {


    int getNumPlayers();
    void setnumCpu(int num);
    void CreatePlayers(int numPlayers);
    int getNumCpu();
    void CreateCPUPlayers();
    void run();

    
}
