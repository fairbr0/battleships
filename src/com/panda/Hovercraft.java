package com.panda;

/**
 * Created by Jake on 24/07/2016.
 */
public class Hovercraft extends Ship {

    public Hovercraft() {
        Cell[][] battleship = new Cell[3][3];
        battleship[0][0] = new Cell(true);
        battleship[0][1] = new Cell(true);
        battleship[0][2] = new Cell(true);
        battleship[1][0] = new Cell(true);
        battleship[1][1] = new Cell(false);
        battleship[1][2] = new Cell(true);
        battleship[2][0] = new Cell(true);
        battleship[2][1] = new Cell(false);
        battleship[2][2] = new Cell(true);
        setShip(battleship);
        setSimple(false);
    }
}