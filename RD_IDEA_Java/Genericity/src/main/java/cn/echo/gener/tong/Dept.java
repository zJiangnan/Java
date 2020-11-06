package cn.echo.gener.tong;

/**
 * @ClassName : Dept
 * @Author : Jiangnan
 * @Date: 2020/10/23 13:57
 * @Description : 泛型类
 **/
public class Dept<T>{

//    定义两个员工
    private T first;
    private T second;

    public Dept() {
    }

    public Dept(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
