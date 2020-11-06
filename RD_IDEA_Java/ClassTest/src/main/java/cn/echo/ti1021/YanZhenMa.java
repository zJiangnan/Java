package cn.echo.ti1021;

/**
 * @ClassName : YanZhenMa
 * @Author : Jiangnan
 * @Date: 2020/10/21 15:30
 * @Description : 验证码
 **/
public class YanZhenMa {

    public static void main(String[] args) {
        SuiJi sj = new SuiJi();
        char[] carr = new char[4];
        for (int i = 0; i < carr.length; i++) {
            if(sj.sui() == 0) {
                carr[i] = (char)sj.shuZi();
            } else if(sj.sui() == 1) {
                carr[i] = sj.xiao();
            } else {
                carr[i] = sj.da();
            }
        }
        String ystr = new String(carr);
        System.out.println(ystr);
        System.out.println("输入验证码：");
        String str2 = sj.shuRu();
        System.out.println(sj.biJiao(ystr, str2));
    }
}
