package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.BzjDaoImpl;
import cn.lyl.ssm.po.Bzj;

@Transactional
@Service(value="bzjServc")
public class BzjServc extends CommonSevc<Bzj, BzjDaoImpl> {

	@Override
	public void save(Bzj arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Bzj find(String arg) {
		//
		return null;
	}

	@Override
	public List<Bzj> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Bzj arg) {
		//
		
	}

}
