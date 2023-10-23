package main;

import java.io.Serializable;

public class Player implements Serializable {

    private String name;
    private int gamesPlayed;
    private int gamesWon;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGame(boolean won){
        this.gamesPlayed++;
        this.gamesWon += won ? 1: 0;
    }

    public int getGamesPlayed(){
        return this.gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
    public int getGamesWon(){
        return this.gamesWon;
    }
    public void setGamesWon(int gamesWon){
        this.gamesWon = gamesWon;
    }

    @Override
    public String toString() {
        return this.name+", JUGADOS: "+gamesPlayed+", GANADOS: "+gamesWon;
    }
}
