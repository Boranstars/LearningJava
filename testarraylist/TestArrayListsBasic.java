package testarraylist;

import java.util.ArrayList;

public class TestArrayListsBasic {
    public static void main(String[] args) {

        // ArrayList是一个数组队列，相当于动态数组,可类比于C++中的vector
        ArrayList<String> stringArrayList = new ArrayList<>();
        // 模板类，只能存放引用类型，不能存放基本类型，所以要存放基本类型时，需要使用包装类
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        // 添加元素
        stringArrayList.add("hello");
        stringArrayList.add("java");
        stringArrayList.add("world");
        System.out.println(stringArrayList);
        // 移除元素
        // 删除第一个出现的"java"，若存在则返回true
        boolean flagRemoveSuccess =  stringArrayList.remove("java");
        System.out.println(stringArrayList);
        // 若想删除指定索引的元素，可以使用remove(int index)方法,若索引不存在则抛出IndexOutOfBoundsException,存在则返回被删除的元素
        // 类似于C++中的pop_back，但是C++中的pop_back返回的是被删除元素的值
        String s =  stringArrayList.remove(1);
        System.out.println(stringArrayList);
        System.out.println(s);

        // 修改元素
        // 修改指定索引的元素,若索引不存在则抛出IndexOutOfBoundsException,存在则返回被修改的元素
        String result =  stringArrayList.set(0, "world");
        System.out.println(stringArrayList);
        System.out.println(result);

        // 获取元素
        // 获取指定索引的元素,若索引不存在则抛出IndexOutOfBoundsException,存在则返回被获取的元素
        String resultGet =  stringArrayList.get(0);
        System.out.println(resultGet);

        stringArrayList.set(0, "hello");
        stringArrayList.add("java");
        stringArrayList.add("world");

        // 获取元素索引
        // 获取第一个出现的"java"的索引,若存在则返回第一个出现的索引，不存在则返回-1
        int index =  stringArrayList.indexOf("java");
        System.out.println(index);

        // 获取长度
        int size =  stringArrayList.size();
        System.out.println(size);
        for (String string : stringArrayList) {
            System.out.println(string);
        }

    }
}
