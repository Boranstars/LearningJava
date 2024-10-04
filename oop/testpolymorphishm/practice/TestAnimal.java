package oop.testpolymorphishm.practice;

public class TestAnimal {
    public static void main(String[] args) {
        String dogFood = "骨头";
        String catFood = "鱼";

        Dog d1 = new Dog(11,"黑色");
        Cat c1 = new Cat(2, "白色");
        Person p1 = new Person(20, "老王");
        p1.keepPet(d1, dogFood);
        p1.keepPet(c1, catFood);
    }
}
