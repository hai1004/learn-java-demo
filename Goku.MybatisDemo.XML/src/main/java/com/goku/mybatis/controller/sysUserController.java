package com.goku.mybatis.controller;

/**
 * Created by nbfujx on 2017/10/15.
 */
public interface sysUserController {
    String getUserPassword();//(String orgid, Integer pageNo, Integer pageSize, String orderSort, String orderFiled);
    String  selectByid(String id);
}
