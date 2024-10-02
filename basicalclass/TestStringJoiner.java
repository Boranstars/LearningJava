package basicalclass;

import java.util.StringJoiner;
import java.util.Scanner;

public class TestStringJoiner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[8];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        System.out.println(arrToString(numArr));
    }

    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        /* StringJoiner 是用来拼接字符串的工具类，它可以指定一个分隔符，然后自动把每个元素以指定的分隔符拼接起来
         例如，可以创建一个StringJoiner对象，参数分别是分隔符、前缀和后缀*/
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int c : arr) {
            sj.add(String.valueOf(c));
        }

        return sj.toString();
    }
}
