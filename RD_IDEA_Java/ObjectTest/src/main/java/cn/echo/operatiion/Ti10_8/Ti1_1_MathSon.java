package cn.echo.operatiion.Ti10_8;

import java.util.Arrays;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:数学子类
 * @Date:2020/10/8-18:53
 * 定义一个子类来继承刚刚的数学工具类，在类中在补充一个方法 ：计算n的阶乘
 *     子类中觉得父类中的第三个方法不好，所以重写父类的方法：将四个数排序输出。
 */
public class Ti1_1_MathSon extends Ti1_Mathematics {

    /**
     * 求n的阶乘
     * @param y 参数n
     * @return  返回n的阶乘
     */
    public int factorial(int y) {
        if (y == 1)
            return 1;
        return factorial(y - 1) + factorial1(y);
    }
    public int factorial1(int n) {
        if (n == 1 || n == 0)
            return 1;
        int s = n * factorial1(n - 1);
        return s;
    }

    /**
     * 重写父类的排序方法
     * @param m 参数1
     * @param n 参数2
     * @param x 参数3
     * @param y 参数4
     */
    @Override
    public void max1(int m, int n, int x, int y) {
        int[] arr = {m,n,x,y};
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        System.out.println(Arrays.toString(arr));
    }
}
