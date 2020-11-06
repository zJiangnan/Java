package cn.echo.Car;

import java.util.Date;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:车辆父类
 * @Date:2020/10/15-10:34
 */
public abstract class Car {

    private String carId;       //车牌号
    private Brand carName;     //车品牌
    private double carPrice;     //车价格
    private Date carEnt;      //进场时间

    public Car() {
    }

    public Car(String carId, Brand carName, double carPrice, Date carEnt) {
        this.carId = carId;
        this.carName = carName;
        this.carPrice = carPrice;
        this.carEnt = carEnt;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Brand getCarName() {
        return carName;
    }

    public void setCarName(Brand carName) {
        this.carName = carName;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public Date getCarEnt() {
        return carEnt;
    }

    public void setCarEnt(Date carEnt) {
        this.carEnt = carEnt;
    }
}
