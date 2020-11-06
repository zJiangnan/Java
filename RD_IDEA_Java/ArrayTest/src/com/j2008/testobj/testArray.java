package com.j2008.testobj;

import java.util.Arrays;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/9/29-11:13
 */
public class testArray {
    /**
     * 入口
     * @param args
     */
    public static void main(String[] args) {
        testArray ta = new testArray();
//        ta.array1();            //添加元素(添加到末尾)
//        ta.array2();            //添加元素(指定位置添加)
//        ta.array3();            //删除元素(指定位置删除)
//        ta.array4();            //修改元素(修改指定下标)
    }

    /* 动态数组案例-添加元素(添加到末尾) */
    public void array1 () {
//        添加元素(添加到末尾)
//        初始化数组
        int [] array = {10,9,8,3,2,1};
        array = addEle(array, 2);
        System.out.println(Arrays.toString(array));

    }
//    添加元素
    public int[] addEle (int[] array, int num) {
//        1、创建临时数组长度
        int [] newArray = new int[array.length + 1];
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

    /* 动态数组案例-添加元素(指定添加) */
    public void array2 () {
        int[] array = {10,9,3,2,1};
        array = addByIndex(array,5,2);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 指定添加下标元素方法的实现
     * @param arr       目标数组
     * @param num       添加的值
     * @param index     添加的下标
     * @return          返回添加后的目标数组的地址
     */
    public int[] addByIndex (int[] arr, int num, int index) {
//        1、创建临时数组
        int[] newarray = new int[arr.length + 1];
//        2、遍历arr
        for (int i = 0; i < arr.length + 1; i++) {//添加元素在arr的基础上+1次遍历
            if(i < index)       //小于index下标就照常给值
                newarray[i] = arr[i];
            else if (i == index) {  //插入新元素
                newarray[i] = num;
            } else                  //将后面的值-1存入临时数组
                newarray[i] = arr[i - 1];
        }
        arr = newarray;
        return arr;
    }

    /* 动态数组案例-删除指定下标 */
    public void array3 () {
        int[] array = {10,9,3,2,1};
        array = delByIndex(array, 4);
        System.out.println(Arrays.toString(array));

    }

    /**
     * 删除指定下标元素方法的实现
     * @param arr   目标数组
     * @param index 下标
     * @return      返回删除后的目标数组的地址
     */
    public int[] delByIndex (int[] arr, int index) {
//        1、创建临时数组
        int[] newarray = new int[arr.length - 1];
//        2、遍历数组
        for (int i = 0; i < arr.length - 1; i++) {//删除元素在arr的基础上-1次遍历
            if (i < index)          //如果小于就将数组一次放入临时数组
                newarray[i] = arr[i];
            else if (i >= index)    //大于等于就将目标数组+1给临时数组
                newarray[i] = arr[i + 1];
        }
        return arr = newarray;
    }

    /* 动态数组案例-修改指定下标元素 */
    public void array4 () {
        int[] array = {10,9,3,2,1};
        array = upByIndex(array,5,2);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 修改指定下标元素方法的实现
     * @param arr   目标数组
     * @param num   修改的值
     * @param index 下标
     * @return      返回修改后的目标数组的地址
     */
    public int[] upByIndex (int[] arr, int num, int index) {
//        1、创建临时数组
        int[] newarray = new int[arr.length];
//        2、遍历arr
        for (int i = 0; i < arr.length; i++) {
            if(i < index)       //小于index下标就照常给值
                newarray[i] = arr[i];
            else if (i == index) {  //修改下标
                newarray[i] = num;
            } else                  //大于index下标就照常给值
                newarray[i] = arr[i];
        }
        arr = newarray;
        return arr;
    }

}
