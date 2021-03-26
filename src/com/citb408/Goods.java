package com.citb408;

public abstract class Goods implements CanBeSold {

    private double overcharge;
    public Goods(double overcharge){
        this.overcharge=overcharge;
    }


    @Override
    public double SellingPrice() {
        return productionPrice()+this.overcharge;
    }
}
