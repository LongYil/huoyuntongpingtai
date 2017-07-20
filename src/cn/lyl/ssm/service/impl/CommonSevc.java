package cn.lyl.ssm.service.impl;

import java.util.List;

public abstract class CommonSevc<T> {
	public abstract void save(T arg);
	public abstract T find(String arg);
	public abstract List<T> findAll(String arg);
	public abstract void delete(T arg);
}
