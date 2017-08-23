package cn.lyl.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.YscdDaoImpl;
import cn.lyl.ssm.po.Yscd;

@Service(value="yscdServc")
@Transactional
public class YscdServc extends CommonSevc<Yscd, YscdDaoImpl> {
	
	private List<Yscd> listcd = new ArrayList<Yscd>();
	private Yscd yscd;
	
	@Override
	public void save(Yscd arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Yscd find(String arg) {

		return null;
	}

	@Override
	public List<Yscd> findAll(String arg) {
		//
		return null;
	}
	public List<Yscd> cysFindAll(String arg){
		return daoImpl.cysFindAll(arg);
	}
	public List<Yscd> jbyhFindAll(String arg){
		return daoImpl.jbyhFindAll(arg);
	}
	@Override
	public void delete(Yscd arg) {
		//	
	}
	
	public List<Yscd> cysFindByGlyid(String arg){
		return daoImpl.cysFindByGlyid(arg);
	}
	
	public void jbyhAddCdToGly(String[] arg1,String arg2) throws Exception{
		listcd.clear();
		for(int i=0;i<arg1.length;i++){
			yscd = daoImpl.find(arg1[i]);
			listcd.add(yscd);
		}
		daoImpl.jbyhAddCdToGly(listcd,arg2);
	}
	
}
