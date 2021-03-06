package com.bsnbase.sdk.entity.req.fabric;

import com.alibaba.fastjson.annotation.JSONField;
import com.bsnbase.sdk.entity.base.IBody;

import lombok.Data;

/**
 * 用户注册请求参数
 */
@Data
public class ReqUserRegister implements IBody {
	@JSONField(name  = "name")
	String name ;

    @JSONField(name  = "secret")
    String secret;

    @Override
    public String getEncryptionValue() {
        return (this.name == null? "":this.name) +(this.secret==null?"":this.secret);
    }
}
