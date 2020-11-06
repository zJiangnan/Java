package cn.echo.ti1102;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName : Ti1
 * @Author : Jiangnan
 * @Date: 2020/11/2 18:52
 * @Description :
 **/
public class Ti {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("FileData/recode.txt");
            int len = 0;
            char[] c = new char[1024];
            String sb = new String();
//            去掉前面的#
            fr.skip(1);
            while ((len = fr.read(c)) != -1) {
                sb = new String(c, 0 ,len);
            }
            System.out.println(sb);
            System.out.println("--------------------------------------");
//            将字符串里的换行去掉
            String s = sb.replaceAll("\r\n", "");
//            再将字符串以空格隔开
            String[] s1 = s.split(" ");
//            输出查看效果
            for (int i = 0; i < s1.length; i++) {
//                i小于7不换行输出
                if (i < 7) {
                    System.out.print(s1[i] + " ");
                }else if(i == 7) {
//                    i等于7换行
                    System.out.println();
                }else {
//                    i大于7换行输出
                    System.out.println(s1[i]);
                }
            }
            System.out.println("------------------------");
            dataAdd(s1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void dataAdd(String [] strs) {
        List<Ti_Data> list = new ArrayList<>();
//        去掉标题
        for (int i = 7, j = 0; i < strs.length; i++, j++) {
            strs[j] = strs[i];
        }
//        字符串数组转成字符串
        String s = "";
        for (String str : strs) {
            s = s + str;
        }
//        以|改开数据
        String[] str = s.split("\\|");

    }
}
