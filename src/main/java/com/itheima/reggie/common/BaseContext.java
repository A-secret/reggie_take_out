package com.itheima.reggie.common;

/**
 * @Author macbookpro
 * @Date 2022/7/2 15:25
 * @Description: 基于ThreadLocal封装的工具类，用户保存和获取当前登录用户id
 * @Version 1.0
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
