package cn.echo.operatiion.Ti10_9;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:经理类
 * @Date:2020/10/11-20:26
 */
public class Ti1_2_Manager extends Ti1_1_Employee {

    private final int age = 18;

    public Ti1_2_Manager(String rName, double salary) {
        super(rName, salary);
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
