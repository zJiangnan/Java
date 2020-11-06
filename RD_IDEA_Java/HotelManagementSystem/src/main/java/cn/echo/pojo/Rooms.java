package cn.echo.pojo;

/**
 * @ClassName : Rooms
 * @Author : Jiangnan
 * @Date: 2020/11/5 9:05
 * @Description : 酒店房间类
 **/
public class Rooms {

    private static final long serialVersionUID = -1;
    private int rId;
    private String rName;
    private String rNo;
    private int status;

    public Rooms() {
    }

    public Rooms(int rId, String rName, String rNo, int status) {
        this.rId = rId;
        this.rName = rName;
        this.rNo = rNo;
        this.status = status;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrNo() {
        return rNo;
    }

    public void setrNo(String rNo) {
        this.rNo = rNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", rNo='" + rNo + '\'' +
                ", status=" + status +
                '}';
    }
}
