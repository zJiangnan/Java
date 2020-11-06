package cn.echo.operatiion.Ti10_7;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:运动员类
 * @Date:2020/10/7-18:17
 */
public class Ti1_107_athlete {
    /**
     * 1、定义一个运动员类，这个类中有属性：运动名称、姓名、性别、身高、体重。
     *    有方法：吃饭的方法(该方法的作用是使自己的体重加1)；跑步的方法(该方法的作用
     *     是使自己的体重减1)；说话的方法(该方法的作用是说出自己的详细信息
     */
    private String name = "跑步";
    private String nameId = "张三";
    private String sex = "男";
    private double height = 170;
    private int weight = 120;

    /**
     * 吃饭方法
     */
    public void eat() {
        weight +=1;
        System.out.println(nameId + "正在吃饭");
    }

    /**
     * 运动的方法
     */
    public void run() {
        weight -= 1;
        System.out.println(nameId + "正在" + name);
    }

//    Get和Set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ti1_athlete{" +
                "name='" + name + '\'' +
                ", nameId='" + nameId + '\'' +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
