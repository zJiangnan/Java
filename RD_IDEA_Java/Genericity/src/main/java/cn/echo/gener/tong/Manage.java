package cn.echo.gener.tong;

/**
 * @ClassName : Manage
 * @Author : Jiangnan
 * @Date: 2020/10/23 13:59
 * @Description : 经理类
 **/
public class Manage extends Employee {

    public Manage(String naem) {
        super(naem);
    }

    @Override
    public String toString() {
        return "Manage{" +
                "naem='" + getNaem() + '\'' +
                '}';
    }
}
