package cn.echo.objects;

import java.math.BigDecimal;

/**
 * @ClassName : DecimalUtil
 * @Author : Jiangnan
 * @Date: 2020/10/21 19:23
 * @Description : 大数据类
 **/
public class DecimalUtil {

    public static void main(String[] args) {
        DecimalUtil d = new DecimalUtil();
        System.out.println(d.add(1.2, 1.2));
        System.out.println(d.sub(2.7923, 2.7922));
        System.out.println(d.multi(1.25, 8));
        System.out.println(d.div(2, 3, 6));
    }

    /**
     * 加法
     * @param n1    参数1
     * @param n2    参数2
     * @return      相加结果
     */
    public double add(double n1, double n2) {
        BigDecimal b1 = BigDecimal.valueOf(n1);
        BigDecimal b2 = BigDecimal.valueOf(n2);
        return b1.add(b2).doubleValue();
    }

    /**
     * 减法
     * @param n1    参数1
     * @param n2    参数2
     * @return      相减结果
     */
    public double sub(double n1, double n2) {
        BigDecimal b1 = BigDecimal.valueOf(n1);
        BigDecimal b2 = BigDecimal.valueOf(n2);
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 乘法
     * @param n1    参数1
     * @param n2    参数2
     * @return      相乘结果
     */
    public double multi(double n1, double n2) {
        BigDecimal b1 = BigDecimal.valueOf(n1);
        BigDecimal b2 = BigDecimal.valueOf(n2);
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 四舍五入算法
     * @param n1
     * @param n2
     * @param scale 保留多少位
     * @return
     */
    public double div(double n1, double n2, int scale) {
        if (scale < 0) {
            throw new RuntimeException("精度不能小于0");
        }
        BigDecimal b1 = BigDecimal.valueOf(n1);
        BigDecimal b2 = BigDecimal.valueOf(n2);
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
