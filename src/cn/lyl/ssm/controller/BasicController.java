package cn.lyl.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
//
public abstract class BasicController<T> {
	@Autowired
	public T servc;
}
