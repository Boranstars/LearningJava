package review;

public class testClass {
    private int num;
    private String name;

    public testClass() {
        this.name = "";
        this.num = 0;

    }

    public testClass(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "testClass{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
