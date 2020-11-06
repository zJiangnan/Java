package com.j2008.operatiion;

import java.util.*;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/29-19:48
 */
public class Ti9_2930 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ti9_2930 t = new Ti9_2930();
        System.out.println("====================第一题===================");
//        t.ti1();
//        t.ti11();
        System.out.println("====================第二题===================");
//        t.ti2();
        System.out.println("====================第三题===================");
//        t.ti3();
        System.out.println("====================第四题===================");
//        t.ti4();
        System.out.println("====================第五题===================");
//        t.ti5();
        System.out.println("====================第六题===================");
//        t.ti6();
        System.out.println("====================第七题===================");
//        t.ti7();
        System.out.println("====================第八题===================");
//        System.out.println(t.ti8(8,2));
        System.out.println("====================第九题===================");
//        t.ti9();
        System.out.println("====================第十题===================");
//        t.ti10();
//        System.out.println(t.ti101(6, 3));
    }

    /**
     * 1、打印动态日历
     * 控制台输入 年，月，动态显示 如下图的格式
     * 例如输入2020  9
     * 显示
     * 一   二   三   四  五   六   日
     * 1    2   3   4   5    6
     * 7     8    9   10  11  12  13
     * .....
     * 28    29  30
     */
    /* 实现内部类 */
    public void ti1() {
        ti1Date t = new ti1Date();
        t.ti1();
    }

    /**
     * 实现动态日历的内部类
     */
    public class ti1Date {
        //        以防冲突创建私有属性
        private int year;                   // 年份
        private int month;                  // 月份
        private int days = 0;               // 总天数
        private int week;                   //一个月的一号从星期几开始
        private boolean flase = false;      //判断是否是闰年
        private int monthday;               //要输出的这个月的天数

        /* 动态日历的实现方法 */
        public void ti1() {
//        循环判断年份是否是从1900年开始,月份是否正确
            do {
                System.out.print("请输入年份：");
                year = sc.nextInt();
                System.out.print("\n请输入月份：");
                month = sc.nextInt();
            } while (year < 1900 && (month > 0 && month < 13));

//            天数 % 7 = 输出的月份从星期几开始
            week = sumDays() % 7;
//            获取输出的这个月的总天数
            monthday = ofMonth(month);

            /*            输出日历  */
            System.out.println("\t\t\t" + year + "年 - " + month + "月");
            System.out.println("----------------------------------");
            System.out.println("\t一\t二\t三\t四\t五\t六\t日");
//            初始化星期计数器，如果为7就换行输出日期
            int count = 0;
//            将总天数和7求余得到的余数week就是这个月从星期几开始，前面没有数字的空格代替输出同时星期计数器还是需要自加的
            for (int i = 0; i < week; i++) {
                System.out.print("\t");
                count++;
            }
//            输出日期，i=1表示从一号开始输出，小于等于需要显示的月份的天数
            for (int i = 1; i <= monthday; i++) {
                System.out.print("\t" + i);     //输出输入的月份的日历
                count++;                        //每输出一个数字星期计数器+1
                if (count % 7 == 0)         //如果count被7整除表示已经输出一个星期换下一行输出
                    System.out.println();
            }
            System.out.println("\n----------------------------------");
        }

        /**
         * 计算输入的年月到1900-1的总天数
         *
         * @return 返回1900.1到输入年月的总天数
         */
        public int sumDays() {
//            总天数计算1，计算从1900年一个月到目标年数-1的总天数
//            累加每年的天数
            for (int i = 1900; i < year; i++) {
                days += ofYear(i) ? 366 : 365;     //统计总天数
            }
//            总天数计算2，计算输入的月份到输入的年份1月的天数：
//            此时的计算的是输入的年份从一月到输入月份减1个月的天数，i < month(计算输入的月份前一个月的总天数)
            for (int i = 1; i < month; i++) {
                days += ofMonth(i);
            }
            return days;
        }

        /**
         * 判断是否为闰年-返回值为true为闰年否为平年
         *
         * @param y 待判断的年份
         * @return true表示闰年false表示平年
         */
        public boolean ofYear(int y) {
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)   // true表示闰年
                return true;
            else               // false表示平年
                return false;
        }

        /**
         * 计算月份天数
         *
         * @param m 月份
         * @return 这个月份的天数
         */
        public int ofMonth(int m) {
            switch (m) {
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    return ofYear(year) ? 29 : 28;      //将当前年份拿去调用判断是否是闰年
                default:
                    return 31;
            }
        }

    }

    /* 使用日期类输出---摘自网络 */
    public void ti11() {
        Calendar c = new GregorianCalendar(2020, 11, 7);//任意设置一个时间

        Calendar ca = new GregorianCalendar(c.get(Calendar.YEAR), c.get(Calendar.MONTH), 1);
        Calendar temp = new GregorianCalendar(ca.get(Calendar.YEAR), ca.get(Calendar.MONTH) + 1, 1);


        System.out.println("\t\t" + ca.get(Calendar.YEAR) + "年\t" + (ca.get(Calendar.MONTH) + 1) + "月");
        System.out.println();
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        for (int i = 1; i < ca.get(Calendar.DAY_OF_WEEK); i++)
            System.out.print("\t");
        do {
            if (ca.get(Calendar.DAY_OF_WEEK) == 7)
                System.out.println(ca.get(Calendar.DAY_OF_MONTH) + "\t");
            else
                System.out.print(ca.get(Calendar.DAY_OF_MONTH) + "\t");

            ca.add(Calendar.DAY_OF_MONTH, 1);
        } while (ca.get(Calendar.MONTH) != temp.get(Calendar.MONTH));

    }

    /**
     * 2、有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
     * 如有数组{23,25,36,  67,77,79,89}，然后有数组50来插入在数组中组成一个新的数组
     */
    public void ti2() {
        int[] arr = {23, 25, 36, 67, 77, 79, 89};
        arr = ti21(arr, 50);     //调用末尾插入方法法
        SortA(arr);      //调用写好的排序方法
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 在数组末未插入元素
     *
     * @param array 待插入数组
     * @param num   插入值
     * @return 返回插入完成的数组
     */
    public int[] ti21(int[] array, int num) {
//        1、创建临时数组长度
        int[] newArray = new int[array.length + 1];
//        2、将目标数组的元素，拷贝到临时数组的内存中
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
//        3、将新的元素放入临时数组中去
        newArray[newArray.length - 1] = num;
//        4、将目标数组的地址 指向 临时数组
        array = newArray;           //如果不返回newArray数组的地址会被自动回收
        return array;               //放回这个新的地址就代表这个newArray的数组地址有用就不会被自动回收

    }

    /**
     * 排序 - 升序排序
     *
     * @param arr 待排序数组
     * @return 返回排序完成的数组
     */
    public int[] SortA(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        return arr;
    }

    /**
     * 排序 - 降序排序
     *
     * @param arr 待排序数组
     * @return 返回排序完成数组
     */
    public int[] SortD(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        return arr;
    }

    /**
     * 3、定义一个有10个空间的整型数组，数组中的每个位置存放8-98之间的随机偶数，
     * 输出这个数组中的每个数，再排序，排序后再输出。
     */
    public void ti3() {
        int[] arr = new int[10];        //定义一个10个长度的数组
        Random r = new Random();        //生出随机数对象
        for (int i = 0; i < arr.length; i++) {      //循环10遍
            do {            //先给随机数如果为奇数则成立再次循环赋值直到arr里面的元素都是偶数时跳出嵌套循环
                arr[i] = r.nextInt(90) + 8;
            } while (arr[i] % 2 != 0);
        }
        System.out.println(Arrays.toString(arr));   //输出生成随机偶数的数组
        arr = SortA(arr);                           //调用排序方法排序
        System.out.println(Arrays.toString(arr));   //输出排序好的数组
    }

    /**
     * 4、有数组{12,5,87,97,1,45,71,112,50,80}，将数组的前一半保存到新数组a中，将
     * 后一半保存到新数组b中。
     */
    public void ti4() {
        int arr[] = {12, 5, 87, 97, 1, 45, 71, 112, 50, 80};
//        定义两个原数组一半长度的数组
        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length / 2];
//        将原数组进行循环
        for (int i = 0; i < arr.length; i++) {
//            如果i小于arr1数组长度就将值给arr1里
            if (i < arr1.length) {
                arr1[i] = arr[i];
//                当大于等于(因为数组从0开始所以只有5~9)i时将值给arr2
            } else if (i >= arr2.length) {
                int x = i;
                arr2[x - arr2.length] = arr[i];
            }
        }
//        输出两数组
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    /**
     * 5、定义函数，函数的功能：传入函数一个数组(可以是整型数组、可以是小数型数组、可以是字符数组)
     * ，函数能返回一个降序排序的新数组。(不要改变原数组)
     * 在mian方法中测试该函数。
     */
    public void ti5() {
//        定义三个不同类型的数组
        int[] arrint = {34, 5, 76, 3, 56, 86};
        char[] arrchar = {'d', 'b', 'g', 'a'};
        double[] arrdouble = {3.5, 6.1, 2.6, 8.2, 12.2, 1.9};
//        根据不同的数据类型调用不同的方法进行排序
        arrdouble = ti51(arrdouble);
        System.out.println(Arrays.toString(arrdouble));
    }

    /**
     * 整数降序
     *
     * @param arr 待排序数组
     * @return 返回排序完成的数组
     */
    public int[] ti51(int[] arr) {
        SortD(arr);
        return arr;
    }

    /**
     * 字符降序
     *
     * @param arr 待排序数组
     * @return 返回排序完成的数组
     */
    public char[] ti51(char[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    char t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        return arr;
    }

    /**
     * 浮点数降序
     *
     * @param arr 待排序数组
     * @return 返回排序完成的数组
     */
    public double[] ti51(double[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    double t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        return arr;
    }

    /**
     * 6、定义一个画图的函数，告诉函数需要画图的行数m和列数n及需要的画的字符，函数能画一个
     * m行n列的图形。
     * 在mian方法中测试该函数。
     */
    public void ti6() {
        System.out.println("输入m行、n列及需要画的字符：");
        int m = sc.nextInt();
        int n = sc.nextInt();
        char x = sc.next().charAt(0);   //取第一个字符
        char[] arr = new char[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(x);
            System.out.println("");     //换行
        }
    }

    /**
     * 7、定义一个函数，函数的功能是能在数组中查找指定值的位置。函数需要两个参数，一个是被查找的
     * 数组，一个是需要被查找的数字。函数返回数字的位置。
     * 在mian方法中测试该函数。
     */
    public void ti7() {
        int[] arr = {12, 5, 87, 97, 1, 45, 71, 112, 50, 80};
        int x = ti71(arr, 2);
//        利用三目运算将返回的值和arr.length+1比较大小如果小于就代表找到此值输出这个值
        System.out.println(x < arr.length + 1 ? "你要查找的值在" + x + "的位置上。" : "你要的值未找到！");
    }

    /**
     * 查找数组的某个值的位置
     *
     * @param arr 待查数组
     * @param num 待查值
     * @return
     */
    public int ti71(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
//            利用循环判断数组每个元素是否和待查数据一样如果是返回下标+1就是目标值的位置
            if (arr[i] == num)
                return i + 1;
        }
//        返回这个数组的长度+1代表未找到
        return arr.length + 1;
    }

    /**
     * 8、定义一个函数，函数需要两个参数m、n，的功能是统计从1到m之间有多少个n的倍数的数。
     *
     * @param m
     * @param n 求余的倍数
     * @return 返回结果
     */
    public int ti8(int m, int n) {
        int count = 0;
        for (int i = 1; i < m + 1; i++)
            if (i % n == 0)     //从1到m之间每个数都与n求余等于0就计数
                count++;
        return count;
    }

    /**
     * 9、定义一个函数，函数需要两个参数m、n，函数的功能是输出m和n的最大公约数和最小公倍数。
     * 在main方法中让用户输出两个数，在测试函数。
     */
    public void ti9() {
        System.out.print("输入m、n求最大公约数和最小公倍数：");
        int m = sc.nextInt();
        int n = sc.nextInt();
        ti91(m, n);
    }

    /**
     * 最大公约数和最小公倍数
     *
     * @param m 参数m
     * @param n 参数n
     */
    public void ti91(int m, int n) {
//        判断最大值最小值
        int max = m > n ? m : n;
        int min = m > n ? n : m;
//        求最大公约数：定义i为两个数中最小的，通过循环递减，判断是否能被最大数整除，再嵌套if判断能否被最小数整除
        for (int i = min; i > 0; i--)
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数:" + i);
                break;
            }
//        最小公倍数
        int i = 1;      //控制最大数相乘的值
        int x = 0;      //存储最大数循环乘i++的结果
        do {
            x = max * i;        //将最大数从1开始乘并给x
            i++;
        } while (x % min != 0);     //x能被组小数min整除就说明这个数为最小公倍数
        System.out.println("最小公倍数为：" + x);
    }

    /**
     * 10、100个人围成一圈，假设某个人是第一个人，从他开始报数1、2、3，只要报3的人就出去，
     * 问最后剩下一个人，这个人最开始的位置。
     */
    public void ti10() {
        int[] arr = new int[100];       //创建一个100的数组
        int out = 0;                    //计数器出局
        int count = 0;                  //报数器
        int i = 0;                      //数组下标
        while (out < arr.length - 1) {      //100人-1=99 就是淘汰的人数小于99
             if (arr[i] == 0)
                count++;                   //判断数组元素是否等于0如果＝0就报数
            if (count == 3) {               //报数器等于3相当于报3的人，出局
                arr[i] = 1;         //将出局的人元素改为1
                out++;              //出局一人+1直到出局99人循环结束out从0开始也就是循环99遍
                count = 0;          //重置报数器
            }
            i++;                //人数+1->数组向前移动一位
            if (i == arr.length)
                i = 0;          //如果循环到数组最后将i重置到下标0开始报数
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0)        //循环判断整个数组等于0的那个下标+1就是剩下的人原来的位置
                System.out.println("剩下" + (j + 1));
        }
    }

    /* 递归算法 */
    public int ti101(int n, int m) {
        if (n == 1) return n;
        return (ti101(n - 1, m) + m - 1) % n + 1;
    }

}
