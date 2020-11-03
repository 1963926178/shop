package com.zking.ssm.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class User implements Serializable {

    public static interface ValidateGroups{
        public static interface Login{

        }

        public static interface Reg{

        }
    }

    private Integer userId;
    @NotBlank(message = "用户名不能为空",groups = {User.ValidateGroups.Login.class,User.ValidateGroups.Reg.class})
    private String userName;

    @NotBlank(message = "密码不能为空",groups = {User.ValidateGroups.Login.class,User.ValidateGroups.Reg.class})
    private String password;

    @NotBlank(message = "密码不能为空",groups = {User.ValidateGroups.Reg.class})
    private String password2;

}
