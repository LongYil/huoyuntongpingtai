package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.JbyhDaoImpl;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Jbyh;

@Transactional
@Service(value="jbyhServc")
public class JbyhServc extends CommonSevc<Jbyh,JbyhDaoImpl> {

	@Override
	public void save(Jbyh arg) {
		daoImpl.save(arg);
	}
	
	public int[] login(Jbyh jbyh){
		return daoImpl.login(jbyh);
	}
	
	@Override
	public Jbyh find(String arg) {
		return daoImpl.find(arg);
	}

	@Override
	public List<Jbyh> findAll(String arg) {
		return null;
	}
	public List<Jbyh> findAllGly(List<Cysgly> list){
		return daoImpl.findAll(list);
	}
	
	@Override
	public void delete(Jbyh arg) {
		daoImpl.delete(arg);
	}
	public void update(Jbyh arg){
		daoImpl.update(arg);
	}
	
	public List<Jbyh> getJbyhByHygly(List<Hygly> arg){
		return daoImpl.getJbyhByHygly(arg);
	}
}
