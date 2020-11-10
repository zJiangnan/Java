package cn.echo.provider;

/**
 * @ClassName : Mobile
 * @Author : Jiangnan
 * @Date: 2020/11/10 15:32
 * @Description : 手机
 **/
public class Mobile {
    private int id;

    public Mobile() {
    }

    public Mobile(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                '}';
    }
}
