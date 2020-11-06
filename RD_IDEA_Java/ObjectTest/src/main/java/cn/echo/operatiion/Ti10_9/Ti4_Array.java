package cn.echo.operatiion.Ti10_9;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/12-8:23
 */
public class Ti4_Array {

    public void array() {
        int [][] arr = new int[5][5];
        //将二维数组的每一位数进行随机赋值
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] =(int)(Math.random()*100);
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int sum = 0;//定义对角线之和
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j || i+j==4){//是对角线元素的条件
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("矩阵对角线的和为："+sum);
    }
}
