package cn.echo.gener;

/**
 * @ClassName : Student
 * @Author : Jiangnan
 * @Date: 2020/10/23 11:06
 * @Description : 学生类
 **/
public class Student {

    private String sName;
    private int sScore;

    public Student() {
    }

    public Student(String sName, int sScore) {
        this.sName = sName;
        this.sScore = sScore;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsScore() {
        return sScore;
    }

    public void setsScore(int sScore) {
        this.sScore = sScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sScore=" + sScore +
                '}';
    }
}
