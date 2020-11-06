package cn.echo.gener.tong;

/**
 * @ClassName : Employee
 * @Author : Jiangnan
 * @Date: 2020/10/23 13:58
 * @Description :员工类
 **/
public class Employee {

    private String naem;

    public Employee() {
    }

    public Employee(String naem) {
        this.naem = naem;
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "naem='" + naem + '\'' +
                '}';
    }
}
