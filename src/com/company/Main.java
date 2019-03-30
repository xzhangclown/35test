package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if(i % 3 == 0 && i % 5 != 0){
                System.out.println(i + "等于3或3的倍数输出的是：" + "Fizz");
            }else if(i % 5 == 0 && i % 3 != 0){
                System.out.println(i + "等于5或5的倍数输出的是：" + "Buzz");
            }else if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + "输出的数字是：" + "FizzBuzz");
            }else{
                System.out.println(i + "输出的数字是：" + i);
            }
        }
    }
}
