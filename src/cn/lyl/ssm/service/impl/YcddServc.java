package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.YcddDaoImpl;
import cn.lyl.ssm.po.Ycdd;

@Transactional
@Service(value="ycddServc")
public class YcddServc extends CommonSevc<Ycdd, YcddDaoImpl> {

	@Override
	public void save(Ycdd arg) {
		daoImpl.save(arg);
	}

	@Override
	public Ycdd find(String arg) throws Exception {
		return daoImpl.find(arg);
	}

	@Override
	public List<Ycdd> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Ycdd arg) {
		//
		
	}
	
	public void update(Ycdd arg) {
		daoImpl.save(arg);
	}
	
	

}
