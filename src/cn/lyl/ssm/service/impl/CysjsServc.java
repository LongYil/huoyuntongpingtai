package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.CysjsDaoImpl;
import cn.lyl.ssm.po.Cysjs;
import cn.lyl.ssm.vo.CysjsVo;

@Transactional
@Service(value="cysjsServc")
public class CysjsServc extends CommonSevc<Cysjs, CysjsDaoImpl> {

	@Override
	public void save(Cysjs arg) {
		daoImpl.save(arg);
	}

	@Override
	public Cysjs find(String arg) throws Exception {
		return daoImpl.find(arg);
	}

	@Override
	public List<Cysjs> findAll(String arg) {
		return daoImpl.findByCysId(arg);
	}

	@Override
	public void delete(Cysjs arg) {
		//
		
	}

	public List<Cysjs> findByCysId(String arg){
		return daoImpl.findByCysId(arg);
	}
	
	public List<CysjsVo> findAllCysjs(String arg) throws Exception{
		return daoImpl.findAllCysjs(arg);
	}
}
