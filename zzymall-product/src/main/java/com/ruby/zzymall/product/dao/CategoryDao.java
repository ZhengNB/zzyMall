package com.ruby.zzymall.product.dao;

import com.ruby.zzymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhengzhiyong
 * @email 1157417334@qq.com
 * @date 2021-07-07 22:48:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
