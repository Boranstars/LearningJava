package oop.testpolymorphishm.practice;

public class Dog extends Animal {


    public Dog(int age, String color) {
        super(age, color);
    }



    @Override
    public void eat(String something) {
        System.out.printf("%d 岁的 %s 颜色的狗两只前腿死死的抱住 %s 猛吃\n", this.getAge(), this.getColor(), something);
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}
