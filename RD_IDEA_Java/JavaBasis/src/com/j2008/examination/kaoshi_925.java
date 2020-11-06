package com.j2008.examination;

import java.util.Random;
/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/25-15:59
 */
public class kaoshi_925 {

    public static void main(String[] args) {
        kaoshi_925 k = new kaoshi_925();
        char a[] = new char[4];
        for (int i = 0; i < 4; i++) {
            a[i] = k.str(' ');
            System.out.print(a[i]);
        }
    }
    public char str(char d) {
        Random r = new Random();
        int x = r.nextInt(100);
        int y = r.nextInt(100);
        int z = r.nextInt(100);
        if (x <= 33) {
            d = (char) (r.nextInt(26)+65);
        }else if (y <= 33) {
            d = (char) (r.nextInt(26)+97);
        }else {
            d = (char) (r.nextInt(10)+48);
        }
        return d;
    }
}

