package com.citb408;

public class Engineer implements Provider {
    private double workedHour;
    private double pricePerHour;

    public Engineer(double workedHour, double pricePerHour) {
        this.workedHour = workedHour;
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double income() {
        return this.workedHour * this.pricePerHour;
    }

}
