package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan = 3 * ivan;
            nik = 2 * nik;
            month++;
        }
        return month;
    }
}