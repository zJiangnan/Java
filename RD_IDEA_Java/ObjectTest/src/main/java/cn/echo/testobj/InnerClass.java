package cn.echo.testobj;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/19-9:02
 */
public class InnerClass {

    //    内部类
    public static class inner1 {
        public void add() {
            System.out.println("内部类");
        }
    }
    //    内部类
    public abstract static class inner11 {
        abstract void pack();
    }

    //    静态内部类
    static class inner2 {
        public void add() {
            System.out.println("静态内部类");
        }
    }

    public void add1() {
//        方法内部类
        class inner3{
            public void add() {
                System.out.println("方法内部类");
            }
        }
//        实现方法内部类
        inner3 in3 = new inner3();
        in3.add();
    }

    public void add2() {
//        匿名内部类
         new inner11() {

             @Override
             void pack() {
                 System.out.println("匿名内部类");
             }
         }.pack();
    }
}
