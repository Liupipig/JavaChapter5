package com.itheima.branch;

public class SwitchDemon03 {
    public static void main(String[] args) {
        //switch的穿透性
        String week = "周三";
        switch (week){
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
            case "周天":
                System.out.println("打游戏");
                break;
        }
    }
}
