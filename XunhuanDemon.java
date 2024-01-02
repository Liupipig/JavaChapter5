package com.itheima.branch;

public class XunhuanDemon {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a <= 100; a++){
            int ge = a % 10;
            int shi = a / 10 % 10;
            if (shi == 7 || ge == 7 || a % 7 ==0){
                count++;
                System.out.println(a);
            }
        }
        System.out.println(count);
    }
}
