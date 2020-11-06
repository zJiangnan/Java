package com.j2008.arithmetic;

import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/23-9:36
 */
public class ifelseswitch {

    /**
     * 入口
     * @param args
     */
    public static void main(String[] args) {
        ifelseswitch t = new ifelseswitch();
//        t.elseIf();     //else if实例
//        t.tao();        //嵌套判断
//        t.testSwitch(); //Switch实例
//        t.switch1();    //计算器
    }

    /**
     * else if实例
     */
    public void elseIf(){
        int n = (int)(Math.random()*90);
        if(n < 18){
            System.out.println("你未成年哦！");
        }else if(n >= 18 && n < 30){
            System.out.println("青少年，你好！");
        }else if(n >= 30 && n < 50){
            System.out.println("老年人！");
        }else if(n >= 50 && n < 70){
            System.out.println("老年人！");
        }else{
            System.out.println("晚年生活！！！");
        }
        System.out.println("n = " + n);
    }

    /**
     * 嵌套判断
     */
    public void tao(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if ( x % 3 == 0){
            System.out.println("可以被3整除");
            int result = x/3;
            if (result % 7 == 0) {
                System.out.println("这个数也可以被7整除");
            }else{
                System.out.println("这个数不能被7整除");
            }
        }else {
            System.out.println("这个数不能被3整除");
            if ( x % 2 == 0) {
                System.out.println("这个数是偶数！");
            }else{
                System.out.println("这个数不是偶数");
            }
        }
    }
    public void testSwitch(){
        int n = (int) (Math.random()*7+1);
        switch (n){
            case 1:
                System.out.println("这里是：" + n);
                break;
            case 2:
                System.out.println("这里是：" + n);
                break;
            case 3:
                System.out.println("这里是：" + n);
                break;
            case 4:
                System.out.println("这里是：" + n);
                break;
            case 5:
                System.out.println("这里是：" + n);
                break;
            case 6:
                System.out.println("这里是：" + n);
                break;
            case 7:
                System.out.println("这里是：" + n);
                break;
        }
    }

    public void switch1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int a = sc.nextInt();
        System.out.println("输入运算符:");
        char x = sc.next().charAt(0);
        System.out.println("输入第二个数：");
        int b = sc.nextInt();

        System.out.print("结果：");
        switch (x){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
