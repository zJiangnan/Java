package cn.echo.pojo;

/**
 * @ClassName : Office
 * @Author : Jiangnan
 * @Date: 2020/10/30 12:00
 * @Description : 办事处类
 **/
public class Office {
    /**
     * 办事处id
     */
    private Integer oid;
    /**
     * 办公室名
     */
    private String officeName;

    public Office() {
    }

    public Office(Integer oid, String officeName) {
        this.oid = oid;
        this.officeName = officeName;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    @Override
    public String toString() {
        return "Office{" +
                "oid=" + oid +
                ", officeName='" + officeName + '\'' +
                '}';
    }
}
