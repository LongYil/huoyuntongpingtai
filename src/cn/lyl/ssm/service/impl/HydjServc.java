package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.HydjDaoImpl;
import cn.lyl.ssm.po.Hydj;

@Transactional
@Service(value="hydjServc")
public class HydjServc extends CommonSevc<Hydj, HydjDaoImpl> {

	@Override
	public void save(Hydj arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Hydj find(String arg) throws Exception {
		return daoImpl.find(arg);
	}

	@Override
	public List<Hydj> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Hydj arg) {
		daoImpl.save(arg);		
	}

}
