package com.xyf;

import java.util.ArrayList;

/*
    给定target，要求得到一个数组，数组中的元素必须是2的n次方。
    思路，将target转换成二进制，将有1的地方取出，（2的x次方）加入数组中
 */
public class Title_1 {
    public static void main(String[] args) {
        int target = 7;
        ArrayList<Integer> list = new ArrayList<>();
        String s = Integer.toBinaryString(target);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                list.add((int) Math.pow(2,i));
            }
        }
        int sum = 0;
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
