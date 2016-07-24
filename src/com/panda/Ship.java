package com.panda;

/**
 * Created by Jake on 24/07/2016.
 */
public abstract class Ship {

    Cell[][] ship;
    boolean isSimple;

    public Ship() {}

    public Cell[][] getShip() {
        return this.ship;
    }

    public String drawShip() {
        String str = "";
        for (int i = ship.length - 1; i >= 0; i--) {
            for (int j = 0; j < ship[i].length; j++) {
                if (ship[i][j].isValid()) {
                    str += "1";
                } else {
                    str += "0";
                }
            }
            str += "\n";
        }
        return str;
    }

    public void setShip(Cell[][] ship) {
        this.ship = ship;
    }

    public boolean isSimple() {
        return isSimple;
    }

    public void setSimple(boolean simple) {
        isSimple = simple;
    }
}
