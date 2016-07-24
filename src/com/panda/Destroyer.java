package com.panda;

/**
 * Created by Jake on 24/07/2016.
 */
public class Destroyer extends Ship {

    public Destroyer() {
        Cell[][] battleship = new Cell[1][2];
        battleship[0][0] = new Cell(true);
        battleship[0][1] = new Cell(true);
        setShip(battleship);
        setSimple(true);
    }
}
