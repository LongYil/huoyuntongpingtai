package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.HyglyDaoImpl;
import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Hygly;

@Transactional
@Service(value="hyglyServc")
public class HyglyServc extends CommonSevc<Hygly, HyglyDaoImpl> {

	@Override
	public void save(Hygly arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Hygly find(String arg) throws Exception {
		return daoImpl.find(arg);
	}

	@Override
	public List<Hygly> findAll(String arg) {
		return daoImpl.findAll();
	}

	@Override
	public void delete(Hygly arg) {
		//
	}
	
	public List<Hygly> findByYhbh(String arg){
		return daoImpl.findByYhbh(arg);
	}
	
	public List<Hygly> findByShdd(Dd dd){
		return daoImpl.findByShdz(dd);
	}
}
