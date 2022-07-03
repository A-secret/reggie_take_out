package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.mapper.DishMapper;
import com.itheima.reggie.service.DishService;
import org.springframework.stereotype.Service;

/**
 * @Author macbookpro
 * @Date 2022/7/2 17:56
 * @Description:
 * @Version 1.0
 */
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper,Dish> implements DishService{
}
