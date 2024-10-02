package review;

public class reviewMethods {
    public static void main(String[] args) {
        testClass tCs1 = new testClass(1,"aaa");
        testClass tCs2 = new testClass(2,"bbb");
        System.out.println(tCs1);
        System.out.println(tCs2);

        swapTestClass(tCs1,tCs2);
        System.out.println(tCs1);
        System.out.println(tCs2);
        testClass tCs4;
        {
            testClass tCs3 = new testClass(3,"ccc");
            tCs4 = tCs3;
        }
        System.out.println(tCs4);

    }

    public static void swapTestClass(testClass objA,testClass objB) {
        int tempInt = objA.getNum();
        String tempStr = objA.getName();
        objA.setNum(objB.getNum());
        objA.setName(objB.getName());
        objB.setName(tempStr);
        objB.setNum(tempInt);
    }


}

