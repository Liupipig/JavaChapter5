package com.itheima.branch;

public class doWhileDemon01 {
    public static void main(String[] args) {
//      while (true){
//          System.out.println("学习");
//      }

//        for (;;){
//            System.out.println("学习");
//        }

        for (int i = 0; i <=5 ; i++) {
            if (i == 3){
                continue;//跳过第三次循环，继续执行下一次循环
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }

        for (int j = 0; j <=5 ; j++) {
            System.out.println("小老虎在吃第" + j + "个包子");
            if (j == 3){
                break;//跳过第三次循环，继续执行下一次循环
            }
        }
    }
}
