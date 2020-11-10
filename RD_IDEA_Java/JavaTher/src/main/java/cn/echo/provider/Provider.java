package cn.echo.provider;

/**
 * @ClassName : Provider
 * @Author : Jiangnan
 * @Date: 2020/11/10 15:54
 * @Description :生产者
 **/
public class Provider implements Runnable {

//    共享区
    Storage s = null;
    public Provider(Storage s) {
        this.s = s;
    }

    @Override
    public void run() {
//        表示手机编号
        int n = 1000;
//        一直生产
        while (true) {
            Mobile m = new Mobile(n);
            s.push(m);
            System.out.println(Thread.currentThread().getName() + "生产了一部手机，编号为---->" + m.getId() + "手机库存：" + s.getSize());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n++;
        }
    }
}
