package ru.job4j.upCasting;

public class PolyUsage {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal domesticAnimal = new DomesticAnimal();
        Animal cow = new Cow();
        Cow cow1 = new Cow();
        Animal goose = new Goose();
        Animal pet = new Pet();
        Animal dog = new Dog();
        Animal guineaPig = new GuineaPig();
        cow1.giveMilk();
        Cow cow2 = (Cow) cow1;

        Animal[] animals = new Animal[]{animal, domesticAnimal
                , cow, goose, pet, dog, guineaPig};
        for (Animal a : animals) {
            a.sound();
        }
    }
}
