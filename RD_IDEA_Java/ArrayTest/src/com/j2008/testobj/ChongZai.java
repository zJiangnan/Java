package com.j2008.testobj;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/28-15:46
 */
public class ChongZai {
    /* 方法的重载 */
    public class zhongzai {         //内部类
        public int add (int a,int b) {
            return 0;
        }
        public int add (long a,int b) {
            return 0;
        }
        public int add (int a,long b) {
            return 0;
        }
        public int add (long a,long b) {
            return 0;
        }
    }
}
