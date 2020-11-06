package cn.echo.operatiion.Ti10_9;

import java.util.Arrays;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:3、数组：一个包含10整数的整型数组，使其前面各数顺序向后移3个位置，最后3个数变成最前面的3个数
 * @Date:2020/10/11-21:00
 */
public class Ti3_Sort {
    public int[] ti3Sort(int[] arr) {
        int[] arrs = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < 7) {
                arrs[3 + i] = arr[i];
            } else if (i >= 7) {
                arrs[j] = arr[i];
                j++;
            }
        }
        return arrs;
    }
}
