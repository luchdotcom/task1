package com.citb408;

public class Vehicle extends Goods{
    private double materialsCost;
    private double salariesCost;

    public Vehicle(double overcharge, double materialsCost, double salariesCost) {
        super(overcharge);
        this.materialsCost = materialsCost;
        this.salariesCost=salariesCost;
    }

    @Override
    public double productionPrice() {
        return this.materialsCost+this.salariesCost;
    }

}
