package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.TxjlDaoImpl;
import cn.lyl.ssm.po.Txjl;

@Transactional
@Service(value="txjlServc")
public class TxjlServc extends CommonSevc<Txjl,TxjlDaoImpl> {

	@Override
	public void save(Txjl arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Txjl find(String arg) {
		//
		return null;
	}

	@Override
	public List<Txjl> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Txjl arg) {
		//
		
	}

}
