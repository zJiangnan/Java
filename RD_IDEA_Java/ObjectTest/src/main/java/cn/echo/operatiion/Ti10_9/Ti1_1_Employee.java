package cn.echo.operatiion.Ti10_9;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:员工类
 * @Date:2020/10/11-20:20
 */
public class Ti1_1_Employee extends Ti1_Role {
    private static int eId;
    private double salary;      //工资

    public Ti1_1_Employee(String rName, double salary) {
        super(rName);
        this.salary = salary;
    }

    public Ti1_1_Employee(String rName, int age, String sex, double salary) {
        super(rName, age, sex);
        this.salary = salary;
    }

    @Override
    public void play() {
        System.out.println("Employee....play....");
    }
    public void finalSing() {
        System.out.println("finalSing....");
    }

    public static int geteId() {
        return eId;
    }

    public static void seteId(int eId) {
        Ti1_1_Employee.eId = eId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
