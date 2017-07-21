package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.PtyyfDaoImpl;
import cn.lyl.ssm.po.Ptyyf;

@Transactional
@Service(value="ptyyfServc")
public class PtyyfServc extends CommonSevc<Ptyyf, PtyyfDaoImpl> {

	@Override
	public void save(Ptyyf arg) {
		sevc.save(arg);
	}

	@Override
	public Ptyyf find(String arg) {
		//
		return null;
	}

	@Override
	public List<Ptyyf> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Ptyyf arg) {
		//
		
	}

}
