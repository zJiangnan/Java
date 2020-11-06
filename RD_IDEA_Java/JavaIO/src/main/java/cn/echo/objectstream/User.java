package cn.echo.objectstream;

import java.io.Serializable;

/**
 * @ClassName : User
 * @Author : Jiangnan
 * @Date: 2020/11/3 16:30
 * @Description :
 **/
public class User implements Serializable {
//    对于能区分其他类的唯一标识
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String password;

    public User() {
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
