package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.WtrDaoImpl;
import cn.lyl.ssm.po.Wtr;

@Transactional
@Service(value="wtrServc")
public class WtrServc extends CommonSevc<Wtr, WtrDaoImpl> {

	@Override
	public void save(Wtr arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Wtr find(String arg) {
		return daoImpl.find(arg);
	}

	@Override
	public List<Wtr> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Wtr arg) {
		//
	}
	
	public void update(Wtr arg){
		daoImpl.update(arg);
	}

}
