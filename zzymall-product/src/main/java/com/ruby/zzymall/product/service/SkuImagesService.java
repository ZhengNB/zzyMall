package com.ruby.zzymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruby.zzymall.common.utils.PageUtils;
import com.ruby.zzymall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author zhengzhiyong
 * @email 1157417334@qq.com
 * @date 2021-07-07 22:48:43
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

