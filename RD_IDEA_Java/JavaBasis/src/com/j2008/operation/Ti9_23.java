package com.j2008.operation;

public class Ti9_23 {

    /**
     * 入口
     *
     * @param args
     */
    public static void main(String[] args) {
        Ti9_23 t = new Ti9_23();            //创建此类的对象
        System.out.println("================第二题=================");
        t.Ti2();        //第二题
        System.out.println("================第三题=================");
        t.Ti3();        //第三题
        System.out.println("================第四题=================");
        t.Ti4();        //第四题
        System.out.println("================第五题=================");
        t.Ti5();        //第五题
        System.out.println("================第六题=================");
        t.Ti6();        //第六题
        System.out.println("================第七题=================");
        t.Ti7();        //第七题

    }

    /*/2、打印出所有的 "水仙花数"，所谓 "水仙花数 "
 是指一个三位数，
 其各位数字立方和等于该数本身。例如：
 153是一个 "水仙花数 "，
 因为153=1的三次方＋5的三次方＋3的三次方。 */
    public void Ti2() {
        for (int i = 152; i < 1000; i++) {
            int x = i % 10;             //个位
            int y = i % 100 / 10;       //十位
            int z = i % 1000 / 100;     //百位
//            将反推的结果和i进行比较，相等输出此值
            if (i == x * x * x + y * y * y + z * z * z) {
                System.out.println("水仙花水：" + i);
            }
        }
    }

    /* 3、回文数-10000—20000中的所有回文数 */
    public void Ti3() {
        int w = 0;
        System.out.println("回文数:");
        for (int i = 10000; i < 20000; i++) {
            int x = i % 10;             //个位
            int y = i % 100 / 10;       //十位
            int j = i % 10000 / 1000;   //千位
            int k = i / 10000;          //万位
//            个位和万位相等-十位和千位相等就输出此值
            if (x == k && y == j) {
                w++;
                System.out.print(i + "\t\t");
                if (w % 5 == 0)
                    System.out.println();
            }
        }
    }

    /* 4、一个整数，它加上100后是一个完全平方数，
     * 加上168又是一个完全平方数，请问该数是多少？
     * 结果等于156
     *      +100 = 256      -->16
     *      +168 = 324      -->18
     *  */
    public void Ti4() {
        int i = 0;      //加100后的整数
        int j = 0;      //加168后的整数      创建这个两个变量是为了不影响循环控制的值
        int s = 0;      //循环控制
        while (true) {
            i = s + 100;
//            加上100后将计算的完全平方数给x
            int x = (int) Math.sqrt(i);
            j = s + 168;
            int y = (int) Math.sqrt(j);
//            如果x和y的平方同时满足他的它们的值就输出此值并跳出循环
            if (x * x == i && y * y == j) {
                System.out.println(s);
                break;
            }
            s++;        //循环控制
        }
    }

    /* 5、一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 再落下，求它在 第10次落地时，共经过落下多少米？第10次反弹多高？ */
    public void Ti5() {
        double qiu = 100;       //球的高度
        double luo = 100;       //计算落地
        for (int i = 1; i < 11; i++) {
            qiu /= 2;
            luo = luo + qiu;
        }
        System.out.println("第十次高度为：" + qiu);
        System.out.println("共落下 = " + luo);
    }

    /* 6、在你面前有一条长长的阶梯，如果你每步跨 2阶，
     * 那么最后剩1阶，如果你每步跨3阶，那么最后剩2阶，
     * 如果你每步跨5阶，那么最后剩4阶，如果你每步跨6阶，
     * 那么最后剩5阶，只有当你每步跨7阶时，最后才正好走完，
     * 一阶也不剩。请问这条阶梯至少有多少阶？ */
    public void Ti6() {
        int i = 0;
        while (true) {
//            如果这个数和2求余等于1、这个数和3求余等于2、这个数和5求余等于4
//            这个数和6求余等于5和7求余等于0就输出此值，并跳出
            if (i % 2 == 1 && i % 3 == 2 && i % 5 == 4 && i % 6 == 5 && i % 7 == 0) {
                System.out.println("这个数为：" + i);
                break;
            }
            i++;        //循环控制
        }
    }

    /* 7、编程求100~10000满足各位数字之和是5的所有数，以5个数字一行的形式输出。 */
    public void Ti7() {
        int j = 0;      //控制换行
        for (int i = 100; i < 10000; i++) {
            if (i < 1000) {
                int z = i % 10 / 1;     //个位
                int y = i % 100 / 10;   //十位
                int x = i / 100;        //百位
                if (x + y + z == 5) {
                    j++;
                    System.out.print(i + "\t\t");
                    if (j % 5 == 0) {
                        System.out.println();
                    }
                }
            } else {
                int s = i % 10 / 1;       //个位
                int z = i % 100 / 10;     //十位
                int y = i % 1000 / 100;   //百位
                int x = i / 1000;        //千位
                if (x + y + z + s == 5) {
                    j++;
                    System.out.print(i + "\t\t");
                    if (j % 5 == 0) {       //每输出五个换一次行
                        System.out.println();
                    }
                }
            }
        }
    }
}
