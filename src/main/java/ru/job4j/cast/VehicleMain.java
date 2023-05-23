package ru.job4j.cast;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle airplane2 = new Airplane();
        Vehicle bus = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle train = new Train();
        Vehicle train2 = new Train();

        Vehicle[] vehicles = new Vehicle[]{airplane, airplane2,
                bus, bus2, train, train2};
        for (Vehicle v : vehicles) {
            v.move();
            v.speed();
        }
    }
}
