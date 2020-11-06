package cn.echo.cloneboject;

/**
 * @ClassName : CloneStu
 * @Author : Jiangnan
 * @Date: 2020/10/21 11:14
 * @Description : 学生类
 **/
public class CloneStu implements Cloneable {
    private String name;
    private Address address;
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        CloneStu stu = null;
        try{
            stu = (CloneStu)super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
//        深度克隆      --将引用对象类型在这里调用并克隆下来
        stu.address = (Address) address.clone();
        return stu;
    }
}
