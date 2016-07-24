package com.panda;

/**
 * Created by Jake on 24/07/2016.
 */
public class Cell {
    private boolean valid;
    private int score;

    public Cell() {
        score = 0;
        valid = true;
    }

    public Cell(boolean valid) {
        this.valid = valid;
        score = 0;
    }

    public void incScore(){
        this.score++;
    }

    public void decScore() {
        this.score--;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isValid() {

        return valid;
    }
}
