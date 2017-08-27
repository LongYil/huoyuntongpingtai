package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.DdDaoImpl;
import cn.lyl.ssm.po.Dd;

@Transactional
@Service(value="ddServc")
public class DdServc extends CommonSevc<Dd,DdDaoImpl> {

	@Override
	public void save(Dd arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Dd find(String arg) {
		//
		return null;
	}

	@Override
	public List<Dd> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Dd arg) {
		//
		
	}

}
