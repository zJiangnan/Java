package cn.echo.pojo;

/**
 * @ClassName : User
 * @Author : Jiangnan
 * @Date: 2020/10/30 11:54
 * @Description : 用户模块
 **/
public class User {
//    用户ID
    private String uid;
//    账号
    private String username;
//    密码
    private String password;
//    年龄
    private Integer age;
//    角色：role=1管理者、role=0普通用户
    private Integer role;
//    邮箱
    private String email;
//    办事处ID
    private Integer oid;
//    用户状态status=0禁用、status=1启用
    private Integer status;

    public User() {
    }

    public User(String uid, String username, String password, Integer age,
                Integer role, String email, Integer oid, Integer status) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.age = age;
        this.role = role;
        this.email = email;
        this.oid = oid;
        this.status = status;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", role=" + role +
                ", email='" + email + '\'' +
                ", oid=" + oid +
                ", status=" + status +
                '}';
    }
}
