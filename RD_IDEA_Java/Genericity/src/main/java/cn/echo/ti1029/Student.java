package cn.echo.ti1029;

/**
 * @ClassName : Student
 * @Author : Jiangnan
 * @Date: 2020/10/29 19:35
 * @Description : 学生类
 **/
public class Student implements Comparable<Student> {
    private Integer sid;
    private String name;
    @Override
    public int compareTo(Student o) {
        return sid.compareTo(o.sid);
    }
    public Student() {
    }

    public Student(Integer sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }

}
