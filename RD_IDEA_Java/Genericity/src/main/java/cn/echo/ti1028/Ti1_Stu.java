package cn.echo.ti1028;

/**
 * @ClassName : Ti1_Stu
 * @Author : Jiangnan
 * @Date: 2020/10/28 19:39
 * @Description : 学生类
 **/
public class Ti1_Stu {
    private String name;
    private String chen;

    public Ti1_Stu() {
    }

    public Ti1_Stu(String name, String chen) {
        this.name = name;
        this.chen = chen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChen() {
        return chen;
    }

    public void setChen(String chen) {
        this.chen = chen;
    }

    @Override
    public String toString() {
        return "Ti1_Stu{" +
                "name='" + name + '\'' +
                ", chen='" + chen + '\'' +
                '}';
    }
}
