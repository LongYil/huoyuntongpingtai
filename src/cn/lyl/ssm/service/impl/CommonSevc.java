package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class CommonSevc<E,D> {
	@Autowired
	public D daoImpl;
	public abstract void save(E arg);
	public abstract E find(String arg);
	public abstract List<E> findAll(String arg);
	public abstract void delete(E arg);

}
