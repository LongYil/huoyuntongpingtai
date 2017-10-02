package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.ClxxDaoImpl;
import cn.lyl.ssm.po.Clxx;
import cn.lyl.ssm.vo.ClxxVo;

@Transactional
@Service(value="clxxServc")
public class ClxxServc extends CommonSevc<Clxx, ClxxDaoImpl>{

	@Override
	public void save(Clxx arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Clxx find(String arg) {
		return daoImpl.find(arg);
	}

	@Override
	public List<Clxx> findAll(String arg) {
		//
		return null;
	}
	public Clxx findByCdbh(String arg) throws Exception {
		return daoImpl.findByCdbh(arg);
	}
	
	public String deleteCl(Clxx arg) {
		daoImpl.delete(arg);
		return "true";
	}

	public List<Clxx> findByCdid(String arg) {
		return daoImpl.findByCdid(arg);
	}
	
	public List<ClxxVo> findByYhbh(String arg){
		return daoImpl.findByYhbh(arg);
	}
    
	public List<ClxxVo> findByGlybh(String arg){
		return daoImpl.findByGlybh(arg);
	}
	
	@Override
	public void delete(Clxx arg) {
		//
		
	}
	
	
}
