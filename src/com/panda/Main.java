package com.panda;

public class Main {

    public static void main(String[] args) {

        Grid grid = new Grid(12, 5);
        grid.countShips();
        System.out.println(grid.printValid());
        System.out.println(grid.printScores());
    }
}
