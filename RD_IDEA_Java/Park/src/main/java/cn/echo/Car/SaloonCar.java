package cn.echo.Car;

import java.util.Date;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:轿车子类
 * @Date:2020/10/15-10:37
 */
public class SaloonCar extends Car {
    private double displacement;        //排量

    public SaloonCar() {
    }

    public SaloonCar(String carId, Brand carName, double carPrice, Date carEnt, double displacement) {
        super(carId, carName, carPrice, carEnt);
        this.displacement = displacement;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
}
