package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(12, 5, 4, 6);
        System.out.println("result (12, 5) to (4, 6) " + result);
        double result1 = Point.distance(1, 2, 3, 4);
        System.out.println("result (1, 2) to (3, 4) " + result1);
    }
}
