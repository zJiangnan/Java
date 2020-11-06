package com.j2008.testquestions;

import java.util.Random;
import java.util.Scanner;

public class Equip {
    public static void main(String[] args) {
//        生成随机数用于装备升级概率
        Random r = new Random();
//        装备升级时的概率
        int sss = (r.nextInt(100)) + 1;
//        装备升级失败时降级的概率
        int s = (r.nextInt(100)) + 1;
        int equip = 0;          //存放装备等级
        boolean rank = true;    //判断装备等级是否输入正确
        Scanner sc = new Scanner(System.in);        //创建扫描器
        System.out.println("请输入装备等级：");
//        死循环直到输入正确的装备等级才跳出循环
        do {
            equip = sc.nextInt();                   //输入需要升级的装备等级
            if (equip > 3 && equip < 10) {
                rank = false;
            } else {
                System.out.println("等级以满或等级低无法升级！！！重新输入：");
            }
        } while (rank);
        switch (equip) {
            case 4:
                if (sss > 30) {
//                    升级成功
                    equip += 1;
                    System.out.println("装备升级成功，装备等级：" + equip);
                } else {
//                    升级失败
                    System.out.println("装备升级失败,装备等级：" + equip);
                }
                break;
            case 5:
                if (sss > 50) {
//                    升级成功
                    equip += 1;
                    System.out.println("装备升级成功，装备等级：" + equip);
                } else {
//                    升级失败
                    if (s > 5) {
                        System.out.println("装备升级失败，且没有受到影响降级，装备等级：" + equip);
                    } else {
//                        升级失败并掉级
                        equip -= 1;
                        System.out.println("装备升级失败，装备受到影响降级，装备等级：" + equip);
                    }
                }
                break;
            case 6:
                if (sss > 65) {
//                    升级成功
                    equip += 1;
                    System.out.println("装备升级成功，装备等级：" + equip);
                } else {
//                    升级失败
                    if (s > 10) {
                        System.out.println("装备升级失败，且没有受到影响降级，装备等级：" + equip);
                    } else {
                        equip -= 1;
                        System.out.println("装备升级失败，装备受到影响降级，装备等级：" + equip);
                    }
                }
                break;
            case 7:
                if (sss > 75) {
//                    升级成功
                    equip += 1;
                    System.out.println("装备升级成功，装备等级：" + equip);
                } else {
//                    升级失败
                    if (s > 20) {
                        System.out.println("装备升级失败，且没有受到影响降级，装备等级：" + equip);
                    } else {
                        equip -= 1;
                        System.out.println("装备升级失败，装备受到影响降级，装备等级：" + equip);
                    }
                }
                break;
            case 8:
                if (sss > 90) {
//                    升级成功
                    equip += 1;
                    System.out.println("装备升级成功，装备等级：" + equip);
                } else {
//                    升级失败
                    if (s > 30) {
                        System.out.println("装备升级失败，且没有受到影响降级，装备等级：" + equip);
                    } else {
                        equip -= 1;
                        System.out.println("装备升级失败，装备受到影响降级，装备等级：" + equip);
                    }
                }
                break;
            case 9:
                if (sss > 95) {
//                    升级成功
                    equip += 1;
                    System.out.println("装备升级成功，装备等级：" + equip);
                } else {
//                    升级失败
                    if (s % 2 == 0) {
                        System.out.println("装备升级失败，且没有受到影响降级，装备等级：" + equip);
                    } else {
                        equip -= 1;
                        System.out.println("装备升级失败，装备受到影响降级，装备等级：" + equip);
                    }
                }
                break;
        }
    }
}
