package com.kodilla.kodillacourserepetition;

public class Euklides {
    private int firstValue;
    private int secondValue;

    public Euklides(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public void euklidesAlgorithm() {
        int nwd = 0;
        int modulo;
        while (nwd == 0) {
            modulo = firstValue % secondValue;
            if (modulo == 0) {
                nwd = secondValue;
            } else {
                firstValue = secondValue;
                secondValue = modulo;
            }
        }
        System.out.println("NWD = " + nwd);
    }
}
