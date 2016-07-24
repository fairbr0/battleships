package com.panda;

/**
 * Created by Jake on 24/07/2016.
 */
public class BattleShip extends Ship {

    public BattleShip() {
        Cell[][] battleship = new Cell[1][4];
        battleship[0][0] = new Cell(true);
        battleship[0][1] = new Cell(true);
        battleship[0][2] = new Cell(true);
        battleship[0][3] = new Cell(true);
        setShip(battleship);
        setSimple(true);
    }
}
