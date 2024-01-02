package com.itheima.branch;

public class ifDemon01 {
    public static void main(String[] args) {
        //需要掌握if分支三种形式的用法
        double t = 38.9;
        if (t > 37){
            System.out.println("温度异常");
        }

        double wallet = 99;
        if (wallet >= 90){
            System.out.println("发出了90元红包");
        } else {
            System.out.println("钱包余额不足");
        }

        double score = 150;
        if (score >= 0 & score <=60){
            System.out.println('D');
        } else if (score >= 60 & score <80) {
            System.out.println('C');
        } else if (score >= 80 & score <90) {
            System.out.println('B');
        } else if (score >= 90 & score <100){
            System.out.println('A');
        }else {
            System.out.println("输入的分数有误");
        }
    }
}
