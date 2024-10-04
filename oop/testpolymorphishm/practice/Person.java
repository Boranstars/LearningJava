package oop.testpolymorphishm.practice;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keepPet(Animal animal, String something) {
        String animalType = null;
        if (animal instanceof Dog) {
            animalType = "狗";
            animal = (Dog) animal;
        } else if (animal instanceof Cat) {
            animalType = "猫";
            animal = (Cat) animal;
        }
        System.out.printf(
                "年龄为%d的%s养了一只%s的%d岁的%s\n",
                this.age, this.name, animal.getColor(), animal.getAge(), animalType
        );
        animal.eat(something);


    }
}
