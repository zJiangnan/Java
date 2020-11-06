package cn.echo.computer;

import cn.echo.templatemethod.Student;
import cn.echo.templatemethod.Teacher;
import org.junit.Test;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/13-17:02
 */
public class TestTempl {
    @Test
    public void templ() {
        Student stu = new Student();
        stu.presonSchool();
        Teacher t = new Teacher();
        t.presonSchool();
    }
}
