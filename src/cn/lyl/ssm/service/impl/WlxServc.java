package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.WlxDaoImpl;
import cn.lyl.ssm.po.Wlx;

@Transactional
@Component(value="wlxServc")
public class WlxServc extends CommonSevc<Wlx, WlxDaoImpl> {

	@Override
	public void save(Wlx arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Wlx find(String arg) {
		//
		return null;
	}

	@Override
	public List<Wlx> findAll(String arg) {
		return daoImpl.findAll(arg);
	}

	@Override
	public void delete(Wlx arg) {
		//
		
	}

}
	