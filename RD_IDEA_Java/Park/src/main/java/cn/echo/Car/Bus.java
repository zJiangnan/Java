package cn.echo.Car;

import java.util.Date;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:公交车子类
 * @Date:2020/10/15-10:39
 */
public class Bus extends Car {
    private int busload;        //载客量

    public Bus() {
    }

    public Bus(String carId, Brand carName, double carPrice, Date carEnt, int busload) {
        super(carId, carName, carPrice, carEnt);
        this.busload = busload;
    }

    public int getBusload() {
        return busload;
    }

    public void setBusload(int busload) {
        this.busload = busload;
    }
}
