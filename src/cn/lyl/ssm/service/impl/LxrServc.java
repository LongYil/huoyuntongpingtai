package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.LxrDaoImpl;
import cn.lyl.ssm.po.Lxr;

@Transactional
@Service(value="lxrServc")
public class LxrServc extends CommonSevc<Lxr, LxrDaoImpl> {

	@Override
	public void save(Lxr arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Lxr find(String arg) {
		//
		return null;
	}

	@Override
	public List<Lxr> findAll(String arg) {
		return daoImpl.findAll(arg);
	}

	@Override
	public void delete(Lxr arg) {
		//
		
	}

}
