package com.citb408;

public class TaxiDriver extends RegisterProvider {
    private double numberOfKm;
    private double pricePerKm;

    public TaxiDriver(String regNumber, double numberOfKm, double pricePerKm) {
        super(regNumber);
        this.numberOfKm = numberOfKm;
        this.pricePerKm = pricePerKm;
    }

    @Override
    public double income() {
        return this.numberOfKm * this.pricePerKm;
    }
}
