package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.CysDaoImpl;
import cn.lyl.ssm.po.Cys;

@Transactional
@Service(value="cysServc")
public class CysServc extends CommonSevc<Cys, CysDaoImpl> {

	@Override
	public void save(Cys arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Cys find(String arg) {
		//
		return null;
	}

	@Override
	public List<Cys> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Cys arg) {
		//
		
	}

}
