package oop.testpolymorphishm.practice;

public class Cat extends Animal {

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.printf("%d 岁的 %s 颜色的猫眯着眼睛侧着头吃 %s\n", this.getAge(), this.getColor(), something);
    }

    public void catchMouse() {
        System.out.println("猫在捉老鼠");
    }
}
