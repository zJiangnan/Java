package cn.echo.pojo;

import java.io.Serializable;

/**
 * @ClassName : User
 * @Author : Jiangnan
 * @Date: 2020/11/4 19:33
 * @Description : 用户类
 **/
public class User implements Serializable {

    private static final long serialVersionUID = 1;
    private int uid;
    private String uname;
    private String password;
    private int role;

    public User() {
    }

    public User(int uid, String uname, String password, int role) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.role = role;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
