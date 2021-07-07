package com.ruby.zzymall.order.dao;

import com.ruby.zzymall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhengzhiyong
 * @email 1157417334@qq.com
 * @date 2021-07-07 22:25:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
