package cn.echo.objects;

/**
 * ClassName: Student
 * Description:
 * date: 2020/10/20 11:00
 *
 * @author wuyafeng
 * @version 1.0   softeem.com
 */
public class Student {
    private  int id; //学生编号
    private String sname;
    private Integer age;

    public void showInfo(){
        System.out.println( sname +"---"+ age);

    }

    public Student(){

    }
    public Student(int id ,String sname ,int age){
        this.id = id;
        this.sname = sname;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        // 判断类型 是否一致
        if(obj  instanceof  Student){
            // 强转
            Student stu = (Student)obj;
            // 开始比较 id 和 sname
            if(this.id == stu.id &&  this.sname.equals(stu.sname)){
                    return true;
            }
        }
        return false;


    }

    @Override
    public int hashCode() {
        return id;
    }
}
