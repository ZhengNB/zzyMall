package com.ruby.zzymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruby.zzymall.common.utils.PageUtils;
import com.ruby.zzymall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author zhengzhiyong
 * @email 1157417334@qq.com
 * @date 2021-07-07 22:45:44
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

