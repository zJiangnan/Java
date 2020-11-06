package cn.echo.enums;

/**
 * @ClassName : PROVINCES
 * @Author : Jiangnan
 * @Date: 2020/10/21 13:56
 * @Description : 省份枚举类
 **/
public enum PROVINCES {

//    枚举的值，在初始化枚举值时，通过构造器
    HB("湖北省",0),
    HN("湖南省",1),
    FJ("福建省",2);

//    枚举属性
    private String provinceName;
    private int index;

//    枚举构造器
    private PROVINCES(String provinceName, int index) {
        this.provinceName = provinceName;
        this.index = index;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
