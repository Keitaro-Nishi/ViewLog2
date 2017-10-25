/*
package com.example;

import java.util.ArrayList;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
//import demo.entity.Emp;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class LoginUser extends User {

    private static final long serialVersionUID = 1L;

    // 追加する（テーブルでユーザーのキーとなる値を設定する）
    public String username;

    // 追加する
    public String password;

    // 独自で必要な項目
    public String empNm;

    public LoginUser(Emp emp) {
        super(emp.empNo, emp.password, true, true, true, true, new ArrayList<GrantedAuthority>());
        username = emp.empNo;
        password = emp.password;
        empNm = emp.empNm;
    }
}
*/
