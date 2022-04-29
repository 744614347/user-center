package com.wjj.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author Jie_744614347
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 2935428372287874980L;

    private String userAccount;

    private String  userPassword;


}
