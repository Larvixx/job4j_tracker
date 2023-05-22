package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(int count);

    default int refuel(int fuelCount) {
        return fuelCount * 52;
    }
}
