package cn.echo.computer;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:台式机类
 * @Date:2020/10/13-11:10
 */
public class Work implements Computer {
    @Override
    public void add() {
        System.out.println("这是台式机，正在办公。。。");
    }
}
