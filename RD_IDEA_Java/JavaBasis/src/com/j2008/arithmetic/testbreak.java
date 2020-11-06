package com.j2008.arithmetic;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/24-10:23
 */
public class testbreak {
    /**
     * 入口
     *
     * @param args
     */
    public static void main(String[] args) {
        testbreak t = new testbreak();
//        t.break1();     //return实例
//        t.xin();        //输出星星
        t.deng();       //输出等腰三角形
    }

    /* break、continue、return的实例 */
    public void break1() {

        System.out.println("break用例");

        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println("i = " + i);
                break;
            }
            System.out.println("程序结束");
        }

        System.out.println("continue用例");
        for (int i = 0; i < 100; i++) {
            if (i > 3) {
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println("return用例");

        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                return;
            }
            System.out.println("i = " + i);
        }
        System.out.println("最后");
    }

    /* 输出五排星星 */
    public void xin() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("☆\t");
            }
            System.out.println();
        }
    }
    public void deng() {
        for (int i = 0; i < 10; i++) {
            for (int k = i; k < 10; k++){
                System.out.print("  ");
            }
            if(i % 2 == 0){
                for (int j = 0; j <= i; j++) {
                    System.out.print("  ☆");
                }
            }
            System.out.println();
        }
    }
}
