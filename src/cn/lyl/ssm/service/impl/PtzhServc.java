package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.PtzhDaoImpl;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.utils.GetEntity;

@Transactional
@Service(value="ptzhServc")
public class PtzhServc extends CommonSevc<Ptzh, PtzhDaoImpl> {
	
	@Autowired
	private GetEntity getEntity;
	
	@Override
	public void save(Ptzh arg) {
		daoImpl.save(arg);
	}

	@Override
	public Ptzh find(String arg) throws Exception {
		return (Ptzh) getEntity.getEntity("Ptzh", "yhbh", arg, Ptzh.class);
	}

	@Override
	public List<Ptzh> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Ptzh arg) {
		//
		
	}

}
