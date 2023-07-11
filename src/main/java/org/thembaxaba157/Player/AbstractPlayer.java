package org.thembaxaba157.Player;

import java.util.Random;

public abstract class AbstractPlayer implements Player {
    
    private int score = 0;
    public Options generateRandomObject() {
        Options[] values = Options.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }

    public int getScore(){
        return score;
    }

}
