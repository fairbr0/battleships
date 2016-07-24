package com.panda;

/**
 * Created by Jake on 24/07/2016.
 */
public class Grid {

    private Cell[][] area;
    private int size;

    public Grid(int size, int invalidSize) {
        this.size = size;
        this.area = new Cell[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                area[i][j] = new Cell();
            }
        }

        //set invalid sections;
        for (int i = size-1; i > size - invalidSize - 1; i--) {
            for (int j = size-1; j > size - invalidSize - 1; j--) {
                area[i][j].setValid(false);
            }
        }
    }

    public void countShips() {
        Ship ship;
        /*ship = new Destroyer();
        System.out.println(ship.drawShip());
        countShip(ship);
        ship = new BattleShip();
        System.out.println(ship.drawShip());
        countShip(ship);
        ship = new Cruiser();
        System.out.println(ship.drawShip());
        countShip(ship);
        ship = new Carrier();
        System.out.println(ship.drawShip());
        countShip(ship);*/
        ship = new Hovercraft();
        System.out.println(ship.drawShip());
        countShip(ship);

    }

    public void countShip(Ship ship) {

        //iterate over the grid to try and place the ship;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                //simple ship is a line
                if (ship.isSimple()) {

                    Cell[][] shipcells = ship.getShip();
                    boolean fitsS = true;
                    boolean fitsO = true;

                    //compare each element of the ship to the grid in standard orientation
                    for (int m = 0; m < shipcells.length; m++) {
                        for (int n = 0; n < shipcells[m].length; n++) {

                            int arearelx = i + m;
                            int arearely = j + n;

                            int arearelxo = i + n;
                            int arearelyo = j + m;

                            if (!(shipcells[m][n].isValid() && (arearelx) < size && (arearely) < size && area[arearelx][arearely].isValid())) {
                                fitsS = false;
                            }

                            if (!(shipcells[m][n].isValid() && (arearelxo) < size && (arearelyo) < size && area[arearelxo][arearelyo].isValid())) {
                                fitsO = false;
                            }

                        }
                    }

                    for (int m = 0; m < shipcells.length; m++) {
                        for (int n = 0; n < shipcells[m].length; n++) {

                            int arearelx = i + m;
                            int arearely = j + n;
                            int arearelxo = i + n;
                            int arearelyo = j + m;

                            if (fitsS) {
                                area[arearelx][arearely].incScore();
                            }
                            if (fitsO) {
                                area[arearelxo][arearelyo].incScore();
                            }
                        }
                    }

                } else {
                    Cell[][] shipcells = ship.getShip();
                    boolean fits1 = true;
                    boolean fits2 = true;
                    boolean fits3 = true;
                    boolean fits4 = true;

                    //compare each element of the ship to the grid in standard orientation
                    for (int m = 0; m < shipcells.length; m++) {
                        for (int n = 0; n < shipcells[m].length; n++) {

                            int arearelx1 = i + m;
                            int arearely1 = j + n;

                            int arearelx2 = i + n;
                            int arearely2 = j + m;

                            int arearelx3 = i + (shipcells.length - m - 1);
                            int arearely3 = j + (shipcells[m].length - n - 1);

                            int arearelx4 = i + (shipcells[m].length - n - 1);
                            int arearely4 = j + (shipcells.length - m - 1);

                            if (!(shipcells[m][n].isValid() && (arearelx1) < size && (arearely1) < size && area[arearelx1][arearely1].isValid())) {
                                System.out.println("fits1 breakdown");
                                System.out.println("shipcelvalid: " + shipcells[m][n].isValid());
                                System.out.println("inxarea: " + ((arearelx1) < size));
                                System.out.println("inareay: " + ((arearely1) < size));
                                System.out.println("areavalid: " + area[arearelx1][arearely1].isValid());
                                fits1 = false;
                            }

                            if (!(shipcells[m][n].isValid() && (arearelx2) < size && (arearely2) < size && area[arearelx2][arearely2].isValid())) {
                                fits2 = false;
                            }

                            if (!(shipcells[m][n].isValid() && (arearelx3) < size && (arearely3) < size && area[arearelx3][arearely3].isValid())) {
                                fits3 = false;
                            }

                            if (!(shipcells[m][n].isValid() && (arearelx4) < size && (arearely4) < size && area[arearelx4][arearely4].isValid())) {
                                fits4 = false;
                            }

                        }
                    }
                    System.out.println("fits1: " + fits1);
                    System.out.println("fits2: " + fits2);
                    System.out.println("fits3: " + fits3);
                    System.out.println("fits4: " + fits4);

                    for (int m = 0; m < shipcells.length; m++) {
                        for (int n = 0; n < shipcells[m].length; n++) {

                            int arearelx1 = i + m;
                            int arearely1 = j + n;
                            int arearelx2 = i + n;
                            int arearely2 = j + m;
                            int arearelx3 = i + (shipcells.length - m - 1);
                            int arearely3 = j + (shipcells[m].length - n - 1);

                            int arearelx4 = i + (shipcells[m].length - n - 1);
                            int arearely4 = j + (shipcells.length - m - 1);

                            if (fits1) {
                                area[arearelx1][arearely1].incScore();
                            }
                            if (fits2) {
                                area[arearelx2][arearely2].incScore();
                            }
                            if (fits3) {
                                area[arearelx3][arearely3].incScore();
                            }
                            if (fits4) {
                                area[arearelx4][arearely4].incScore();
                            }


                        }
                    }
                }

            }
        }
    }

    public String printScores() {
        String str = "------------------------------------------\n";
        for (int i = size-1; i >= 0; i--) {
            str += "|";
            for (int j = 0; j < size; j++ ) {
                int score = area[i][j].getScore();
                if (score < 10) {
                    str += "0" + score + " ";
                } else {
                    str += score + " ";
                }
            }
            str += "|\n";
        }
        str += "------------------------------------------";
        return str;
    }

    public String printValid() {
        String str = "--------------\n";
        for (int i = size - 1; i > 0; i--) {
            str += "|";

            for (int j = 0 ; j < size; j++ ) {
                if (area[i][j].isValid()) str += "1";
                else str += "0";
            }

            str += "|\n";
        }
        str += "--------------";
        return str;
    }
}
