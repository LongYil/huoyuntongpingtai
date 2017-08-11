package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.JbyhDaoImpl;
import cn.lyl.ssm.po.Jbyh;

@Transactional
@Service(value="jbyhServc")
public class JbyhServc extends CommonSevc<Jbyh,JbyhDaoImpl> {

	@Override
	public void save(Jbyh arg) {
		daoImpl.save(arg);
	}
	
	public int login(Jbyh jbyh){
		return daoImpl.login(jbyh);
	}
	@Override
	public Jbyh find(String arg) {
		
		return null;
	}

	@Override
	public List<Jbyh> findAll(String arg) {
		
		return null;
	}

	@Override
	public void delete(Jbyh arg) {
		
		
	}

}
