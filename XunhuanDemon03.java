package com.itheima.branch;

import java.util.Scanner;

public class XunhuanDemon03 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数值");
        int number = sc.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                flag = false;
            }
        }
        if (flag){
            System.out.println("这个数是质数");
        }else{
            System.out.println("这个数不是质数");
        }
}
}
