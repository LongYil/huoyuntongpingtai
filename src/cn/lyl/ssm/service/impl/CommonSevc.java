package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class CommonSevc<T,P> {
	@Autowired
	public P sevc;
	public abstract void save(T arg);
	public abstract T find(String arg);
	public abstract List<T> findAll(String arg);
	public abstract void delete(T arg);
}
