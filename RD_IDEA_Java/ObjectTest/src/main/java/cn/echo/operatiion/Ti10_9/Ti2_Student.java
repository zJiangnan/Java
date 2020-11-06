package cn.echo.operatiion.Ti10_9;

/**
 * @User:Jiangnan
 * @Author:Jiangnan
 * @Description:
 * @Date:2020/10/11-20:52
 */
public class Ti2_Student implements Ti2_Doctor,Ti2_2_Nurse {
    @Override
    public void injection() {
        System.out.println("护士打针");
    }

    @Override
    public void prescribe() {
        System.out.println("护士开药");
    }

    @Override
    public void seeADoctor() {
        System.out.println("医生看病");
    }

    @Override
    public void study() {
        System.out.println("医生学习");
    }
    public void stuInjection() {
        System.out.println("学生接受打针");
    }
}
