package com.ruby.zzymall.order.dao;

import com.ruby.zzymall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zhengzhiyong
 * @email 1157417334@qq.com
 * @date 2021-07-07 22:25:22
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
