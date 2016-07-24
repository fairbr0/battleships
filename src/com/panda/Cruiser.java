package com.panda;

/**
 * Created by Jake on 24/07/2016.
 */
public class Cruiser extends Ship {

    public Cruiser() {
        Cell[][] ship = new Cell[1][3];
        ship[0][0] = new Cell(true);
        ship[0][1] = new Cell(true);
        ship[0][2] = new Cell(true);
        setShip(ship);
        setSimple(true);
    }
}
