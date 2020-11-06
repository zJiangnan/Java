package cn.echo.gener;

/**
 * @ClassName : StringGen
 * @Author : Jiangnan
 * @Date: 2020/10/23 11:03
 * @Description : 实现泛型接口
 **/
public class StringGen implements interfaceGen<String> {

    private String name;

    @Override
    public String getValue() {
        return name;
    }

    @Override
    public void setValue(String str) {
        this.name = str;
    }

    @Override
    public String toString() {
        return "StringGen{" +
                "name='" + name + '\'' +
                '}';
    }
}
