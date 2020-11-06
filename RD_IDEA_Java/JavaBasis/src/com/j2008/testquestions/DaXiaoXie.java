package com.j2008.testquestions;

import java.util.Scanner;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/20-18:53
 */
public class DaXiaoXie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a;       //创建一个字符数组
        System.out.println("输入一段英文：");
        a = sc.next().toCharArray();//97-122
        for (int i = 0; i < a.length; i++) {        //循环这个输入的数组
            if(a[i] >= 65 && a[i] <= 90){           //如果这个字符是大写将它转小写
                a[i] += 32;
                continue;
            }
            if(a[i] >= 97 && a[i] <= 122){          //如果这个字符是小写转大写
                a[i] -= 32;
                continue;
            }
        }
        for (int i = 0; i < a.length; i++) {        //输出转换后的数组
            System.out.print(a[i]);
        }
    }
}
