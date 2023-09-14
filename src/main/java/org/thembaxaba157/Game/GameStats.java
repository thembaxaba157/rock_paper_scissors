package org.thembaxaba157.Game;

import java.util.ArrayList;

public class GameStats {

    ArrayList<String> scoreLeader = new ArrayList<>();
    int hiScore = 0;


    public void setHiScore(int hiScore) {
        this.hiScore = hiScore;
    }

    public int getHiScore() {
        return hiScore;
    }

    public ArrayList<String> getScoreLeader() {
        return scoreLeader;
    }

}
