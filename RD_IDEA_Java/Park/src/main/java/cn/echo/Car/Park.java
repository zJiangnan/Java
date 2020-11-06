package cn.echo.Car;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:停车场接口类
 * @Date:2020/10/15-10:40
 */
public interface Park {
    /**
     * 进场
     * @param car   进入的什么车辆
     * @return  返回是否有车位信息
     */
    public String inPark(Car car);

    /**
     * 出场
     * @param carId 出场车辆的车牌号
     * @return      返回消费信息
     */
    public String outPark(String carId);

    /**
     * 输出车辆信息
     * @param carId 车牌号
     * @return      返回车辆对象
     */
    public Car show(String carId);

    /**
     * 判断是否有车位
     * @return 返回是否有车位的信息
     */
    public Integer querySeat();

    /**
     * 缴费
     * @param carId 出场车辆的车牌号
     * @return      返回需要缴纳的费用
     */
    public Integer getMoney(String carId);

    /**
     * 统计当前停车场内所有车辆的欠费金额信息
     * @return
     */
    public double getMoney();

    /**
     * 统计停车场内每辆车的信息
     * @return 返回车辆信息
     */
    public String showInfo();
}
