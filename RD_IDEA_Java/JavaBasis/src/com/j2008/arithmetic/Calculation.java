package com.j2008.arithmetic;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/22-9:10
 */
public class Calculation {
    /**
     * 程序入口
     *
     * @param ages
     */
    public static void main(String[] ages) {
        Calculation t = new Calculation();
//        t.Test1();        //加减乘除求余
//        t.test2();        //自加、自减
//        t.Compare();      //比较运算符
//        t.eval();         //赋值运算符
//        t.logic();        //逻辑运算符
//        t.binary();       //移位
        t.Ran();          //三目运算符
    }

    /* 加减 */
    public void Test1() {
        int num1 = 100;
        int num2 = 200;
        int sum = num1 + num2;
        int mul = num1 - num2;
        int num3 = -num2;
        System.out.println("两个数相加:" + sum);
        System.out.println("两个数相减：" + mul);
        System.out.println("num:" + num2 + "num3:" + num3);
        System.out.println("num1+num2=" + (num1 + num2));

        /* 乘除 */
        int sum2 = num1 * num2;
//        注意：除数不能为0
        int sum3 = num1 / num2;
        System.out.println(sum3);

        /* 求余 */
        System.out.println(10 % 2);
        System.out.println(1 % 5);

    }

    /* 自加、自减 */
    public void test2() {
        int i = 1;
        i++;
        System.out.println("i：" + i);
        int j = 1;
        ++j;
        System.out.println("j:" + j);

        int a = 1;
        int sum = a++;      //将1给sum后自加
        int sum2 = ++a;     //将自加后的值给sum2
        System.out.println("sum:" + sum);       //sum = 1
        System.out.println("sum2:" + sum2);      //sum2 = 3
        System.out.println("a:" + a);           //a = 3

        int sum3 = a++ + a++;       //sum3 = 3 + 4
        System.out.println("sum3:" + sum3);
        System.out.println("a:" + a);

        int b = 1;
        int s1 = b--;
        int s2 = --b;
        System.out.println("b = " + b);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        int x = 1;
        int y = 2;
        int s3 = x++ + --x * (y-- + ++x);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("s3 = " + s3);

    }
    /* 比较运算符 */
    public void Compare() {
        int a = 1;
        int b = 2;
//        a > b;        //不能单独一行代码进行比较，必须接收结果或输出结果
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        if(a > b){
            System.out.println("成立");
        }else{
            System.out.println("不成立");
        }
    }
    /* 赋值运算符 */
    public void eval(){
        int a = 2;
        a += 2;
        System.out.println(a);      //4
        a -= 3;
        System.out.println(a);      //1
        a *= 2;
        System.out.println(a);      //2
        a /= 4;
        System.out.println(a);      //0
        a += a -= 3;
        System.out.println(a);      //-3
    }

    /* 逻辑运算 */
    public void logic(){
        System.out.println(true & true);    //true
        System.out.println(true & false);   //false
        System.out.println(false & true);   //false
        System.out.println(false & false);  //false

        System.out.println(1 > 0 & 3 > 1);  //true
        System.out.println(1 > 0 && 3 > 1); //true

        System.out.println(true | true);    //true
        System.out.println(true | false);   //true
        System.out.println(false | true);   //true
        System.out.println(false | false);  //false

        System.out.println(true || false);  //true

//        & 和 && 的区别
        int a = 1;
        int b = 2;
        System.out.println(a > b && b++ > 0);   //b++不执行
        System.out.println("b = " + b);     //b = 2
        System.out.println(a > b & b++ > 0);    //b++执行
        System.out.println("b = " + b);     //b = 3

//        | 和 || 的区别
        System.out.println(a >= 1 || a++ < 0);  //a++不执行
        System.out.println("a = " + a);     //a = 1
        System.out.println(a >= 1 | a++ < 0);   //a++执行
        System.out.println("a = " + a);     //a = 2

//        & | 两边可以是数字，而&& || 则不可以
        System.out.println(4 & 5);    //将结果转成二进制比较
        System.out.println(4 | 5);
        /**
         * 4 的二进制   100
         * 5 的二进制   101
         * &           100  再次转成4
         * |           101  再次转成5
         */

//        取反
        System.out.println(! true);     //false
        System.out.println(! false);    //true

    }

    /* 移位 */
    public void binary(){
//        正整数移位
        System.out.println(3 << 2);         //12
        System.out.println(7 >> 2);         //1
//        负整数移位
        System.out.println(-4 << 2);        //-16

    }

    /* 随机数 */
    public void Ran(){
        int n = (int) (Math.random()*100);
        System.out.println(n%2 == 0 ? n + "这个数是偶数" : n + "这个数是奇数");
    }

}
