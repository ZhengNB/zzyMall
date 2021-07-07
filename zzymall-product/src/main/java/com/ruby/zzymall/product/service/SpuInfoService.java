package com.ruby.zzymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruby.zzymall.common.utils.PageUtils;
import com.ruby.zzymall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author zhengzhiyong
 * @email 1157417334@qq.com
 * @date 2021-07-07 22:48:44
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

