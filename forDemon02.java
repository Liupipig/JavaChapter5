package com.itheima.branch;

import java.util.Scanner;

public class forDemon02 {
    public static void main(String[] args) {
        //掌握使用for循环
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        int a = 0;
        for (int i = 1; i <= 100; i++) {
            a += i;
        }
        System.out.println("1-100的和为" + a);

        int  b = 0;
        for (int i = 1; i <= 100; i += 2) {
            b += i;
        }
        System.out.println("1-100的奇数和为" + b);

        for (int i = 1; i <= 100; i += 2) {
            System.out.println("1-100中的奇数为" + i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始值");
        int start = sc.nextInt();
        System.out.println("请输入结束值");
        int end = sc.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                count ++;
            }
        }
        System.out.println(count);

    }
}
