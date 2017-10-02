package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.PtglyDaoImpl;
import cn.lyl.ssm.po.Ptgly;

@Transactional
@Service(value="ptglyServc")
public class PtglyServc extends CommonSevc<Ptgly, PtglyDaoImpl> {

	@Override
	public void save(Ptgly arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Ptgly find(String arg) throws Exception {
		return daoImpl.find(arg);
	}

	@Override
	public List<Ptgly> findAll(String arg) {
		return daoImpl.findAll(arg);
	}

	@Override
	public void delete(Ptgly arg) {
		daoImpl.delete(arg);		
	}
	
	public void update(Ptgly arg) {
		daoImpl.update(arg);
	}
	
	public Ptgly findById(String arg) {
		return daoImpl.findById(arg);
	}
	
	
}
