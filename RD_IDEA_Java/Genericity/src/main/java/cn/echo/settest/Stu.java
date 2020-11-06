package cn.echo.settest;

/**
 * @ClassName : SetHashSet
 * @Author : Jiangnan
 * @Date: 2020/10/28 13:45
 * @Description : 哈希set
 **/
public class Stu {
    private int pId;
    private String pName;
    private int pSex;

    public Stu() {
    }

    public Stu(int pId, String pName, int pSex) {
        this.pId = pId;
        this.pName = pName;
        this.pSex = pSex;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpSex() {
        return pSex;
    }

    public void setpSex(int pSex) {
        this.pSex = pSex;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pSex=" + pSex +
                '}';
    }
}
