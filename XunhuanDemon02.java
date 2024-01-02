package com.itheima.branch;

import java.util.Scanner;

public class XunhuanDemon02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            if (i * i == number){
                System.out.println(i + "就是" + number + "的平方根");
                break;
            }else if(i * i > number){
                System.out.println((i - 1) + "就是" + number + "的平方根");
                break;
            }
        }
    }
}
