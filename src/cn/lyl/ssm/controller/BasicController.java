package cn.lyl.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;

import cn.lyl.ssm.utils.GetDateAndTime;
//
public abstract class BasicController<T> {
	@Autowired
	public T servc;
	@Autowired
	public GetDateAndTime getDateAndTime;
}
