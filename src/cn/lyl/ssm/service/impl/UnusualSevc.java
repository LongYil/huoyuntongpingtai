package cn.lyl.ssm.service.impl;

import java.util.List;

public abstract class UnusualSevc<T,P> {
	public abstract void save(T arg1,P arg2);
	public abstract void delete(T arg1);
	public abstract T find(String arg);
	public abstract List<T> findAll(String arg);
}
