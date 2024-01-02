package com.itheima.branch;

import java.util.Scanner;

public class whileDemon01 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5){
            System.out.println("hello,world");
            i++;
        }

        double Peakheight = 8844430;
        double Paperheight = 0.1;
        int count = 0;
        while (Paperheight <= Peakheight){
            Paperheight = Paperheight * 2;
            count++;
        }
        System.out.println(count);

//       int x = 12345;
//       int ge = x % 10;
//       int bai = x / 10 / 10 % 10;
//        System.out.println(bai);

        }
    }

