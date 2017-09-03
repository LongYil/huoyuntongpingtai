package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.HydldDaoImpl;
import cn.lyl.ssm.po.Hydld;
import cn.lyl.ssm.utils.GetEntity;

@Transactional
@Service(value="hydldServc")
public class HydldServc extends CommonSevc<Hydld, HydldDaoImpl> {
		
	@Override
	public void save(Hydld arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Hydld find(String arg) throws Exception {
		return daoImpl.find(arg);
	}

	@Override
	public List<Hydld> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Hydld arg) {
		//
		
	}

}
