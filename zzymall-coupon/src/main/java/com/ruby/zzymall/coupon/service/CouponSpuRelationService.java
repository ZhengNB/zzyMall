package com.ruby.zzymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruby.zzymall.common.utils.PageUtils;
import com.ruby.zzymall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author zhengzhiyong
 * @email 1157417334@qq.com
 * @date 2021-07-07 22:43:29
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

