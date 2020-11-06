package cn.echo.functionalinterfaces;

import java.util.Date;

/**
 * @ClassName : functional
 * @Author : Jiangnan
 * @Date: 2020/10/29 16:01
 * @Description : 函数式接口
 **/
@FunctionalInterface
public interface functional<F, T> {
    T fun(F from);
}
