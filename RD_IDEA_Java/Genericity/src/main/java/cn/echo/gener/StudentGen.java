package cn.echo.gener;

/**
 * @ClassName : StudentGen
 * @Author : Jiangnan
 * @Date: 2020/10/23 11:07
 * @Description : 学生类实现泛型接口
 **/
public class StudentGen implements interfaceGen<Student> {

    private Student stu;

    @Override
    public Student getValue() {
        return stu;
    }

    @Override
    public void setValue(Student str) {
        this.stu = str;
    }
}
