package cn.echo.operatiion.Ti10_8;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:数学父类
 * @Date:2020/10/8-18:34
 */
public class Ti1_Mathematics {
    /**
     * 1、定义一个数学工具类，类中有方法：1、计算1到n之间的和
     *                                    2、计算m到n之间的和
     * 				   3、比较m、n、i、j四个整数，输出较大一个数
     *     定义一个子类来继承刚刚的数学工具类，在类中在补充一个方法 ：计算n的阶乘
     *     子类中觉得父类中的第三个方法不好，所以重写父类的方法：将四个数排序输出。
     */
    /**
     * 1~n的和
     * @param n 输入的值
     */
    public void sumHe1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println("1~n之间的和为：" + sum);
    }

    /**
     * 计算m~n之间的和
     * @param m 参数1
     * @param n 参数2
     */
    public void sumHe2(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++)
            sum += i;
        System.out.println("m~n之间的和：" + sum);
    }

    /**
     * 比较m、n、i、j中最大的数
     */
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
        System.out.println("最大数" + arr[arr.length - 1]);
    }

}
