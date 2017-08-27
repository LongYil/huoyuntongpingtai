package cn.lyl.ssm.service.impl;

import java.util.List;

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
	public Ptgly find(String arg) {
		//
		return null;
	}

	@Override
	public List<Ptgly> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Ptgly arg) {
		//
		
	}

}
