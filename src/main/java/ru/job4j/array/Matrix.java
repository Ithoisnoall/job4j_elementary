package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {

        int[][] array = new int[size][size];
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
                }
            }
        return array;
    }
}

