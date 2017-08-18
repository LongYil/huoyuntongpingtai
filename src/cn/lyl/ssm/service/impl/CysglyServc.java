package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.CysglyDaoImpl;
import cn.lyl.ssm.po.Cysgly;

@Transactional
@Service(value="cysglyServc")
public class CysglyServc extends CommonSevc<Cysgly, CysglyDaoImpl> {

	@Override
	public void save(Cysgly arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Cysgly find(String arg) {
		return daoImpl.find(arg);
	}

	@Override
	public List<Cysgly> findAll(String arg) {
		return daoImpl.findAll(arg);
	}

	@Override
	public void delete(Cysgly arg) {
		//
		
	}
	public void update(Cysgly arg){
		daoImpl.update(arg);
	}

}
