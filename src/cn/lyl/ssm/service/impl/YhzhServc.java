package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.YhzhDaoImpl;
import cn.lyl.ssm.po.Yhzh;

@Transactional
@Service(value="yhzhServc")
public class YhzhServc extends CommonSevc<Yhzh, YhzhDaoImpl> {

	@Override
	public void save(Yhzh arg) {
		daoImpl.save(arg);
	}

	@Override
	public Yhzh find(String arg) throws Exception{
		return daoImpl.find(arg);
	}

	@Override
	public List<Yhzh> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Yhzh arg) {
		//	
	}
	public void update(Yhzh yhzh){
		daoImpl.update(yhzh);
	}
}
