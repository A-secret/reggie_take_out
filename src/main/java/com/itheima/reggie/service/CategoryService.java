package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/**
 * @Author macbookpro
 * @Date 2022/7/2 15:50
 * @Description:
 * @Version 1.0
 */
public interface CategoryService extends IService<Category>{
    public void remove(Long id);
}
