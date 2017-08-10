package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.JnjlDaoImpl;
import cn.lyl.ssm.po.Jnjl;

@Transactional
@Service(value="jnjlServc")
public class JnjlServc extends CommonSevc<Jnjl, JnjlDaoImpl> {

	@Override
	public void save(Jnjl arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Jnjl find(String arg) {
		//
		return null;
	}

	@Override
	public List<Jnjl> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Jnjl arg) {
		//
		
	}

}
