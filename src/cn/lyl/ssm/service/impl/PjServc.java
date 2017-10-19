package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.PjDaoImpl;
import cn.lyl.ssm.po.Pj;

@Transactional
@Service(value="pjServc")
public class PjServc extends CommonSevc<Pj, PjDaoImpl> {

	@Override
	public void save(Pj arg) {
		arg.setPjsj(getDateAndTime.getNowDate());
		daoImpl.save(arg);
	}

	@Override
	public Pj find(String arg) throws Exception {
		//
		return null;
	}

	@Override
	public List<Pj> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Pj arg) {
		//
		
	}

}
