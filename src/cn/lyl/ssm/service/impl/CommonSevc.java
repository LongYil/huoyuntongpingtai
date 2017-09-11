package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.lyl.ssm.po.Jyjl;
import cn.lyl.ssm.utils.GetDateAndTime;

public abstract class CommonSevc<E,D> {
	@Autowired
	public D daoImpl;
	@Autowired
	public Jyjl jyjl;
	@Autowired
	public JyjlServc jyjlServc;
	@Autowired
	public GetDateAndTime getDateAndTime;
	
	public abstract void save(E arg);
	public abstract E find(String arg) throws Exception;
	public abstract List<E> findAll(String arg);
	public abstract void delete(E arg);
	
}
