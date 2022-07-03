package com.itheima.reggie.common;

/**
 * @Author macbookpro
 * @Date 2022/7/2 18:15
 * @Description:
 * @Version 1.0
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
