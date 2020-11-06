package cn.echo.cloneboject;

/**
 * @ClassName : CloneTest
 * @Author : Jiangnan
 * @Date: 2020/10/21 11:15
 * @Description : 学习对象克隆类
 **/
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
//        浅克隆
        /*CloneStu cs = new CloneStu();
        cs.setName("张三");
        CloneStu cs1 = (CloneStu) cs.clone();
        System.out.println(cs);
        System.out.println(cs1);
        System.out.println(cs.getName());
        System.out.println(cs1.getName());
        CloneStu cs2 = cs1;
        System.out.println(cs2);
        System.out.println(cs2.getName());*/

//        深克隆
        CloneStu cs = new CloneStu();
        cs.setName("王五");
        Address add = new Address();
        add.setaName("翠花儿");
        cs.setAddress(add);
        CloneStu cs2  = (CloneStu) cs.clone();
        System.out.println(cs);
        System.out.println(cs2);
        System.out.println(cs.getName());
        System.out.println(cs2.getName());
        System.out.println(cs.getAddress());
        System.out.println(cs2.getAddress());
        System.out.println(cs.getAddress().getaName());
        System.out.println(cs2.getAddress().getaName());
//        比较地址为false
        System.out.println(cs == cs2);
    }
}
