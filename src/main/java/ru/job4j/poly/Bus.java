package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void drive() {
        System.out.println("Ехать со скоростью не более 60 км/ч");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Число пассажиров = " + count);
    }

    @Override
    public int refuel(int fuelCount) {
        System.out.println("Стоимость топлива = "
                + Transport.super.refuel(fuelCount));
        return Transport.super.refuel(fuelCount);
    }
}
