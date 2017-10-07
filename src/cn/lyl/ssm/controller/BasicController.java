package cn.lyl.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;

import cn.lyl.ssm.utils.GetDateAndTime;
import cn.lyl.ssm.utils.Md5Encrypt;
//
public abstract class BasicController<T> {
	@Autowired
	public T servc;
	@Autowired
	public GetDateAndTime getDateAndTime;
	@Autowired
	public Md5Encrypt md5Encrypt;
}
