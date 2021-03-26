package com.citb408;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1=new Vehicle(1000,2000,3000);
        System.out.println(vehicle1.productionPrice());
        System.out.println(vehicle1.SellingPrice());

        TaxiDriver taxiDriver=new TaxiDriver("E003",120,2);
        System.out.println(taxiDriver.income());

        Engineer engineer=new Engineer(35,350);
        System.out.println(engineer.income());

        CanBeSold canBeSold;
        canBeSold =vehicle1;
        System.out.println(canBeSold.productionPrice());
        System.out.println(canBeSold.SellingPrice());
    }
}
