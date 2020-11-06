package cn.echo.ti1102;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName : Ti_Data
 * @Author : Jiangnan
 * @Date: 2020/11/3 10:27
 * @Description :
 **/
public class Ti_Data {
    private String id;
    private String name;
    private String did;
    private int age;
    private String zhan;
    private Date ti;
    private BigDecimal e;

    public Ti_Data() {
    }

    public Ti_Data(String id, String name, String did, int age, String zhan, Date ti, BigDecimal e) {
        this.id = id;
        this.name = name;
        this.did = did;
        this.age = age;
        this.zhan = zhan;
        this.ti = ti;
        this.e = e;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getZhan() {
        return zhan;
    }

    public void setZhan(String zhan) {
        this.zhan = zhan;
    }

    public Date getTi() {
        return ti;
    }

    public void setTi(Date ti) {
        this.ti = ti;
    }

    public BigDecimal getE() {
        return e;
    }

    public void setE(BigDecimal e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Ti_Data{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", did='" + did + '\'' +
                ", age=" + age +
                ", zhan='" + zhan + '\'' +
                ", ti=" + ti +
                ", e=" + e +
                '}';
    }
}
