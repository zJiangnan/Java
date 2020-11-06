package cn.echo.operatiion.Ti10_7;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:网络用户类
 * @Date:2020/10/7-19:38
 */
public class Ti6_107_user {
    /**
     * 6、定义一个网络用户类，要处理的信息有用户ID、用户密码、email地址。
     *    在建立类的实例时，把以上三个信息都作为构造函数的参数输入，
     *    其中用户ID和用户密码是必须的，
     *    缺省的email地址是用户ID加上字符串"@gameschool.com"
     *    该类有方法：show（）用来展示信息
     *    在main中测试
     */
    String Id = "abc";
    String password = "我是用户";
    String email = "";

    public void emailBy() {
        this.email = Id + "@gameschool.com";
    }

    public Ti6_107_user(String Id, String password, String email) {
        this.Id = Id;
        this.password = password;
        this.email = email;
        emailBy();
    }
    public Ti6_107_user(String Id, String password) {
        this.Id = Id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Ti6_107_user{" +
                "Id='" + Id + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
