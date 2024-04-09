package com.Demo19;

public class Average implements ComputerAverage{
    @Override
    public double average(double[] score) {
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum+=score[i];
        }
        return sum/ score.length;
    }
}
