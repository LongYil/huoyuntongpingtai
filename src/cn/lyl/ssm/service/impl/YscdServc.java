package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.YscdDaoImpl;
import cn.lyl.ssm.po.Yscd;

@Service(value="yscdServc")
@Transactional
public class YscdServc extends CommonSevc<Yscd, YscdDaoImpl> {

	@Override
	public void save(Yscd arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Yscd find(String arg) {

		return null;
	}

	@Override
	public List<Yscd> findAll(String arg) {
		//
		return null;
	}
	public List<Yscd> cysFindAll(String arg){
		return daoImpl.cysFindAll(arg);
	}
	
	@Override
	public void delete(Yscd arg) {
		//
		
	}

}
