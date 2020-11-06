package cn.echo.operatiion.Ti10_7;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:动物类
 * @Date:2020/10/7-18:33
 */
public class Ti2_107_Animal {
    /**
     * 2、定义一个动物类，这个类有属性：颜色、名字、年龄
     *     有方法：计算1到它自己年龄之间的和；  咬人的方法:该方法传入一个需要被咬的姓名
     *     然后输出“***被***咬了”
     */
    private String name = "蚂蚁";
    private int age = 2;
    private String color = "黑色";

    public void Bite(String name) {
        System.out.println(name + "被" + this.name + "咬了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ti2_Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
