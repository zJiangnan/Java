package cn.echo.operatiion.Ti10_9;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:角色抽象类
 * @Date:2020/10/11-20:15
 */
public abstract class Ti1_Role {
    private String rName;   //姓名
    private int age;        //年龄
    private String sex;     //性别

//    构造方法1
    public Ti1_Role(String rName) {
        this.rName = rName;
    }

//    构造方法2
    public Ti1_Role(String rName, int age, String sex) {
        this.rName = rName;
        this.age = age;
        this.sex = sex;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
//    抽象方法
    public abstract void play();
}
