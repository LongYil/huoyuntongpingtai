package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.CysjsDaoImpl;
import cn.lyl.ssm.po.Cysjs;

@Transactional
@Service(value="cysjsServc")
public class CysjsServc extends CommonSevc<Cysjs, CysjsDaoImpl> {

	@Override
	public void save(Cysjs arg) {
		daoImpl.save(arg);
		
	}

	@Override
	public Cysjs find(String arg) throws Exception {
		//
		return null;
	}

	@Override
	public List<Cysjs> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Cysjs arg) {
		//
		
	}

}
