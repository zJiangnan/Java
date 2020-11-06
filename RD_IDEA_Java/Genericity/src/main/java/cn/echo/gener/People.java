package cn.echo.gener;

/**
 * @ClassName : People
 * @Author : Jiangnan
 * @Date: 2020/10/23 9:51
 * @Description : 泛型类
 **/
public class People<T> {

    private T name;
    private T sex;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getSex() {
        return sex;
    }

    public void setSex(T sex) {
        this.sex = sex;
    }

    /**
     * 泛型构造方法
     * @param naem
     * @param sex
     */
    public People(T naem, T sex) {
        this.name = name;
        this.sex = sex;
    }

    public People() {
    }

    @Override
    public String toString() {
        return "People{" +
                "name=" + name +
                ", sex=" + sex +
                '}';
    }
}
