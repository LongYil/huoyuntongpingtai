package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.CysqxDaoImpl;
import cn.lyl.ssm.po.Cysqx;

@Transactional
@Service(value="cysqxServc")
public class CysqxServc extends CommonSevc<Cysqx, CysqxDaoImpl> {

	@Override
	public void save(Cysqx arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Cysqx find(String arg) throws Exception {
		//
		return null;
	}

	@Override
	public List<Cysqx> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Cysqx arg) {
		//
		
	}

}
