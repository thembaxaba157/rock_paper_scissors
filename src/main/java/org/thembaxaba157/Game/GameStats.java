package org.thembaxaba157.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import org.thembaxaba157.Player.Player;

public class GameStats {

    private ArrayList<String> scoreLeader = new ArrayList<>();
    private int hiScore = 0;


    public void setHiScore(int hiScore) {
        this.hiScore = hiScore;
    }

    public int getHiScore() {
        return hiScore;
    }

    public ArrayList<String> getScoreLeader() {
        return scoreLeader;
    }

    public boolean isAddScoreLeader(Player player){
        return player.getScore()>=this.hiScore;
    }

    private void addLeader(Player player){
        this.scoreLeader.add(player.getName());
    }
    private void cleanScoreLeader(){
        this.scoreLeader.removeAll(scoreLeader);
    }

    public void changeScoreLeader(Player player){
        if(player.getScore()>hiScore){
            cleanScoreLeader();
        }
        addLeader(player);
    }

    public void showCompleteLeaderboard(HashMap<String, Player> players) {
        ArrayList<Player> playersList = new ArrayList<>(players.values());
        Collections.sort(playersList, Comparator.comparingInt(Player::getScore).reversed());

        System.out.println("Current Leaderboard");
        for(Player player : playersList){
            System.out.println(player.getName()+" : "+player.getScore());
        }
    }    

}
