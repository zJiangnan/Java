package cn.echo.cloneboject;

/**
 * @ClassName : Address
 * @Author : Jiangnan
 * @Date: 2020/10/21 11:40
 * @Description : 女朋友类
 **/
public class Address implements Cloneable {
    private String aName;
    public String getaName() {
        return aName;
    }
    public void setaName(String aName) {
        this.aName = aName;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Address add = null;
        add = (Address) super.clone();
        return add;
    }
}
