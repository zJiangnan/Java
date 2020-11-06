package cn.echo.Car;

import java.util.Date;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:停车场的实现类
 * @Date:2020/10/15-11:05
 */
@SuppressWarnings("All")
public class ParkImpl implements Park {

    private Car[] cars = null;       //创建一个空数组

    /**
     * 有参构造方法，用于创建数组的大小
     * 由用户决定停车场有多少车位
     *
     * @param length
     */
    public ParkImpl(int length) {
        cars = new Car[length];
    }

    @Override
    public String inPark(Car car) {
        Integer i = this.querySeat();
        String msg = "";
        if (i < 0)
            msg = "车位已满";
        else {
            car.setCarEnt(new Date());
            this.cars[i] = car;
            msg = "你可以进入第" + (i + 1) + "号车位";
        }
        return msg;             //返回是否有车位信息
    }

    @Override
    public String outPark(String carId) {
        String msg = "";
//        根据车牌号获取对应车辆的信息
        Car car = this.show(carId);
        Date date = new Date();
        Long ms = date.getTime() - car.getCarEnt().getTime();
        Long sec = ms / 1000;
        double money = sec * car.getCarPrice();
        msg = carId + "你停留了" + sec + "小时，应缴纳：" + money + "元";
        return msg;
    }

    @Override
    public Car show(String carId) {
        Car car = null;
        for (Car c : this.cars) {
            if (c != null && carId.equals(c.getCarId())) {
                car = c;
                break;
            }
        }
        return car;
    }

    @Override
    public Integer querySeat() {
        Integer index = -1;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null)
                index = i;
            break;
        }
        return index;       //返回找到的车位
    }

    @Override
    public Integer getMoney(String carId) {
        return null;
    }

    @Override
    public double getMoney() {
        double sum = 0L;
        Date date = new Date();
        Long ms = 0L;
        double money = 0L;
        for (Car c : this.cars) {
            if (c != null) {
                ms = date.getTime() - c.getCarEnt().getTime();
                ms /= 1000;
                money = c.getCarPrice() * ms;
                sum += money;
            }
        }
        return sum;
    }

    @Override
    public String showInfo() {
        return null;
    }
}
